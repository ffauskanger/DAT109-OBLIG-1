
/**
 * Lager et Yatzoo-spill, oppretter det og skriver ut vinneren av spillet.y
 * 
 * @author Fredrik Fauskanger
 */


public class YatzooApp {

	
	public static void main(String[] args) {
		
		Yatzoo yatzoo = new Yatzoo();
		yatzoo.start(); 
		System.out.println("Vinneren ble: " + yatzoo.getVinner());
	}

}
