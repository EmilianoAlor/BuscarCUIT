package main;

import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		CUIT objCuit = null;
		String ingreso;

		TreeSet<CUIT> listaCuit = new TreeSet<>();

		// Ingresar Multiples CUIT, hasta la palabra procesar.
		do {

			System.out.println("Increse el Cuit");
			
			//20569863214 /20600293916/ 20600293918  /20594387959  / 20600293920
			//20569863214", "E" },20570864223{ "20570864224", "E" }, { "20571264628"
			ingreso = teclado.nextLine();

			if (!ingreso.equals("procesar")) {
				objCuit = new CUIT(ingreso);
				if (!objCuit.isErrorFormato())
					listaCuit.add(objCuit);
			}
		} while (!ingreso.equals("procesar")); // Mientras el estado este en true= Hay ERROR pide otro cuit.

		teclado.close();

		// Muestro por pantalla.
		if (objCuit != null) {
			
			ControlCUIT cCuit = new ControlCUIT();
			cCuit.gestionarCUIT(listaCuit);

			for (CUIT cuit : listaCuit) {
				if (cuit.isErrorFormato())
					System.out.println("CUIT Invalido:" + cuit.getCUIT());
				else {
					if (cuit.isInexistente())
						System.out.println("CUIT Inexistente en el listado." + cuit.getCUIT());
					else {
						if (cuit.isExento())
							System.out.println("El CUIT:" + cuit.getCUIT() + " Esta Exento del impuesto");
						else
							System.out.println("El CUIT:" + cuit.getCUIT() + " NO ESTA Exento del impuesto");
					}
				}
			}

		}

	}

}
