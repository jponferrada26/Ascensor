package ascensor;
public class Puerta {
	private boolean abierta;

	private boolean isAbierta() {
		return abierta;
	}

	private void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	String abrir(){
		setAbierta(true);
		return "Abriendo puerta.";
	}
	
	String cerrar(){
		setAbierta(false);
		return "Cerrando puerta.";
	}
	
}
