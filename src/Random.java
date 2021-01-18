/**
 * M�thode static Random
 * @author yusuf
 *
 */
public class Random {
	
	/**
	 * G�n�re un nombre au hasard entre [min, max]
	 * @param min nombre mini
	 * @param max nombre maxi
	 * @return nombre g�n�r�
	 */
	public static int randomInt(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
}
