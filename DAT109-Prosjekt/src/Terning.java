/**
 * Terning-klassen
 * 
 * @author Fredrik
 *
 */
public class Terning {

	private int verdi;
	
	/**
	 * Konstruktør
	 */
	
	public Terning()
	{
		this.verdi = 0;
	}
	
	/**
	 * Triller og setter verdien til terningen 1-6.
	 */
	
	public void trill()
	{
		
		this.verdi = (int)((Math.random() * 6) + 1);
	
	}
		
	public int getVerdi()
	{
		return this.verdi;
	}
	
	public void setVerdi(int verdi)
	{
		this.verdi = verdi;
	}
	
	/**
	 * Kan bli brukt for å finne dyret. Bruker tall gjennom programmet, men kunne fint skrevet ut dyret. 
	 * 
	 * @return
	 */
	public String getDyr()
	{
		String dyr = null;
		switch(getVerdi())
		{
		case 1: dyr = "Løve"; break;
		case 2: dyr = "Slange"; break;
		case 3: dyr = "Panda"; break;
		case 4: dyr = "Rosa"; break;
		case 5: dyr = "Elefant"; break;
		case 6: dyr = "Hval"; break;
		}
		return dyr;
	}
}
