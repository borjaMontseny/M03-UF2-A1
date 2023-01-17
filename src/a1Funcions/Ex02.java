package a1Funcions;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Tamany del vector: ");

		int tamanyArray = sc.nextInt();

		double[] vector = new double[tamanyArray];

		for (int i = 0; i < vector.length; i++) {
			System.out.print("Valor de la posició " + i + ": ");
			vector[i] = sc.nextDouble();
		}

		mostrarFuncions();
		System.out.print("Funció seleccionada: ");
		char funcioSeleccionada = sc.next().toUpperCase().charAt(0);

		switch (funcioSeleccionada) {
		case 'A':
			System.out.println("\n Màxim nombre del vector: " + maximVector(vector));
			break;
		case 'B':
			System.out.println("\n Mínim nombre del vector: " + minimVector(vector));
			break;
		case 'C':
			System.out.println("\n La mitjana del vector és " + mitjanaVector(vector));
			break;
		case 'D':
			System.out.println("Hi han " + posicionsVector(vector) + " posicions sobre la mitjana ("
					+ mitjanaVector(vector) + ")");
			break;

		default:
			break;
		}

		sc.close();

	}

	public static void mostrarFuncions() {
		System.out.println("\nFuncions disponibles:");
		System.out.println("A. Màxim nombre del vector");
		System.out.println("B. Mínim nombre del vector");
		System.out.println("C. Mitjana del vector");
		System.out.println("D. Posicions per sobre de la mitja");
	}

	public static double maximVector(double[] vector) {

		double comodin = vector[0];

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > comodin) {
				comodin = vector[i];
			}
		}

		return comodin;
	}

	public static double minimVector(double[] vector) {

		double comodin = vector[0];

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < comodin) {
				comodin = vector[i];
			}
		}

		return comodin;
	}

	public static double mitjanaVector(double[] vector) {

		double sumaTotal = 0;

		for (int i = 0; i < vector.length; i++) {
			sumaTotal += vector[i];
		}

		double mitjana = sumaTotal / vector.length;

		return mitjana;

	}

	public static int posicionsVector(double[] vector) {

		double mitjana = mitjanaVector(vector);

		int contador = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > mitjana) {
				contador++;
			}
		}

		return contador;

	}
}
