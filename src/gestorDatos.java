
public class gestorDatos {

	private static String[][] lista = {{"20569863214","E"},{"20570864224","E"},{"20571264628","E"},{"20582275738","E"},{"20572465840","E"},{"20572666042","E"},{"20573867254","E"},{"20574868264","E"},{"20575268668","E"},{"20576670082","E"},{"20576870284","E"},{"20577270688","E"},{"20577871294","E"},{"20578071496","E"},{"20578471900","E"},{"20589282808","E"},{"20593286848","E"},{"20594387959",""},{"20597991595",""},{"20599693312","E"},{"20600293918","E"}};
	
	
	/**El metodo buscarCuit se encarga de buscar el cuit dentro del listado ("Matriz" de forma secuencial).
	 * 
	 * @param String cuitABuscar
	 * @return texto con la descripcion si encontro el cuit o no en el listado.
	 */
	public static String BuscarCuit(String cuitABuscar)
	{
		for (int i = 0; i < lista.length; i++) {
			if (lista[i][0].equals(cuitABuscar)) {
				if(lista[i][1].equals("E"))
					return "El CUIT:"+cuitABuscar + " Esta Exento del impuesto";
				else
					return "El CUIT:"+cuitABuscar + " NO esta Exento del impuesto";
			}
		}
		return "CUIT Inexistente en el listado.";
	}
	
}
