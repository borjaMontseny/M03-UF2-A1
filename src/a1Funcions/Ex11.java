package a1Funcions;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = demanarInt(sc);

		esMulitple(num, 2);

		esMulitple(num, 5);

		sc.close();

	}

	public static int demanarInt(Scanner sc) {

		System.out.print("Introdueix un nombre enter: ");

		int num = sc.nextInt();

		return num;

	}

	public static void esMulitple(int num, int numMultiple) {

		if (num % numMultiple == 0) {
			System.out.println(num + " és múltiple de " + numMultiple);
		} else {
			System.out.println(num + " no és múltiple de " + numMultiple);
		}

	}

}
