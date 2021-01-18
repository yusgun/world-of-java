import java.util.ArrayList;
import java.util.List;

/**
 * Classe classe
 * @author yusuf
 */
public class Classe {
	// attributs de la classe
	public String nom;
	public List<IAttaque> attaques = new ArrayList<IAttaque>();
	
	/**
	 * Constructeur avec les paramètres
	 * @param nom
	 * @param attaques
	 */
	public Classe(String nom, List<IAttaque> attaques) {
		this.nom = nom;
		this.attaques = attaques;
	}
	
	/**
	 * Cette méthode permet de récupérer une attaque au hasard dans la liste
	 * @return attaque au hasard
	 */
	public IAttaque getAttaque() {
		return this.attaques.get(Random.randomInt(0, this.attaques.size()-1));
	}
	
	// getters et setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<IAttaque> getAttaques() {
		return attaques;
	}
	public void setAttaques(List<IAttaque> attaques) {
		this.attaques = attaques;
	}
	
	
}
