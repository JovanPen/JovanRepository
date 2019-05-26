package paket;

import java.time.LocalDate;

public class NizPrijava {
	
	private Prijava [] prijave;
	
	public NizPrijava () {
		prijave = new Prijava [100];
	}
	
	public void unesiNovuPrijavu(int sifraPredmeta, String indeksStudenta, LocalDate datumPolaganja, int ocena, NizStudenata nizStud, NizPredmeta nizPred) {
		int i;
		for (i = 0; i < prijave.length; i++) {
			if (prijave[i] == null) {
				prijave[i] = new Prijava();
				prijave[i].setSifraPredmeta(sifraPredmeta);
				prijave[i].setIndeksStudenta(indeksStudenta);
				prijave[i].setDatumPolaganja(datumPolaganja);
				prijave[i].setOcena(ocena);
				break;
			}
		}

		if (!proveraValidnostiPrijave()) {
			prijave[i] = null;
		}
		
		else if (!proveraPostojanjaStudentaPoBrojuIndeksa(nizStud, i)) {
			prijave[i] = null;
		}
		
		else if (!proveraValidnostiSifrePredmeta(nizPred, i)) {
			prijave [i] = null;
		}
		
		else if (prijave[i].getDatumPolaganja() == null) {   //Vezano je za proveru formata unosa datuma u klasi Standardni ulaz
			prijave [i] = null;
			System.out.println("Ponovo unesite zeljenu prijavu");  
		}
		
		else if (ocena < 5 || ocena > 10) {
			System.out.println("Greska, ocene mogu biti u rasponu od 5 do 10. Unesite ponovo prijavu.");
			prijave[i] = null;
		}
			
		
	}
		
	public void ispisiPrijave() {
		for (Prijava prij : prijave) {
			if (prij != null)
				System.out.println(prij.toString());

		}
	}
	
	
	public boolean proveraValidnostiPrijave() {
		for (int i = 0; i < prijave.length-1; i++) {
			for (int j = i+1; j < prijave.length; j++) {
				if(prijave[i] != null && prijave[j] != null) 
				if (prijave[i].getOcena() > 5 && prijave[i].equals(prijave[j])) {
					System.out.println("Greska, student " + prijave[i].getIndeksStudenta() + " je vec polozio ispit: " + prijave[i].getSifraPredmeta());
					return false;
				}
			}
		}return true;
	}
	
	
	public boolean proveraPostojanjaStudentaPoBrojuIndeksa(NizStudenata nizStud, int redniBrojPrijave) {

		for (int i = 0; i < nizStud.studenti.length; i++) {
			 if (prijave[redniBrojPrijave] != null && nizStud.studenti[i] != null)
				if (prijave[redniBrojPrijave].equals2(nizStud.studenti[i])) {
					return true; 
				}
		}
		System.out.println("Greska, ne postoji student sa brojem indeksa: " + prijave[redniBrojPrijave].getIndeksStudenta());
		return false;

	}
	
	public boolean proveraValidnostiSifrePredmeta(NizPredmeta nizPred, int redniBrojPrijave) {
		for (int i = 0; i < nizPred.predmeti.length; i++) {
			if (prijave[redniBrojPrijave] != null && nizPred.predmeti[i] != null)
				if (prijave[redniBrojPrijave].equals2(nizPred.predmeti[i])) {
					return true;
				}
		}
		System.out.println("Greska, ne postoji predmet sa sifrom: " + prijave[redniBrojPrijave].getSifraPredmeta());
		return false;
	}
	
	
	public void prikazSvihStudenataKojiSuPoloziliZadatiPredmet(NizPredmeta nizPred, int sifPred) {
		boolean signalPostojiPredmet = false;
		for (int i = 0; i < nizPred.predmeti.length; i++) {
			if (sifPred == nizPred.predmeti[i].getSifraPredmeta()) {
				signalPostojiPredmet = true;
				break;
			}
		}
		if (signalPostojiPredmet == false) {
			System.out.println("Ne postoji uneta sifra predmeta.");
			return;
		}

		boolean signalPolozenogIspita = false;
		for (Prijava prij : prijave) {
			if (prij != null) {
				if (sifPred == prij.getSifraPredmeta()) {
					if (prij.getOcena() > 5) {
						System.out.println("Predmet " + prij.getSifraPredmeta() + " je polozio student "
								+ prij.getIndeksStudenta() + " sa ocenom: " + prij.getOcena());
						signalPolozenogIspita = true;
					}
				}
			}
		}
		if (!signalPolozenogIspita)
			System.out.println("Nijedan student nije polozio predmet sa sifrom broj:" + sifPred);
	}
	
	
	public void pregledSvihPrijavaPoIndeksuStudenta(String brojIndeksaStudenta, NizStudenata nizStud) {
		boolean signalPostojanjaStudenta = false;
		for (int i = 0; i < nizStud.studenti.length; i++){
			if (brojIndeksaStudenta.compareTo(nizStud.studenti[i].getIndeksStudenta()) == 0) {
				signalPostojanjaStudenta = true;
				break;
			} 
		} if (! signalPostojanjaStudenta) {
			System.out.println("Greska. Uneti broj indeksa ne odgovara ni jednom studentu.");
			return;
		}
		
		for (int i = 0; i < prijave.length; i++) {
			if (prijave[i] != null) {
				if (brojIndeksaStudenta.compareTo(prijave[i].getIndeksStudenta()) == 0) {
					System.out.println("Prijava za trazenog studenta: " + prijave[i].toString());
				}
			}
		}
		
		
	}
	
	
}
