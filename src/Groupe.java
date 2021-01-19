import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un groupe de combattant
 * @author yusuf
 *
 */
public class Groupe extends AbstractCombattant{
	
	// Liste de combattant
	private List<ICombattant> combattants = new ArrayList<ICombattant>();
	
	/**
	 * Permet de choisir un combattant au hasard
	 * @return Combattant à attaquer par la suite
	 */
	public ICombattant choixCombattant() {
		int random = Random.randomInt(0, this.combattants.size()-1);
		return this.combattants.get(random);
	}
	
	/**
	 * Choisit un adversaire aléatoirement et l'attaque
	 */
	public void attaque() {
		super.attaquer(this.choixCombattant());
	}
	
	/**
	 * Permet d'ajouter un combattant dans la liste
	 * @param combattant à ajouter
	 */
	public void addCombattant(ICombattant combattant) {
		this.combattants.add(combattant);
	}
	
	/**
	 * Permet de savoir si tous les combattants de la liste sont morts
	 * @return vrai si tous les combattants sont morts
	 */
	public boolean estMort() {
		boolean mort = true;
		for (ICombattant combattant : this.combattants) {
			if(combattant.getPointDeVie() > 0) {
				mort = false;
			}
		}
		return mort;
	}


}
