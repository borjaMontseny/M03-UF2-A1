package a1Funcions;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Borja";

		String[] idiomes = { "Castellà", "Català", "Anglès" };

		if (preguntarDia()) {
			System.out.println("Gola");
		}

	}

	public static boolean preguntarDia() {
		System.out.print("Matí o Nit? ");

		boolean esDia = false;

		Scanner sc = new Scanner(System.in);

		char resposta = sc.next().toUpperCase().charAt(0);

		sc.close();

		if (resposta == 'M') {
			esDia = true;
		} else if (resposta == 'N') {
			esDia = false;
		} else {
			System.out.println("Eres tooonto");
		}

		return esDia;

	}

	// public static void

}
