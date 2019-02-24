
import java.util.*;

/**
 * Yatzoo-klassen
 * 
 * @author Fredrik
 *
 */
public class Yatzoo {

	private Terninger terninger;
	private int ANT_RUNDER = 12;
	

	private List<Spiller> spillere = new ArrayList<>();
	{
		spillere.add(new Spiller("Atle"));
		spillere.add(new Spiller("Kari"));
	}

	/**
	 * Lager programmet med 5 terninger.
	 */
	public Yatzoo()
	{
		terninger = new Terninger(5);
	}
	
	/**
	 * Starter spillet med å skrive ut navn på alle spillere. Kjører deretter gjennom alle rundene.
	 * Skriver deretter ut scoren til spillerene.
	 * 
	 */
	public void start()
	{
		System.out.print("Start spill med spillere: ");
		for(Spiller spiller : spillere)
		{
			System.out.print(spiller.getNavn() + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < ANT_RUNDER; i++)
		{
			for(Spiller spiller : spillere)
			{
				terninger.trillTerninger();
				spiller.spillTur(terninger);
			}
			
			
		}
		
		for(Spiller spiller : spillere)
		{
			System.out.println(spiller.getNavn() + " sin score: " + spiller.getScore());
		}
	}
	
	/**
	 * Returnerer vinneren i spillet.
	 * @return
	 */
	public String getVinner()
	{
		int vinnerScore = 0;
		Spiller vinner = null;
		for(Spiller spiller : spillere)
		{
			if(spiller.getScore() > vinnerScore)
			{
				vinner = spiller;
				vinnerScore = spiller.getScore();
			}
		}
		return vinner.getNavn();
	}
	
	
}
