package ascensor;
import utiles.DeseaContinuar;
import utiles.Teclado;
public class TestAscensor {

	public static void main(String[] args) {
		int numeroDePlantas = Teclado.leerEntero("Numero de plantas:");
		Ascensor ascensor = new Ascensor(numeroDePlantas);
		int plantaDestino;
		do {
			do {
				plantaDestino = Teclado.leerEntero("Planta destino entre 1 y "+numeroDePlantas);
			} while (plantaDestino > numeroDePlantas || plantaDestino < 1);
			System.out.println(ascensor.viajar(plantaDestino));
		} while (!DeseaContinuar.deseaContinuar("Deseas dejar el ascensor (s/n)"));

	}

}
