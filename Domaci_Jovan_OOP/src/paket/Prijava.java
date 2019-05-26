package paket;

import java.time.LocalDate;

public class Prijava {
	private int sifraPredmeta;
	private String indeksStudenta;
	private LocalDate datumPolaganja;
	private int ocena;
	
	public int getSifraPredmeta() {
		return sifraPredmeta;
	}
	public void setSifraPredmeta(int sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	public String getIndeksStudenta() {
		return indeksStudenta;
	}
	public void setIndeksStudenta(String indeksStudenta) {
		this.indeksStudenta = indeksStudenta;
	}
	public LocalDate getDatumPolaganja() {
		return datumPolaganja;
	}
	public void setDatumPolaganja(LocalDate datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	
	@Override
	public String toString() {
		return "Sifra predmeta: " + sifraPredmeta + ", indeks studenta: " + indeksStudenta + ", datum polaganja: " 
				+ datumPolaganja + ", ocena: " + ocena;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Prijava) {
			Prijava pr = (Prijava)(obj);
		if (sifraPredmeta == pr.sifraPredmeta && indeksStudenta.equals(pr.getIndeksStudenta()) )
			return true; else return false;
		} else {
			System.out.println("Greska! Nije unet objekat klase Prijava!");
			return false;
		}
	
	}
	
	public boolean equals2(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) (obj);
			if (indeksStudenta.compareTo(st.getIndeksStudenta())==0)
				return true;
			else
				return false;
		} 
		else if (obj instanceof Predmet) {
			Predmet pred = (Predmet) (obj);
			if (sifraPredmeta == pred.getSifraPredmeta())
				return true;
			else
				return false;
		} 
		else {
			System.out.println("Greska! Nije unet objekat klase Student ili Predmet!");
			return false;
		}

	}
	
	
	
}
