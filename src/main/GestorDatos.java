package main;

public class GestorDatos {

	private static String[][] lista = { { "20569863214", "E" }, { "20570864224", "E" }, { "20571264628", "E" },
			{ "20582275738", "E" }, { "20572465840", "E" }, { "20572666042", "E" }, { "20573867254", "E" },
			{ "20574868264", "E" }, { "20575268668", "E" }, { "20576670082", "E" }, { "20576870284", "E" },
			{ "20577270688", "E" }, { "20577871294", "E" }, { "20578071496", "E" }, { "20578471900", "E" },
			{ "20589282808", "E" }, { "20593286848", "E" }, { "20594387959", "" }, { "20597991595", "" },
			{ "20599693312", "E" }, { "20600293918", "E" } };

	private static int inicio = 0;

	/**
	 * El metodo buscarCuit se encarga de buscar el cuit dentro del listado
	 * ("Matriz" de forma secuencial).
	 * 
	 * Cambia los estados del objeto CUIT. Si es exento o si esta en el listado.
	 *
	 */

	public static void buscarCuit(CUIT objCUIT) {
		// inicio
		for (int i = inicio; i < lista.length; i++) {

			long valorMatriz;

			valorMatriz = Long.parseLong(lista[i][0]);

			if (valorMatriz == objCUIT.getLongCUIT()) {
				objCUIT.setExento(lista[i][1].equals("E"));

				objCUIT.setInexistente(false);

				inicio = i + 1;
				return;
			} else {
				if (valorMatriz > objCUIT.getLongCUIT()) {
					objCUIT.setInexistente(true);

					inicio = i;
					return;
				}
			}
		}

		objCUIT.setInexistente(true);

		inicio = 0;
	}

}
