/**
 * Classe représentant un personnage
 * @author yusuf
 */
public class Personnage {
	// attributs de la classe
	private int pointDeVie;
	private int degat;
	private String nom;
	
	/**
	 * Constructeur vide
	 */
	public Personnage() {}

	/**
	 * Constructeur initialisant un personnage 
	 * @param pointDeVie - Point de vie à attribuer au personnage
	 * @param degat - Nombre de dégât que le personnage peut envoyer
	 * @param nom - Nom du personnage
	 */
	public Personnage(int pointDeVie, int degat, String nom) {
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.nom = nom;
	}

	@Override
	/**
	 * Méthode toString
	 * @return Affichage des attributs du personnage
	 */
	public String toString() {
		return "nom:["+this.nom+"], pointDeVie:["+this.pointDeVie+"], attaque:["+this.degat+"]";
	}
	
	

}
