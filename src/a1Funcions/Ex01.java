package a1Funcions;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Crear una funció que rebi 3 números com a paràmetres i digui el màxim.

		int numMasMayor = numMayor(6, 5, 2);

		System.out.println("El num más mayor es " + numMasMayor);

	}

	public static int numMayor(int a, int b, int c) {

		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;

		} else if (c > a && c > b) {
			return c;
		} else {
			return 0;
		}

	}
}