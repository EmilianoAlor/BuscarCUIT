
/**
 * Clase CUIT: Clase entidad que el programa usa. el CUIT debe tener formatos: 20123456789 o 20-12345678-9
 */
public class CUIT {
	private String CUIT;
	private long longCUIT=0;
	private boolean errorFormato= true;
	private boolean inexistente = true;
	private boolean exento = false;
	
	
	/**
	 * Constructor con parametro String.
	 * @param cuitIngresado
	 */
	public CUIT(String cuitIngresado)
	{
		CUIT = cuitIngresado;
		
		if (CUIT.length() == 11 || CUIT.length() == 13) {
			// cuit valido. si tiene una longitud de 11 o 13.
			try {
				if (CUIT.length() == 13)
					// se espera un CUIT separado por "-"
					longCUIT = Long.parseLong(CUIT.replace("-", ""));
				else
					longCUIT = Long.parseLong(CUIT);
				
				this.errorFormato = false;
				
			} catch (NumberFormatException e) {
				this.errorFormato = true;
			}
		} else {
			this.errorFormato = true;
		}
		
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}

	public boolean isErrorFormato() {
		return errorFormato;
	}

	public boolean isInexistente() {
		return inexistente;
	}

	public void setInexistente(boolean inexistente) {
		this.inexistente = inexistente;
	}

	public boolean isExento() {
		return exento;
	}

	public void setExento(boolean exento) {
		this.exento = exento;
	}
	
}
