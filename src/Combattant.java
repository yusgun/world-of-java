/**
 * Classe représentant un combattant
 * @author yusuf
 */
public abstract class Combattant {
    // attributs de la classe 
	public int pointDeVie;
	public int degat;
	public String nom;
    
    /**
     * Constructeur vide
     */
    public Combattant() {}
    
    /**
     * Constructeur avec tous les paramètres
	 * @param pointDeVie - Point de vie à attribuer au combattant
	 * @param degat - Nombre de dégât que le combattant peut envoyer
	 * @param nom - Nom du combattant
     */
	public Combattant(int pointDeVie, int degat, String nom) {
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "nom:["+this.nom+"], pointDeVie:["+this.pointDeVie+"], attaque:["+this.degat+"]";
	}
   
}
