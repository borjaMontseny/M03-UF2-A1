package a1Funcions;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Concatenar vectors

		Scanner sc = new Scanner(System.in);

		int array1[] = crearArray(sc);

		omplirArray(sc, array1);

		ordenarArray(array1);

		int array2[] = crearArray(sc);

		omplirArray(sc, array2);

		ordenarArray(array2);

		int[] array3 = concatenarArray(array1, array2);

		ordenarArray(array3);

		mostrarArray(array3);

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

	public static void ordenarArray(int array[]) {

		// Usamos un bucle anidado
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					// Intercambiamos valores
					int variableauxiliar = array[i];
					array[i] = array[j];
					array[j] = variableauxiliar;

				}
			}
		}
	}

	public static int[] concatenarArray(int[] array1, int[] array2) {

		int tamanyArray3 = array1.length + array1.length;

		int array3[] = new int[tamanyArray3];

		int contadorComodin = 0;

		for (int j = 0; j < array1.length; j++) {
			array3[contadorComodin] = array1[j];
			contadorComodin++;
		}

		for (int j = 0; j < array2.length; j++) {
			array3[contadorComodin] = array2[j];
			contadorComodin++;
		}

		return array3;

	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
