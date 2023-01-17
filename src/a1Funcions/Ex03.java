package a1Funcions;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Files de la matriu: ");

		int files = sc.nextInt();

		System.out.print("Columnes de la matriu: ");

		int columnes = sc.nextInt();

		double[][] matriu = new double[files][columnes];

		for (int fil = 0; fil < matriu.length; fil++) {
			for (int col = 0; col < matriu[0].length; col++) {
				System.out.print("Valor de la posició " + fil + "-" + col + ": ");
				matriu[fil][col] = sc.nextDouble();
			}
		}

		mostrarMatriu(matriu);

		mostrarFuncions();

		System.out.print("Funció seleccionada: ");
		char funcioSeleccionada = sc.next().toUpperCase().charAt(0);

		switch (funcioSeleccionada) {
		case 'A':
			System.out.println("\n Màxim nombre de la matriu: " + maximMatriu(matriu));
			break;
		case 'B':
			System.out.println("\n Mínim nombre de la matriu " + minimMatriu(matriu));
			break;
		case 'C':
			System.out.print("\n Valor màxim de una Fila o una Columna? ");
			char opcioSeleccionada = sc.next().toUpperCase().charAt(0);

			if (opcioSeleccionada == 'F') {
				System.out.print("Introdueix la fila en la que vols buscar: ");
				int filaDesitjada = sc.nextInt();

				System.out.println(
						"El valor màxim de la fila " + filaDesitjada + " és: " + maximFila(matriu, filaDesitjada));

			} else if (opcioSeleccionada == 'C') {
				System.out.println("Introdueix la columna en la que vols buscar: ");
				int columnaDesitjada = sc.nextInt();

				System.out.println("El valor màxim de la columna " + columnaDesitjada + " és: "
						+ maximFila(matriu, columnaDesitjada));

			} else {
				System.out.println("ERROR. Reinicia el programa, zopenco");
			}

			break;
		case 'D':
			System.out.print("\nMitjana de una Fila o una Columna? ");
			opcioSeleccionada = sc.next().toUpperCase().charAt(0);

			if (opcioSeleccionada == 'F') {
				System.out.print("Introdueix la fila en la que vols buscar: ");
				int filaDesitjada = sc.nextInt();

				System.out.println(
						"La mitjana de la fila " + filaDesitjada + " és: " + mitjanaFila(matriu, filaDesitjada));

			} else if (opcioSeleccionada == 'C') {
				System.out.println("Introdueix la columna en la que vols buscar: ");
				int columnaDesitjada = sc.nextInt();

				System.out.println("La mitjana de la columna " + columnaDesitjada + " és: "
						+ mitjanaColumna(matriu, columnaDesitjada));

			} else {
				System.out.println("ERROR. Reinicia el programa, zopenco");
			}
			break;

		default:
			break;
		}

		sc.close();

	}

	public static void mostrarFuncions() {
		System.out.println("\nFuncions disponibles:");
		System.out.println("A. Màxim nombre de la matriu");
		System.out.println("B. Mínim nombre de la matriu");
		System.out.println("C. Máxim de la fila o columna");
		System.out.println("D. Mitjana de la fila o columna");
	}

	public static double maximMatriu(double[][] matriu) {

		double valorMaxim = matriu[0][0];

		for (int fil = 0; fil < matriu.length; fil++) {
			for (int col = 0; col < matriu[0].length; col++) {

				if (matriu[fil][col] > valorMaxim) {
					valorMaxim = matriu[fil][col];
				}

			}
		}

		return valorMaxim;

	}

	public static double minimMatriu(double[][] matriu) {

		double valorMinim = matriu[0][0];

		for (int fil = 0; fil < matriu.length; fil++) {
			for (int col = 0; col < matriu[0].length; col++) {

				if (matriu[fil][col] < valorMinim) {
					valorMinim = matriu[fil][col];
				}

			}
		}

		return valorMinim;

	}

	public static double maximFila(double[][] matriu, int numFila) {
		double valorMaxim = Integer.MIN_VALUE;

		for (int col = 0; col < matriu[0].length; col++) {
			if (matriu[numFila][col] >= valorMaxim) {
				valorMaxim = matriu[numFila][col];
			}
		}

		return valorMaxim;
	}

	public static double maximColumna(double[][] matriu, int numColumna) {
		double valorMaxim = Integer.MIN_VALUE;

		for (int fil = 0; fil < matriu[0].length; fil++) {
			if (matriu[fil][numColumna] >= valorMaxim) {
				valorMaxim = matriu[fil][numColumna];
			}
		}

		return valorMaxim;
	}

	public static double mitjanaFila(double[][] matriu, int numFila) {

		double sumaTotal = 0;
		double contador = 0;

		for (int col = 0; col < matriu[0].length; col++) {
			sumaTotal += matriu[numFila][col];
			contador++;
		}

		double mitjana = sumaTotal / contador;

		return mitjana;

	}

	public static double mitjanaColumna(double[][] matriu, int numColumna) {

		double sumaTotal = 0;
		double contador = 0;

		for (int fil = 0; fil < matriu[0].length; fil++) {
			sumaTotal += matriu[fil][numColumna];
			contador++;
		}

		double mitjana = sumaTotal / contador;

		return mitjana;

	}

	public static void mostrarMatriu(double[][] matriu) {
		System.out.println("\n Matriu creada: ");

		for (int i = 0; i < matriu.length; i++) {
			for (int j = 0; j < matriu[0].length; j++) {
				System.out.print(matriu[i][j] + " ");
			}
			System.out.println();
		}
	}

}
