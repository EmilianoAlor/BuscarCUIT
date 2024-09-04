package main;

public class GestorDatos {
	private static String[][] lista = { { "20569863214", "E" }, { "20570864224", "E" }, { "20571264628", "E" },
			{ "20582275738", "E" }, { "20572465840", "E" }, { "20572666042", "E" }, { "20573867254", "E" },
			{ "20574868264", "E" }, { "20575268668", "E" }, { "20576670082", "E" }, { "20576870284", "E" },
			{ "20577270688", "E" }, { "20577871294", "E" }, { "20578071496", "E" }, { "20578471900", "E" },
			{ "20589282808", "E" }, { "20593286848", "E" }, { "20594387959", "" }, { "20597991595", "" },
			{ "20599693312", "E" }, { "20600293918", "E" } };
	
	/**
	 * El metodo buscarCuit se encarga de buscar el cuit dentro del listado
	 * ("Matriz" de forma secuencial).
	 * 
	 * Cambia los estados del objeto CUIT. Si es exento o si esta en el listado.
	 *
	 */
	
	public static void buscarCuit(CUIT objCUIT) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i][0].equals(objCUIT.getCuitFormatoBuscar())) {
				objCUIT.setExento(lista[i][1].equals("E"));

				break;
			}
		}
		objCUIT.setInexistente(true);
	}

}
