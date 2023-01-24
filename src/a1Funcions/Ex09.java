package a1Funcions;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double diners = demanarDiners(sc);

		char conversioSeleccionada = demanarConversio(sc);

		switch (conversioSeleccionada) {
		case 'A':
			double dinersED = eurosADolars(diners);
			System.out.println("\n" + diners + "€ = " + dinersED + "$");
			break;

		case 'B':
			double dinersDE = dolarsAEuros(diners);
			System.out.println("\n" + diners + "$ = " + dinersDE + "€");
			break;

		default:
			break;
		}

		sc.close();

	}

	// si el metode demana dades, pasem el teclat per paràmetre
	public static double demanarDiners(Scanner sc) {

		System.out.print("Introdueix els diners: ");
		double diners = sc.nextDouble();

		return diners;

	}

	public static char demanarConversio(Scanner sc) {

		char opcioSeleccionada;

		System.out.println("Que vols fer: ");
		System.out.println("A. Euros a Dòlars");
		System.out.println("B. Dòlars a Euros");
		System.out.print("Opció seleccionada: ");

		opcioSeleccionada = sc.next().toUpperCase().charAt(0);

		return opcioSeleccionada;

	}

	public static double eurosADolars(double diners) {

		double resultat = diners * 1.09;

		return resultat;
	}

	public static double dolarsAEuros(double diners) {
		double resultat = diners * 0.92;

		return resultat;
	}

}
