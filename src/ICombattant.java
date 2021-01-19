/**
 * Interface Combattant
 * @author yusuf
 */
public interface ICombattant {
	/**
	 * Permet au combattant d'attaquer son adversaire
	 * @param adversaire à attaquer
	 */
	public void attaquer(ICombattant adversaire);
	
	/**
	 * Permet au combattant de défendre
	 * @param dégats à encaisser
	 */
	public void defendre(int degats);
	
	// Getters et setters
	public String getNom();
	public int getDegat();
	public int getPointDeVie();
	public void setNom(String nom);
	public void setDegat(int degat);
	public void setPointDeVie(int pointDeVie);
}
