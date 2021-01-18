/**
 * Méthode static Random
 * @author yusuf
 *
 */
public class Random {
	
	/**
	 * Génère un nombre au hasard entre [min, max]
	 * @param min nombre mini
	 * @param max nombre maxi
	 * @return nombre généré
	 */
	public static int randomInt(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
}
