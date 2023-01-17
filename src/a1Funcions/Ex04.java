package a1Funcions;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarFuncions();

		Scanner sc = new Scanner(System.in);

		char funcioSeleccionada = sc.next().toUpperCase().charAt(0);

		switch (funcioSeleccionada) {
		case 'S':
			System.out.println("SUMA");
			System.out.println("Valor A: ");
			double valorA = sc.nextDouble();

			System.out.println("Valor B: ");
			double valorB = sc.nextDouble();

			System.out.println("\nResultat: " + sumar(valorA, valorB));
			break;
		case 'R':
			System.out.println("RESTA");
			System.out.println("Valor A: ");
			valorA = sc.nextDouble();

			System.out.println("Valor B: ");
			valorB = sc.nextDouble();

			System.out.println("\nResultat: " + restar(valorA, valorB));

			break;
		case 'M':
			System.out.println("MULTIPLICACIÓ");
			System.out.println(multiplicar());
			break;
		case 'D':
			System.out.println("DIVISIÓ");
			System.out.println(dividir());
			break;
		case '0':
			System.out.println("\nPrograma finalitzat");
			break;

		default:
			break;
		}

		sc.close();

	}

	public static void mostrarFuncions() {
		System.out.println("\nCalculadora");
		System.out.println("S. Sumar");
		System.out.println("R. Mínim nombre de la matriu");
		System.out.println("M. Máxim de la fila o columna");
		System.out.println("D. Mitjana de la fila o columna");
		System.out.println("0. Sortir");
		System.out.print("\nOpció seleccionada: ");
	}

	public static double sumar(double valorA, double valorB) {
		double resultat = valorA + valorB;
		return resultat;
	}

	public static double restar(double valorA, double valorB) {
		double resultat = valorA - valorB;
		return resultat;
	}

	public static double multiplicar() {
		System.out.println("Valor A: ");

		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();

		System.out.println("Valor B: ");
		double valorB = sc.nextDouble();

		double resultat = valorA * valorB;

		return resultat;
	}

	public static double dividir() {
		System.out.println("Valor A: ");

		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();

		System.out.println("Valor B: ");
		double valorB = sc.nextDouble();

		double resultat = valorA / valorB;

		return resultat;
	}
}