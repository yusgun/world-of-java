/**
 * Classe représentant un personnage
 * @author yusuf
 */
public class Personnage extends AbstractCombattant {
	
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
		super(pointDeVie, degat, nom);
	}

	@Override
	/**
	 * Méthode toString
	 * @return Affichage des attributs du personnage
	 */
	public String toString() {
		return super.toString();
	}

	@Override
	public void attaquer(ICombattant adversaire) {
		super.attaquer(adversaire);
	}

	@Override
	public void defendre(int degats) {
		super.defendre(degats);
	}
}
