import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlCUIT cCuit = new ControlCUIT();
		String retornarResultado = "";
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Increse el Cuit");

			String CUIT = teclado.nextLine();

			retornarResultado = cCuit.GestionarCUIT(CUIT);
			System.out.println(retornarResultado);
		} while (cCuit.isErrorFormato()); // Mientras el estado este en true= Hay ERROR pide otro cuit.

		teclado.close();

	}

}
