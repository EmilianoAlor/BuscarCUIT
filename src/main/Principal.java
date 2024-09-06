package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		ControlCUIT cCuit = new ControlCUIT();
		Scanner teclado = new Scanner(System.in);
		CUIT objCuit = null;
		String ingreso;

		List<CUIT> listaCuit = new ArrayList<>();

		// Ingresar Multiples CUIT, hasta la palabra procesar.
		do {

			System.out.println("Increse el Cuit");

			ingreso = teclado.nextLine();

			if (!ingreso.equals("procesar")) {
				objCuit = new CUIT(ingreso);
				listaCuit.add(objCuit);
			}
		} while (!ingreso.equals("procesar")); // Mientras el estado este en true= Hay ERROR pide otro cuit.

		teclado.close();

		if (objCuit != null) {
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
