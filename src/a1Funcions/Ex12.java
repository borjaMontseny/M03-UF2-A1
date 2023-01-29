package a1Funcions;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double[] dades = { demanarHora(sc), demanarTemp(sc), demanarPluja(sc) };

		faBonDia(dades);

		sc.close();

	}

	public static double demanarHora(Scanner sc) {

		System.out.print("Introdueix la hora: ");

		double hora = sc.nextDouble();

		return hora;

	}

	public static double demanarTemp(Scanner sc) {

		System.out.print("Introdueix la temperatura: ");

		double temp = sc.nextDouble();

		return temp;

	}

	public static double demanarPluja(Scanner sc) {

		System.out.print("Introdueix quantitat de pluja: ");

		double pluja = sc.nextDouble();

		return pluja;

	}

	public static void faBonDia(double[] dades) {

		// pos0 hora, pos1 temp, pos2 pluja

		if ((dades[0] < 21.00) && (dades[1] > 20.00) && (dades[2] < 0.5)) {
			System.out.println("\nFa bon dia, pots sortir d'excursió!");
		} else {
			System.out.println("\nNo fa bon dia, no pots sortir d'excursió.");
		}

	}

}
