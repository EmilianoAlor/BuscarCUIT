/**
 * Clase que controla el formato del cuit ingresado.
 *
 *Los formatos Correctos son de 11 y 13 con signos de -
 * 		 20123456789 longitud 11
 *		 20-12345678-9 longitud 13 con 2 "-"
 *
 */
public class ControlCUIT {

	//Estado del formato del Cuit Ingresado.
	private boolean errorFormato = true;
	
	/**
	 * 
	 * @param CUIT = Valor de cuit en String
	 * @return Un texto si es:
	 * 			1- Si el formato es incorrecto= "Cuit invalido:"+CUIT
	 * 			2- informa si es encontrado o no en el listado.
	 */
	public String GestionarCUIT(String CUIT) {
		// TODO Auto-generated method stub

		if (CUIT.length() == 11 || CUIT.length() == 13) {
			try {
				if (CUIT.length() == 13)
					Long.parseLong(CUIT.replace("-", ""));
				else
					Long.parseLong(CUIT);
				this.errorFormato = false;
				
				return gestorDatos.BuscarCuit(CUIT.replace("-", ""));
			} catch (NumberFormatException e) {
				this.errorFormato = true;
				return "CUIT Invalido:" + CUIT;
			}
		} else {
			this.errorFormato = true;
			return "CUIT Invalido:" + CUIT;
		}
	}

	/**
	 * Devuelve si el ultimo ingreso de un cuit tuvo un formato erroneo.
	 * @return True / False
	 */
	public boolean isErrorFormato() {
		return errorFormato;
	}

}
