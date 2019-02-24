/**
 * Terninger-klassen
 * 
 * @author Fredrik
 *
 */

public class Terninger {

	private Terning[] terninger;
	
	/**
	 * Oppretter terninger (med et visst antall).
	 * 
	 * @param antall
	 */
	public Terninger(int antall)
	{
		
		terninger = new Terning[antall];
		
		for(int i = 0; i < terninger.length; i++)
		{
			terninger[i] = new Terning();
		}
	}
	
	/** 
	 * Triller alle terningene.
	 */
	
	public void trillTerninger() 
	{
		
		for(int i = 0; i < terninger.length; i++)
		{
			terninger[i].trill();
		}
	}
	
	/**
	 * Sjekker antall like i tabellen gitt ved et tall som hentes inn. For eks: hvis 1 kommer inn, returnerer den antall enere.
	 * 
	 * 
	 * @param verdi
	 * @return
	 */
	
	public int sjekkAntall(int verdi)
	{
		int antall = 0;
		
		for(int i = 0; i < terninger.length; i++)
		{
			if(verdi == terninger[i].getVerdi())
			{

				antall++;
			}
		}
		return antall;
	}
	
	/**
	 * Hjelpemetode for å hente tabellen.
	 * @return
	 */
	public Terning[] getTerninger()
	{
		return terninger;
	}
	
	/**
	 * Hjelpemetode for å printe terningene.
	 */
	public void printTerninger()
	{
		String str = "";
		
		for(int i = 0; i < terninger.length; i++)
		{
			str += terninger[i].getVerdi() + " ";
		}
			
		System.out.println(str);
	}
	
	/** Hjelpemetode for å hente lengden på tabellen.
	 * 
	 * @return
	 */
	public int antallTerninger()
	{
		return terninger.length;
	}

}
