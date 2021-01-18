/**
 * Interface IAttaque
 * @author yusuf
 *
 */
public interface IAttaque {
	public int lancerAttaque(ICombattant lanceur, ICombattant cible);
	
	// Getters et setters
    public String getNom();
    public String getDescription();
    public double getChanceToucher();
    public void setNom(String nom);
    public void setDescription(int description);
    // Chance de toucher doit être compris entre 0 et 100 obligatoirement
    public void setChanceToucher(double chanceToucher); 
}
