package ascensor;

public class Ascensor {
	private int plantaActual;
	private int numeroPlantas;
	private Puerta puerta = new Puerta();
	Ascensor(int numeroPlantas){
		if(numeroPlantas<2)
			setNumeroPlantas(2);
		else
			setNumeroPlantas(numeroPlantas);
		setPlantaActual(1);
	}
	
	int getPlantaActual() {
		return plantaActual;
	}

	private void setPlantaActual(int plantaActual) {
		this.plantaActual = plantaActual;
	}
	
	private int getNumeroPlantas() {
		return numeroPlantas;
	}
	
	private void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}
	
	private String subir(int plantaDestino){
		String cadena="";
		int plantaARecorrer = plantaDestino - getPlantaActual();
		for (int i = 0; i < plantaARecorrer; i++) {
			setPlantaActual(getPlantaActual()+1);
			cadena+= "\nSubiendo. Planta "+getPlantaActual();
		}
		return cadena;
	}
	
	private String bajar(int plantaDestino) {
		String cadena = "";
		int plantaARecorrer = getPlantaActual() - plantaDestino;
		for (int i = 0; i < plantaARecorrer; i++) {
			setPlantaActual(getPlantaActual() - 1);
			cadena+= "\nBajando. Planta "+getPlantaActual();
		}
		return cadena;
	}
	
	String viajar(int plantaDestino){
		String cadena="";
		cadena += "\n"+puerta.abrir();
		cadena += "\n"+puerta.cerrar();
		if(getPlantaActual()<plantaDestino)
			cadena+=subir(plantaDestino);
		else if(getPlantaActual()>plantaDestino)
			cadena += bajar(plantaDestino);
		else if(getPlantaActual() == plantaDestino)
			cadena+="\n"+"Ya estas en la planta de destino";
		cadena += "\n"+puerta.abrir();
		cadena+="\nEstas en la planta "+ getPlantaActual()+". Destino conseguido.";
		cadena += "\n"+puerta.cerrar();
		return cadena;
	}
	
	
}
