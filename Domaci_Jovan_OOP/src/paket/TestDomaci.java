package paket;

import java.time.LocalDate;

public class TestDomaci {

	public static void main(String[] args) {
		NizStudenata nizstud = new NizStudenata();
		
		nizstud.unesiPodatkeStudenta("Marko", "Maric", LocalDate.parse("1999-02-24"), "1/2018", 2018);
		nizstud.unesiPodatkeStudenta("Pera", "Peric", LocalDate.parse("1999-03-24"), "2/2018", 2018);
		nizstud.unesiPodatkeStudenta("Jova", "Jovic", LocalDate.parse("1999-04-24"), "3/2018", 2018);
		nizstud.unesiPodatkeStudenta("Ana", "Ilic", LocalDate.parse("1999-05-24"), "4/2018", 2018);
		nizstud.unesiPodatkeStudenta("Ema", "Maric", LocalDate.parse("1999-06-24"), "5/2018", 2018);
		nizstud.ispisiStudente();

		NizPredmeta nizpred = new NizPredmeta();
		nizpred.unesiPodatkePredmeta(11001, "Matematika 1");
		nizpred.unesiPodatkePredmeta(11002, "Matematika 2");
		nizpred.unesiPodatkePredmeta(11003, "Matematika 3");
		nizpred.unesiPodatkePredmeta(21001, "Informatika 1");
		nizpred.unesiPodatkePredmeta(21002, "Informatika 2");
		nizpred.unesiPodatkePredmeta(21003, "Informatika 3");
		nizpred.ispisiPredmet();
		
		NizPrijava nizprij = new NizPrijava();
		nizprij.unesiNovuPrijavu(11001, "1/2018", LocalDate.parse("2018-06-01"), 5, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11001, "1/2018", LocalDate.parse("2018-06-01"), 8, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11001, "1/2018", LocalDate.parse("2018-06-01"), 8, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11001, "2/2018", LocalDate.parse("2018-06-01"), 8, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11001, "2/2018", LocalDate.parse("2018-06-01"), 8, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11001, "8/2018", LocalDate.parse("2018-06-01"), 8, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11009, "2/2018", LocalDate.parse("2018-06-01"), 8, nizstud, nizpred);
		nizprij.unesiNovuPrijavu(11002, "2/2018", LocalDate.parse("2018-06-01"), 9, nizstud, nizpred);
		nizprij.ispisiPrijave();
		System.out.println("=================================");
		nizstud.izmenaPodatakaStudenta("2/2018", "Anka", "Ankic", LocalDate.parse("2000-12-22"), "2/2018", 2018);  
		nizstud.izmenaPodatakaStudenta("9/2018", "Anka", "Ankic", LocalDate.parse("2000-12-22"), "2/2018", 2018); // Format validnog unosa datuma je resen u klasi Standardni ulaz.
		System.out.println("=================================");
		nizprij.prikazSvihStudenataKojiSuPoloziliZadatiPredmet(nizpred, 11003);
		System.out.println("=================================");
		nizprij.pregledSvihPrijavaPoIndeksuStudenta("9/2018", nizstud);
		nizprij.pregledSvihPrijavaPoIndeksuStudenta("1/2018", nizstud);
		nizprij.pregledSvihPrijavaPoIndeksuStudenta("2/2018", nizstud);
	}
		
	
	
}
