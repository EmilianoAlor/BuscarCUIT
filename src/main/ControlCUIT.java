package main;

import java.util.TreeSet;

/**
 * Clase Intermedia.
 *
 * A futuro contendra la logica del negocio.
 * 
 * 
 *
 */
public class ControlCUIT {

	public void gestionarCUIT(TreeSet<CUIT> listaCuit) {

		for (CUIT cuit : listaCuit) {
			
				GestorDatos.buscarCuit(cuit);
		}
			
	}

}
