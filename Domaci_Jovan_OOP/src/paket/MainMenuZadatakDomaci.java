package paket;

import java.time.LocalDate;

public class MainMenuZadatakDomaci {

	public static void main(String[] args) {
		
		NizStudenata nizstud = new NizStudenata();
		nizstud.unesiPodatkeStudenta("Marko", "Maric", LocalDate.parse("1999-02-24"), "1/2018", 2018);
		nizstud.unesiPodatkeStudenta("Pera", "Peric", LocalDate.parse("1999-03-24"), "2/2018", 2018);
		nizstud.unesiPodatkeStudenta("Jova", "Jovic", LocalDate.parse("1999-04-24"), "3/2018", 2018);
		nizstud.unesiPodatkeStudenta("Ana", "Ilic", LocalDate.parse("1999-05-24"), "4/2018", 2018);
		nizstud.unesiPodatkeStudenta("Ema", "Maric", LocalDate.parse("1999-06-24"), "5/2018", 2018);
		
		NizPredmeta nizpred = new NizPredmeta();
		nizpred.unesiPodatkePredmeta(11001, "Matematika 1");
		nizpred.unesiPodatkePredmeta(11002, "Matematika 2");
		nizpred.unesiPodatkePredmeta(11003, "Matematika 3");
		nizpred.unesiPodatkePredmeta(21001, "Informatika 1");
		nizpred.unesiPodatkePredmeta(21002, "Informatika 2");
		nizpred.unesiPodatkePredmeta(21003, "Informatika 3");
		
		NizPrijava nizprij = new NizPrijava();
		
		int choice;
		String subChoice;
		String subChoice2;
		
		do {
			System.out.println("Glavni meni domaceg zadatka. Izaberite jednu od ponudjenih opcija:"); 
			System.out.println("1. Pregled");
			System.out.println("2. Unos nove prijave");
			System.out.println("3. Izmena podataka o studentu");
			System.out.println("4. Kraj programa");
			System.out.println("Unesite zeljenu opciju:");
			choice = StandardniUlaz.prihvatiBrojPrekoSUlaza();
			
			switch (choice) {
			
			case 1:
				do {
					System.out.println("Izaberite jednu od ponudjenih opcija:");
					System.out.println("a. Pregled svih predmeta");
					System.out.println("b. Pregled svih studenata");
					System.out.println("c. Pregled svih prijava za trazenog studenta");
					System.out.println("d. Pregled svih studenata koji su polozili odredjeni predmet");
					System.out.println("e. Povratak u glavni meni");
					subChoice = StandardniUlaz.prihvatiStringPrekoSUlaza();
					
						switch(subChoice) {
						case "a": 
							nizpred.ispisiPredmet(); break;
							
						case "b":
							nizstud.ispisiStudente(); break;
						
						case "c":
							System.out.println("Unesite indeks studenta");
							String brojIndeksaStudenta = StandardniUlaz.prihvatiStringPrekoSUlaza();
							nizprij.pregledSvihPrijavaPoIndeksuStudenta(brojIndeksaStudenta, nizstud); break;
							
						case "d":
							System.out.println("Unesite sifru predmeta");
							int sifPred = StandardniUlaz.prihvatiBrojPrekoSUlaza();
							nizprij.prikazSvihStudenataKojiSuPoloziliZadatiPredmet(nizpred, sifPred); break;
						
						case "e":
							System.out.println("Izabrali ste povratak u glavni meni"); break;
						default:
							System.out.println("Greska, niste uneli odgovarajucu opciju"); break;
						}	
						
				} while (subChoice.compareTo("e") != 0); break;
				
			
			case 2: 
				System.out.println("Unesite sifru predmeta");
				int sifraPredmeta = StandardniUlaz.prihvatiBrojPrekoSUlaza();
				System.out.println("Unesite indeks studenta");
				String indeksStudenta = StandardniUlaz.prihvatiStringPrekoSUlaza();
				System.out.println("Unesite datum polaganja ispita u formatu: GGGG-MM-DD");
				LocalDate datumPolaganja = StandardniUlaz.prihvatiDatumPrekoSUlaza();
				System.out.println("Unesite ocenu koju je student dobio na ispitu, ukoliko nije polozio, upisati ocenu 5");
				int ocena = StandardniUlaz.prihvatiBrojPrekoSUlaza();
				
				nizprij.unesiNovuPrijavu(sifraPredmeta, indeksStudenta, datumPolaganja, ocena, nizstud, nizpred); break;
			
			case 3:
				do {
					System.out.println("Izaberite jednu od ponudjenih opcija:");
					System.out.println("a. Izmena podataka o studentu");
					System.out.println("b. Povratak u glavni meni");
					subChoice2 = StandardniUlaz.prihvatiStringPrekoSUlaza();
					
					switch (subChoice2) {
					case "a":                
						System.out.println("Unesite broj indeksa trazenog studenta za izmenu podataka");
						String indeksTrazenogStudenta = StandardniUlaz.prihvatiStringPrekoSUlaza();
						System.out.println("Unesite ime studenta");
						String novoImeStudenta = StandardniUlaz.prihvatiStringPrekoSUlaza();
						System.out.println("Unesite prezime studenta");
						String novoPrezimeStudenta = StandardniUlaz.prihvatiStringPrekoSUlaza();
						System.out.println("Unesite datum rodjenja studenta u formatu: GGGG-MM-DD");
						LocalDate noviDatumRodjenja = StandardniUlaz.prihvatiDatumPrekoSUlaza();
						System.out.println("Unesite broj indeksa studenta");
						String noviBrojIndeksa = StandardniUlaz.prihvatiStringPrekoSUlaza();
						System.out.println("Unesite godinu upisa studenta");
						int novaGodinaUpisaStudenta = StandardniUlaz.prihvatiBrojPrekoSUlaza();
						nizstud.izmenaPodatakaStudenta(indeksTrazenogStudenta, novoImeStudenta, novoPrezimeStudenta, noviDatumRodjenja, noviBrojIndeksa, novaGodinaUpisaStudenta); break;
					
					case "b":
						System.out.println("Izabrali ste povratak u glavni meni"); break;
					default:
						System.out.println("Greska, niste uneli odgovarajucu opciju"); break;	
					}
									
				} while (subChoice2.compareTo("b") != 0); break;
				
	
			case 4:
				System.out.println("Izabrali ste kraj programa"); break;
				
			default:
				System.out.println("Greska, niste uneli odgovarajucu opciju"); break;	
				
			} 
			
	
		} while (choice !=4 );
	
		
	}

}
