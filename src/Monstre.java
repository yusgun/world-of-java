/**
 * Classe représentant un Monstre
 * @author yusuf
 */
public class Monstre extends Combattant {

	/**
	 * Constructeur vide
	 */
	public Monstre() {
		super();
	}

	/**
	 * Constructeur avec les paramètres de la superclasse
	 * @param pointDeVie - Point de vie du Monstre
	 * @param degat - Point de dégat du Monstre
	 * @param nom - Nom du Monstre
	 */
	public Monstre(int pointDeVie, int degat, String nom) {
		super(pointDeVie, degat, nom);
	}
	
	/**
	 * Méthode toString
	 * @return Affichage des attributs du monstre
	 */
	public String toString() {
		return super.toString();
	}
}
