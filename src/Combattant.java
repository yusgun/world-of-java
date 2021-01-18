/**
 * Classe repr�sentant un combattant
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
     * Constructeur avec tous les param�tres
	 * @param pointDeVie - Point de vie � attribuer au combattant
	 * @param degat - Nombre de d�g�t que le combattant peut envoyer
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
