package main;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		ControlCUIT cCuit = new ControlCUIT();
		Scanner teclado = new Scanner(System.in);
		CUIT objCuit;

		do {

			System.out.println("Increse el Cuit");

			objCuit = new CUIT(teclado.nextLine());

			if (objCuit.isErrorFormato())
				System.out.println("CUIT Invalido:" + objCuit.getCUIT());
			else {
				cCuit.gestionarCUIT(objCuit);

				if (objCuit.isInexistente())
					System.out.println("CUIT Inexistente en el listado." + objCuit.getCUIT());
				else {
					if (objCuit.isExento())
						System.out.println("El CUIT:" + objCuit.getCUIT() + " Esta Exento del impuesto");
					else
						System.out.println("El CUIT:" + objCuit.getCUIT() + " NO ESTA Exento del impuesto");
				}
			}
		} while (objCuit.isErrorFormato()); // Mientras el estado este en true= Hay ERROR pide otro cuit.

		teclado.close();

	}

}
