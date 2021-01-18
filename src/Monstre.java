/**
 * Classe repr�sentant un Monstre
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
	 * Constructeur avec les param�tres de la superclasse
	 * @param pointDeVie - Point de vie du Monstre
	 * @param degat - Point de d�gat du Monstre
	 * @param nom - Nom du Monstre
	 */
	public Monstre(int pointDeVie, int degat, String nom) {
		super(pointDeVie, degat, nom);
	}
	
	/**
	 * M�thode toString
	 * @return Affichage des attributs du monstre
	 */
	public String toString() {
		return super.toString();
	}
}
