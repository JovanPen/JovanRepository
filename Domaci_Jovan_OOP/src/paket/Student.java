package paket;

import java.time.LocalDate;

public class Student {
	
	private String indeksStudenta;
	private int godinaUpisa;
	private String imeStudenta;
	private String prezimeStudenta;
	private LocalDate datumRodjenja;
	
	public String getIndeksStudenta() {
		return indeksStudenta;
	}
	public void setIndeksStudenta(String indeksStudenta) {
		this.indeksStudenta = indeksStudenta;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public String getImeStudenta() {
		return imeStudenta;
	}
	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}
	public String getPrezimeStudenta() {
		return prezimeStudenta;
	}
	public void setPrezimeStudenta(String prezimeStudenta) {
		this.prezimeStudenta = prezimeStudenta;
	}
	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	@Override
	public String toString () {
		return "Ime i prezime studenta: " + imeStudenta + " " + prezimeStudenta + ", datum rodjenja: " + datumRodjenja 
				+ ", broj indeksa: " + indeksStudenta + ", godina upisa: " + godinaUpisa;
	}
	
}
