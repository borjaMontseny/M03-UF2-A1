package a1Funcions;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Concatenar vectors

		int array1[] = crearArray();

		omplirArray(array1);

		int array2[] = crearArray();

		omplirArray(array2);
		
		

	}

	public static int[] crearArray() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Num de posicions del array? ");

		int posArray = sc.nextInt();

		int array[] = new int[posArray];

		sc.close();

		return array;

	}

	public static void omplirArray(int[] array) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("Valor de la posició " + i + ": ");
			array[i] = sc.nextInt();
		}

		sc.close();
	}

}
