import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Monde {
	
	// Nom
	public static String[] debutNom = {"Ane", "Baleine", "Belette", "Blaireau", "Buffle", "Bison", "Cerf", "Castor", "Chacal", "Chameau"};
	public static String[] finNom = {" mechant", " de feu", " de la mort", " demoniaque", " sarcastique", " satanique", " desespere", " luciferien", " malefique", " diabolique"};
	
	/**
	 * Générer un nom via la saisie de l'utilisateur au clavier
	 * @return nom généré
	 */
	public static String genererNom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Definir le nom: ");
		return scanner.next();
	}
	
	/**
	 * Créer un personnage avec tous ses attributs. 
	 * Demande a l'utilisateur d'entrer le nom du personnage.
	 * retour: une instance de la classe Personnage correctement instancié.
	 * @return le personnage crée
	 */
	public static Personnage personnageFactory(){
	    // Demander a l'utilisateur un nom de personnage
		String nom = genererNom();
		int degat = 2;
		int pointDeVie = 20;
		List<IAttaque> attaques = Arrays.asList(new BasicAttaque("BigBang", "", 2, 30), new BasicAttaque("Kamehameha", "", 4, 65), new BasicAttaque("Genkidama", "", 15, 90));
		Classe classe = new Classe("Classe", attaques);
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'être choisi par l'utilisateur)
		Personnage personnage = new Personnage(pointDeVie, degat, nom, classe);
	    // Retourner l'instance du personnage
		return personnage;
	}
	
	/**
	 * Créer un personnage avec tous ses attributs. 
	 * @return le Monstre crée
	 */
	public static Monstre MonstreFactory() {
	    // Creer un string pour le nom de votre monstre
		String nom = debutNom[Random.randomInt(0, debutNom.length-1)] + finNom[Random.randomInt(0, finNom.length-1)];
		int degat = 2;
		int pointDeVie = 20;
	    // Creer une instance Monstre avec sont constructeur complet
		Monstre monstre = new Monstre(pointDeVie, degat, nom);
	    // retourner le monstre
		return monstre;
	}

	/**
	 * Cette méthode affiche les informations du monde
	 */
	public static void afficherInformations() {
		System.out.println(personnageFactory());
	}
	
	/**
	 * Méthode représentant un combat entre un monstre et un personnage
	 * @param personnage - personnage qui combat
	 * @param monstre - monstre qui combat
	 */
	public static void combat(Personnage personnage, Monstre monstre) {
		// Système de tour : si nombre impair Monstre / si nombre pair Personnage
		System.out.println("-----Debut de partie-----");
		while(personnage.estVivant() && monstre.estVivant()) {
			int i = Random.randomInt(0, 1);
			if(i == 0) { // Au tour du Monstre
				monstre.attaquer(personnage);
			} else { // Au tour du Personnage
				personnage.attaquer(monstre);
			}
		}
		System.out.println("-----Fin de partie-----");
		System.out.println("Score { " + personnage.getNom() +":["+personnage.getPointDeVie()+"] | "+monstre.getNom()+":["+monstre.getPointDeVie()+"] }");
	}
}
