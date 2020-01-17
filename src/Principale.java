
public class Principale {
	
	public static void afficher() {
		Seconde seconde = new Seconde("Voici le chiffre huit:", 8);
		System.out.println(seconde.getPhrase() + seconde.getEntier());
	}

	public static void main(String[] args) {
		afficher();
	}

}
