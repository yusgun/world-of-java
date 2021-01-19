/**
 * Interface Combattant
 * @author yusuf
 */
public interface ICombattant {
	/**
	 * Permet au combattant d'attaquer son adversaire
	 * @param adversaire � attaquer
	 */
	public void attaquer(ICombattant adversaire);
	
	/**
	 * Permet au combattant de d�fendre
	 * @param d�gats � encaisser
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
