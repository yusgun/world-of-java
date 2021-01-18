
public class BasicAttaque implements IAttaque{
	
	// attributs de la classe
	private String nom;
	private String description;
	private double chanceToucher;
	private int degats;
	
	/**
	 * Constructeur avec tous les paramètres
	 * @param nom
	 * @param description
	 * @param degats
	 * @param chanceToucher
	 */
	public BasicAttaque(String nom, String description, int degats, double chanceToucher) {
		this.nom = nom;
		this.description = description;
		this.degats = degats;
		this.chanceToucher = chanceToucher;
	}
	
	/**
	 * Méthode permettant de représenter une attaque basique
	 * @param lanceur - Combattant qui va attaquer
	 * @param cible - Combattant qui va défendre
	 */
	@Override
	public int lancerAttaque(ICombattant lanceur, ICombattant cible) {
		int result = 0;
	    // Avec un nombre aleatoire random compris entre 0 et 100
		int random = Random.randomInt(0, 100);
	    // si random < chanceToucher
		if(random < this.chanceToucher) {
	        // retourner lanceur.Degats
			result = lanceur.getDegat();
		} else {
			// sinon renvoyer 0 et afficher un message d'echec
			System.out.println("Echec de l'attaque de " + lanceur.getNom());
		}
		return result;
	}

	@Override
	public String getNom() {
		return null;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public double getChanceToucher() {
		return 0;
	}
	
	public int getDegats() {
		return degats;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setChanceToucher(double chanceToucher) {
		this.chanceToucher = chanceToucher;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	@Override
	public void setDescription(int description) {
		// TODO Auto-generated method stub
		
	}

}
