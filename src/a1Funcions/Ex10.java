package a1Funcions;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double[] dadesTriangle = demanarDades(sc);

		// dadesTriangle[0] = base dadesTriangle[1] = altura
		double areaTriangle = calcularAreaTriangle(dadesTriangle);

		System.out.println("\nL'àrea d'aquest triangle és " + areaTriangle);

		sc.close();

	}

	// per demanar dues dades en un sol mètode retornaré un array amb base i altura
	public static double[] demanarDades(Scanner sc) {

		double[] dadesTriangle = new double[2];

		System.out.print("Introdeix Base: ");

		dadesTriangle[0] = sc.nextDouble();

		System.out.print("Introdueix Altura: ");

		dadesTriangle[1] = sc.nextDouble();

		return dadesTriangle;

	}

	public static double calcularAreaTriangle(double[] dadesTriangle) {

		double areaTriangle = dadesTriangle[0] * dadesTriangle[1];

		return areaTriangle;

	}

}
