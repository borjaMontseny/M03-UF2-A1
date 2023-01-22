package a1Funcions;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Borja";

		String[] idiomes = { "Castellà", "Català", "Anglès" };

		for (int i = 0; i < idiomes.length; i++) {
			saludar(nom, idiomes[i]);
		}

	}

	public static void saludar(String nom, String idioma) {
		if (idioma == "Castellà") {
			System.out.println("Buenos días " + nom);
		} else if (idioma == "Català") {
			System.out.println("Bon dia " + nom);
		} else if (idioma == "Anglès") {
			System.out.println("Good morning " + nom);
		}
	}

}
