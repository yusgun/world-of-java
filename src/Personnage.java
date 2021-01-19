/**
 * Classe représentant un personnage
 * @author yusuf
 */
public class Personnage extends AbstractCombattant{
	
	private Classe classe;
	
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
	public Personnage(int pointDeVie, int degat, String nom, Classe classe) {
		super(pointDeVie, degat, nom);
		this.classe = classe;
	}

	@Override
	/**
	 * Méthode toString
	 * @return Affichage des attributs du personnage
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * Méthode permettant au personnage d'attaquer son adversaire
	 * @param adversaire - Advseraire à attaquer
	 */
	@Override
	public void attaquer(ICombattant adversaire) {
		int attaque = this.classe.getAttaque().lancerAttaque(this, adversaire);
		adversaire.defendre(attaque);
	}

	/**
	 * Méthode permettant au personnage de défendre
	 */
	@Override
	public void defendre(int degats) {
		super.defendre(degats);
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
}
