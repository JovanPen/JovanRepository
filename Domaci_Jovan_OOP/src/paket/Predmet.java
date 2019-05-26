package paket;

public class Predmet {
	
	private int sifraPredmeta;
	private String nazivPredmeta;
	
	public int getSifraPredmeta() {
		return sifraPredmeta;
	}
	public void setSifraPredmeta(int sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	@Override
	public String toString () {
		return "Sifra predmeta: " + sifraPredmeta + ", Naziv predmeta: " + nazivPredmeta;
		
		
	}
}
