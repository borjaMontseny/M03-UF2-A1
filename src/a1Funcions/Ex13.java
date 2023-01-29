package a1Funcions;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		sc.close();

	}

	public static char estudiantOProfe(Scanner sc) {

		System.out.println("Introdueix el teu perfil:");
		System.out.println("E. Estudiant");
		System.out.println("P. Professor");
		System.out.print("Opció seleccionada: ");

		char opcioSeleccionada = sc.next().toUpperCase().charAt(0);

		return opcioSeleccionada;

	}

	public static int demanarEdat(Scanner sc) {

		System.out.print("Introdueix la teva edat: ");

		int edat = sc.nextInt();

		return edat;

	}

}
