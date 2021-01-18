/**
 * Interface Combattant
 * @author yusuf
 */
public interface ICombattant {
	public void attaquer(ICombattant adversaire);
	public void defender(int degats);
	
	// Getters et setters
	public String getNom();
	public int getDegat();
	public int getPointDeVie();
	public void setNom(String nom);
	public void setDegat(int degat);
	public void setPointDeVie(int pointDeVie);
}
