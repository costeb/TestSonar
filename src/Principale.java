
public class Principale {
	
	public static void afficher() {
		//On instancie un objet Seconde
		Seconde seconde = new Seconde("Voici le chiffre huit:", 8);
		System.out.println(seconde.getPhrase() + seconde.getEntier());
	}

	public static void main(String[] args) {
		//La méthode afficher crée un Seconde et en affiche le contenu
		afficher();
	}

}
