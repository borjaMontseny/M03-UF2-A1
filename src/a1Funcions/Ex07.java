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
			System.out.println("Es número primo\n");
		} else {
			System.out.println("No es número primo\n");
		}

		sc.close();

		secuenciaPrima(numero);

	}

	public static boolean esPrimo(int numero) {

		if (numero <= 1) {
			return false;
		}

		int contador = 0;

		// bucle que cuenta los numeros divisibles
		for (int i = (int) Math.sqrt(numero); i > 1; i--) {
			if (numero % i == 0) {
				contador++;
			}
		}

		return contador < 1;
	}

	public static void secuenciaPrima(int numero) {

		System.out.println("Secuencia Prima:");

		// es lo mismo i > 0 que i >= 1 FOR INVERSO
		for (int i = (numero -1); i >= 1; i--) {
			if (esPrimo(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
