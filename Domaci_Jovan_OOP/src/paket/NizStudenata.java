package paket;

import java.time.LocalDate;

public class NizStudenata {
	
	public Student [] studenti;  //!!!!
		
	public NizStudenata () {
		studenti = new Student [5];
	}
	
	public void unesiPodatkeStudenta(String imeStudenta, String prezimeStudenta, LocalDate datumRodjenja, String indeksStudenta, int godinaUpisa) {
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i] == null) {
				studenti[i] = new Student();
				studenti[i].setImeStudenta(imeStudenta);
				studenti[i].setPrezimeStudenta(prezimeStudenta);
				studenti[i].setDatumRodjenja(datumRodjenja);
				studenti[i].setIndeksStudenta(indeksStudenta);
				studenti[i].setGodinaUpisa(godinaUpisa);
				break;
			}
		}
	}
	
	public void ispisiStudente () {
		for (Student stud : studenti) {
			if (stud != null)
			System.out.println(stud.toString());
		}
			
	}
	
	
	public int pronadjiStudentaZaIzmenu(String indeksStudenta) {
		int redniBrojStudentaUNizu = -1;
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].getIndeksStudenta().compareTo(indeksStudenta) == 0) {
				redniBrojStudentaUNizu = i;
			}

		}
		return redniBrojStudentaUNizu;
	}
	
	public void izmenaPodatakaStudenta(String indeksTrazenogStudenta, String novoImeStudenta,String novoPrezimeStudenta, 
			LocalDate noviDatumRodjenja, String noviBrojIndeksa,int novaGodinaUpisaStudenta) {
		try {
			int redniBroj = pronadjiStudentaZaIzmenu(indeksTrazenogStudenta);
			studenti[redniBroj].setImeStudenta(novoImeStudenta);
			studenti[redniBroj].setPrezimeStudenta(novoPrezimeStudenta);
			if (noviDatumRodjenja != null) {
				studenti[redniBroj].setDatumRodjenja(noviDatumRodjenja); // studenti[redniBroj].setDatumRodjenja(LocalDate.parse("2018-06-01"));
			}
			studenti[redniBroj].setIndeksStudenta(noviBrojIndeksa);
			if (novaGodinaUpisaStudenta != 0) {
				studenti[redniBroj].setGodinaUpisa(novaGodinaUpisaStudenta);
			}
			System.out.println(studenti[redniBroj].toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Greska, nije unet odgovarajuci broj indeksa studenta");
		}
	}

	public Student[] getStudenti() {
		return studenti;
	}

	public void setStudenti(Student[] studenti) {
		this.studenti = studenti;
	}
	
	
	
	
	
	
//	public int pronadjiStudentaZaIzmenu (String indeksStudenta) {
//		int redniBrojStudentaUNizu = -1;
//		for (int i = 0; i < studenti.length; i++) {
//			if (studenti[i].getIndeksStudenta().compareTo(indeksStudenta)==0) {
//				redniBrojStudentaUNizu = i;	
//			}
//		} return redniBrojStudentaUNizu;
//	}
	
	
}
