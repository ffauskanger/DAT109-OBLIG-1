import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Yatzoo-Test klasse
 * 
 */

class YatzooTest {
	
	
	private Terninger terninger = new Terninger(5);
	private ResultatBlokk resultatblokk = new ResultatBlokk();

	// Summen som blir testet i hver av testmetodene er scoren som blir gitt ut.

	@Test
	void testEnTilSeks() {
	
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(1);
		terningene[1].setVerdi(2);
		terningene[2].setVerdi(3);
		terningene[3].setVerdi(4);
		terningene[4].setVerdi(5);
		
		
		
		assertEquals(terninger.sjekkAntall(1), 1);
		assertEquals(terninger.sjekkAntall(2), 1);
		assertEquals(terninger.sjekkAntall(3), 1);
		assertEquals(terninger.sjekkAntall(4), 1);
		assertEquals(terninger.sjekkAntall(5), 1);
		assertEquals(terninger.sjekkAntall(6), 0);
		
	}

	
	@Test
	void TreLike() {
		
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(1);
		terningene[1].setVerdi(3);
		terningene[2].setVerdi(3);
		terningene[3].setVerdi(3);
		terningene[4].setVerdi(5);
		
		assertEquals(resultatblokk.treLike(terninger), 3);
		assertEquals(resultatblokk.treLike(terninger), 3);
	}
	@Test
	void FireLike() {
		
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(1);
		terningene[1].setVerdi(3);
		terningene[2].setVerdi(3);
		terningene[3].setVerdi(3);
		terningene[4].setVerdi(3);
		
		assertEquals(resultatblokk.fireLike(terninger), 4);

	}
	@Test
	void Hus() {
		
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(2);
		terningene[1].setVerdi(3);
		terningene[2].setVerdi(3);
		terningene[3].setVerdi(3);
		terningene[4].setVerdi(2);
		
		assertEquals(resultatblokk.Hus(terninger), 5);

	}
	
	@Test
	void ToPar() {
		
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(5);
		terningene[1].setVerdi(1);
		terningene[2].setVerdi(2);
		terningene[3].setVerdi(2);
		terningene[4].setVerdi(5);
		
		assertEquals(resultatblokk.toPar(terninger), 4);

	}
	
	@Test
	void FemUlike() {
		
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(1);
		terningene[1].setVerdi(2);
		terningene[2].setVerdi(3);
		terningene[3].setVerdi(4);
		terningene[4].setVerdi(5);
		
		assertEquals(resultatblokk.femUlike(terninger), 5);

	}
	
	
	@Test
	void YatZoo() {
		
		Terning[] terningene = terninger.getTerninger();
		terningene[0].setVerdi(5);
		terningene[1].setVerdi(5);
		terningene[2].setVerdi(5);
		terningene[3].setVerdi(5);
		terningene[4].setVerdi(5);
		
		assertEquals(resultatblokk.yatZoo(terninger), 10);

	}
}
