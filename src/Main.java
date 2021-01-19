/**
 * Méthode Main
 * @author yusuf
 *
 */
public class Main {

	public static void main(String[] args) {
		try{
			Monde.genese();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
