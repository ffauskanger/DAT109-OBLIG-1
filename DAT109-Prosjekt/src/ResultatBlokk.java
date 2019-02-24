import java.util.ArrayList;

/**
 * Resultatblokk-klasse
 * 
 * @author Fredrik
 *
 */

public class ResultatBlokk {

	private int runde;

	/**
	 * Konstruktør
	 * 
	 */
	
	public ResultatBlokk()
	{
		this.runde = 1;
	}
	
	
	/**
	 * Henter terninger til turen, og returner scoren til runden.
	 * 
	 * @param terninger
	 * @return
	 */
	public int nesteTur(Terninger terninger)
	{
		int verdi = rundeVelger(runde, terninger); 
		this.runde++; 
		return verdi;
	}
	
	/**
	 * Tar inn rundene og terningene, og kjører rundene. Returnerer scoren til runden.
	 * 
	 * @param runde
	 * @param terninger
	 * @return
	 */
	
	public int rundeVelger(int runde, Terninger terninger)
	{			
		int verdi = 0;
		switch(runde)
		{
		case 1: verdi = terninger.sjekkAntall(1);break;
		case 2: verdi = terninger.sjekkAntall(2);  break;
		case 3: verdi = terninger.sjekkAntall(3);  break;
		case 4: verdi = terninger.sjekkAntall(4);  break;
		case 5: verdi = terninger.sjekkAntall(5);  break;
		case 6: verdi = terninger.sjekkAntall(6);  break;
		case 7: verdi = treLike(terninger);  break;
		case 8: verdi = fireLike(terninger); break;
		case 9: verdi = toPar(terninger); break;
		case 10: verdi = Hus(terninger); break;
		case 11: verdi = femUlike(terninger); break;
		case 12: verdi = yatZoo(terninger); break;
		}
		return verdi;
	}
	
	/**
	 * Tre like, tar inn terningene og returnerer scoren etter runden.
	 * 
	 * @param terninger
	 * @return
	 */
	
	public int treLike(Terninger terninger)
	{
		int verdi = 0;
		for(int i = 1; i < 1 + terninger.antallTerninger(); i++)
		{
			if(terninger.sjekkAntall(i) > 2)
			{
				verdi = 3;
			}
		}
		
		
		return verdi;
	}
	
	/**
	 * Fire like, tar inn terningene og returnerer scoren etter runden.
	 * 
	 * @param terninger
	 * @return
	 */
	
	public int fireLike(Terninger terninger)
	{
		int verdi = 0;
		for(int i = 1; i < 1 + terninger.antallTerninger(); i++)
		{
			if(terninger.sjekkAntall(i) > 3)
			{
				verdi = 4;
			}
		}
		
		
		return verdi;
	}
	
	
	/**
	 * To par, henter inn terningene og returnerer scoren etter runden.
	 * 
	 * @param terninger
	 * @return
	 */
	
	public int toPar(Terninger terninger)
	{
		int verdi = 0;
		int antallAvTo = 0;
		
		for(int i = 1; i < 1 + terninger.antallTerninger(); i++)
		{
			if(terninger.sjekkAntall(i) > 1)
			{
				antallAvTo++;
			}
		}
		
		if(antallAvTo > 1)
		{
			verdi = 4;
		}
		
		return verdi;
	}
	

	
	/**
	 * Hus (tre like + to like), henter inn terningene og returnerer scoren etter runden.
	 * 
	 * @param terninger
	 * @return
	 */
	
	public int Hus(Terninger terninger)
	{
		int verdi = 0;
		int antallAvTo = 0;
		int antallAvTre = 0;
		
		
		for(int i = 0; i < terninger.antallTerninger(); i++)
		{
			if(terninger.sjekkAntall(i) > 2)
			{
				antallAvTre++;
			}
			if(terninger.sjekkAntall(i) > 1)
			{
				antallAvTo++;
			}
		}
		
		if(antallAvTo > 0 && antallAvTre > 0 && !(antallAvTo == 1 && antallAvTre == 1))
		{
			verdi = 5;
		}
		
		return verdi;
	}
	
	/**
	 * Fem ulike, henter inn terningene og returnerer scoren etter runden.
	 * 
	 * @param terninger
	 * @return
	 */
	
	public int femUlike(Terninger terninger)
	{
		int verdi = 0;
		ArrayList<Integer> antallUlike = new ArrayList<>();
		
		
		for(int i = 0; i < terninger.antallTerninger(); i++)
		{
			
			if(!antallUlike.contains(terninger.getTerninger()[i].getVerdi()))
			{
				antallUlike.add(terninger.getTerninger()[i].getVerdi());
			}
		}
		
		if(antallUlike.size() > 4)
		{
			verdi = 5;
		}
		
		return verdi;
	}
	
	/**
	 * Yatzoo (fem like), henter inn terningene og returnerer scoren etter runden.
	 * 
	 * @param terninger
	 * @return
	 */
	
	public int yatZoo(Terninger terninger)
	{
		int verdi = 0;
		for(int i = 1; i < 1 + terninger.antallTerninger(); i++)
		{
			if(terninger.sjekkAntall(i) == 5)
			{
				verdi = 10;
			}
		}
		
		return verdi;
	}
}