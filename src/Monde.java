import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Monde {
	
	// attributs
	public static Hashtable<String, Classe> dictionnaires = new Hashtable<String, Classe>() {{ put("saiyen", new Classe("saiyen", Arrays.asList(new BasicAttaque("BigBang", "", 2, 90), new BasicAttaque("Kamehameha", "", 4, 65), new BasicAttaque("Genkidama", "", 15, 20)))); put("terrien", new Classe("terrien", Arrays.asList(new BasicAttaque("Boule de feu", "", 2, 90), new BasicAttaque("Kamehameha", "", 4, 65))));  }};
	public static List<Monstre> monstres = new ArrayList<Monstre>() {{ add(new Monstre(20, 2, "Lockness")); add(new Monstre(20, 2, "Dinosaure")); }};
	public static String[] debutNom = {"Ane", "Baleine", "Belette", "Blaireau", "Buffle", "Bison", "Cerf", "Castor", "Chacal", "Chameau"};
	public static String[] finNom = {" mechant", " de feu", " de la mort", " demoniaque", " sarcastique", " satanique", " desespere", " luciferien", " malefique", " diabolique"};
	
	
	/**
	 * Générer un nom via la saisie de l'utilisateur au clavier
	 * @return nom généré
	 */
	public static String generer(String nom) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Definir "+ nom +": ");
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
		String nom = generer("nom");
		String race = generer("race");
		Classe classe = getClasse(race);
		if(classe == null) {
			return null;
		}
		int degat = 2;
		int pointDeVie = 20;
		List<IAttaque> attaques = Arrays.asList(new BasicAttaque("BigBang", "", 2, 90), new BasicAttaque("Kamehameha", "", 4, 65), new BasicAttaque("Genkidama", "", 15, 20));
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
	
	/**
	 * Permet de récupérer la race du personnage
	 * @param nom - nom de la race
	 * @return element du dictionnaire
	 */
	public static Classe getClasse(String nom) {
		return dictionnaires.get(nom);
	}
	
	/**
	 * Génère un groupe de Monstre
	 * @param nombre de Monstre à créer
	 * @return groupe de monstre crée
	 */
	public List<Monstre> creationGroupeMonstres(int nombre){
		List<Monstre> monstres = new ArrayList<Monstre>();
		for(int i=0; i<nombre; i++) {
			monstres.add(new Monstre(20, 2, "Monstre"+(++i)));
		}
		return monstres;
	}
	
	/**
	 * Génère un groupe de Monstre
	 * @param nombre de Monstre à créer
	 * @return groupe de monstre crée
	 */
	public List<Personnage> creationGroupePersonnages(int nombre){
		List<Personnage> personnages = new ArrayList<Personnage>();
		for(int i=0; i<nombre; i++) {
			int random = Random.randomInt(0, 1);
			String race = (random == 0) ? "saiyen" : "terrien";
			Classe classe = getClasse(race);
			personnages.add(new Personnage(20, 2, "Personnage"+(++i), classe));
		}
		return personnages;
	}
	
	/**
	 * Menu d'affichage avec intéraction
	 */
	public static void genese() {
		int choix = 0;
		boolean goodChoix = false;
		while(!goodChoix) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("---***--- Bonjour/Bonsoir ---***---");
			System.out.println("Choisir une option: ");
			System.out.println("1: Lancer un combat 1vs1");
			System.out.println("2: Lancer un combat de groupe");
			System.out.println("3: One vs World Hardcore Edition");
			System.out.println("4: Informations");
			System.out.println("-----------------------------------");
			System.out.print(">>> ");
			choix = scanner.nextInt();
			if(choix > 0 && choix < 5) {
				goodChoix = true;
			} else {
				System.err.println("Erreur de saisie, veuillez reessayer");
			}
		}
		switch (choix) {
			case 1:
	
				break;
			case 2:
	
				break;
			case 3:
	
				break;
			case 4:
	
				break;
		}
	}
}
