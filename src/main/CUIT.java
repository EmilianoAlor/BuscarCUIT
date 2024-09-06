package main;

import java.util.Objects;

/**
 * Clase CUIT: Clase entidad que el programa usa. el CUIT debe tener formatos:
 * 20123456789 o 20-12345678-9
 */
public class CUIT implements Comparable<CUIT> {
	private String cuitOriginal;
	private long longCUIT = 0;
	private String cuitFormatoBuscar;
	private boolean errorFormato = true;
	private boolean inexistente = true;
	private boolean exento = false;

	/**
	 * Constructor con parametro String.
	 * 
	 * @param cuitIngresado
	 */
	public CUIT(String cuitIngresado) {
		cuitOriginal = cuitIngresado;

		if (cuitOriginal.length() == 11 || cuitOriginal.length() == 13) {
			// cuit valido. si tiene una longitud de 11 o 13.
			try {
				longCUIT = Long.parseLong(cuitOriginal.replace("-", ""));

				if (this.longCUIT > 20000000000L && (longCUIT < 34999999999L)) {
					this.cuitFormatoBuscar = cuitOriginal.replace("-", "");
					this.errorFormato = false;
				} else
					this.errorFormato = true;

			} catch (NumberFormatException e) {
				this.errorFormato = true;
			}
		} else {
			this.errorFormato = true;
		}

	}

	public String getCuitFormatoBuscar() {
		return cuitFormatoBuscar;
	}

	@Override
	public String toString() {
		return "CUIT [CUIT=" + cuitOriginal + ", longCUIT=" + longCUIT + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(longCUIT);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CUIT other = (CUIT) obj;
		return longCUIT == other.longCUIT;
	}

	public long getLongCUIT() {
		return longCUIT;
	}

	public String getCUIT() {
		return cuitOriginal;
	}

	public void setCUIT(String cUIT) {
		cuitOriginal = cUIT;
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

	@Override
	public int compareTo(CUIT o) {
		if (this.longCUIT > o.longCUIT)
			return 1;
		else {
			if (this.longCUIT < o.longCUIT)
				return -1;
		}

		return 0;
	}

}
