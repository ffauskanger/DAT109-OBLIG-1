
/**
 * Spiller-klassen
 * 
 * @author Fredrik
 *
 */

public class Spiller {

	private String navn;
	private int score; 
	private ResultatBlokk resultatblokk;

	/**
	 * Konstruktør som tar inn navn.
	 * 
	 * @param navn
	 */
	
	public Spiller(String navn)
	{
		this.navn = navn;
		resultatblokk = new ResultatBlokk();
	}
	
	/**
	 **
	 * Spiller turen til spilleren og legger til scoren etter runden. Henter inn terninger.
	 *
	 * @param terninger
	 */
	
	public void spillTur(Terninger terninger)
	{
		score += resultatblokk.nesteTur(terninger);
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public String getNavn() 
	{
		return this.navn;
	}
}
