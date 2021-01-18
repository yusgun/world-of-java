/**
 * Classe repr�sentant un personnage
 * @author yusuf
 */
public class Personnage extends Combattant{
	
	/**
	 * Constructeur vide
	 */
	public Personnage() {}

	/**
	 * Constructeur initialisant un personnage 
	 * @param pointDeVie - Point de vie � attribuer au personnage
	 * @param degat - Nombre de d�g�t que le personnage peut envoyer
	 * @param nom - Nom du personnage
	 */
	public Personnage(int pointDeVie, int degat, String nom) {
		super(pointDeVie, degat, nom);
	}

	@Override
	/**
	 * M�thode toString
	 * @return Affichage des attributs du personnage
	 */
	public String toString() {
		return super.toString();
	}
}
