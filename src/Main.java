import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(personnageFactory());
	}

	
	/**
	 * Cr�er un personnage avec tous ses attributs. 
	 * Demande a l'utilisateur d'entrer le nom du personnage.
	 * retour: une instance de la classe Personnage correctement instanci�.
	 * @return 
	 */
	public static Personnage personnageFactory(){
	    // Demander a l'utilisateur un nom de personnage
		Scanner scanner = new Scanner(System.in);
		System.out.println("Definir le nom du joueur: ");
		String nom = scanner.nextLine();
		int degat = 20;
		int pointDeVie = 30;
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'�tre choisi par l'utilisateur)
		Personnage personnage = new Personnage(pointDeVie, degat, nom);
	    // Retourner l'instance du personnage
		return personnage;
	}
}
