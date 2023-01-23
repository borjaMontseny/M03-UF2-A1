package a1Funcions;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Concatenar vectors

		Scanner sc = new Scanner(System.in);

		int array1[] = crearArray(sc);

		omplirArray(sc, array1);

		int array2[] = crearArray(sc);

		omplirArray(sc, array2);

		sc.close();

	}

	public static int[] crearArray(Scanner sc) {

		System.out.print("Num de posicions del array? ");

		int posArray = sc.nextInt();

		int array[] = new int[posArray];

		return array;

	}

	public static void omplirArray(Scanner sc, int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print("Valor de la posició " + i + ": ");
			array[i] = sc.nextInt();
		}

	}

}
