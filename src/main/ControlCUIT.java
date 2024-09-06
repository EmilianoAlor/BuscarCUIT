package main;

import java.util.List;

/**
 * Clase Intermedia.
 *
 * A futuro contendra la logica del negocio.
 * 
 * 
 *
 */
public class ControlCUIT {

	public void gestionarCUIT(List<CUIT> listaCuit) {

		for (CUIT cuit : listaCuit) {
			if(!cuit.isErrorFormato())
				GestorDatos.buscarCuit(cuit);
		}
			
	}

}
