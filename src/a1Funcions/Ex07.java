package a1Funcions;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Nombres primers: Demanar a l'usuari un número "n" i mostrar per pantalla tots
		 * els nombres primers anteriors a "n"
		 */

		System.out.print("Introduce un número: ");

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (esPrimo(numero)) {
			System.out.println("Es número primo");
		} else {
			System.out.println("No es número primo");
		}

		sc.close();

	}

	public static boolean esPrimo(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}

	public static void secuenciaPrima(int numero) {

		for (int i = numero; i < 0; i--) {
			if (esPrimo(i)) {
				System.out.println(i + " ");
			} else {
				System.out.println(" ");
			}
		}

	}

}
