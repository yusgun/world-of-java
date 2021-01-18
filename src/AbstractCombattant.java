/**
 * Classe repr�sentant un combattant
 * @author yusuf
 */
public abstract class AbstractCombattant implements ICombattant {
    // attributs de la classe 
	public int pointDeVie;
	public int degat;
	public String nom;
    
    /**
     * Constructeur vide
     */
    public AbstractCombattant() {}
    
    /**
     * Constructeur avec tous les param�tres
	 * @param pointDeVie - Point de vie � attribuer au combattant
	 * @param degat - Nombre de d�g�t que le combattant peut envoyer
	 * @param nom - Nom du combattant
     */
	public AbstractCombattant(int pointDeVie, int degat, String nom) {
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.nom = nom;
	}
	
	/**
	 * Cette m�thode permet au combattant d'attaquer son adversaier*
	 * @param adversaire - Adversaire � attaquer
	 */
	public void attaquer(ICombattant adversaire) {
		adversaire.defendre(this.degat);
		System.out.println("Le combattant "+ this.getNom() +" attaque, et retire "+ this.getPointDeVie() +" pts de vie, il reste "+ adversaire.getPointDeVie() +" pts de vie a "+ adversaire.getNom());
	}
	
	/**
	 * Cette m�thode permet au combattant de d�fendre en soustrayant le nomde de d�gats au pt de vie
	 * @param degats - pt de vie � retirer
	 */
	public void defendre(int degats) {
		this.setPointDeVie(this.getPointDeVie()-degats);
	}
	
	/**
	 * Cette m�thode permet de savoir si un personnage est vivant
	 * @param combattant - Combattant � v�rifier
	 * @return vrai s'il est vivant
	 */
	public boolean estVivant() {
		return this.pointDeVie > 0;
	}
	
	@Override
	public String toString() {
		return "nom:["+this.nom+"], pointDeVie:["+this.pointDeVie+"], attaque:["+this.degat+"]";
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   
}
