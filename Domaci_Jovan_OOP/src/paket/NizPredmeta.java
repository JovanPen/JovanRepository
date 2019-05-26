package paket;

public class NizPredmeta {
	
	public Predmet [] predmeti;   //!!!!! public
	
	public NizPredmeta () {
		predmeti = new Predmet[6];
	}

	public void unesiPodatkePredmeta(int sifraPredmeta, String nazivPredmeta) {
		for (int i=0; i < predmeti.length; i++) {
			if (predmeti[i] == null) {
				predmeti[i] = new Predmet();
				predmeti[i].setSifraPredmeta(sifraPredmeta);
				predmeti[i].setNazivPredmeta(nazivPredmeta);
				break;
			}
		}
			
	}
	
	public void ispisiPredmet () {
			for (Predmet pred : predmeti)
				if (pred != null) {
					System.out.println(pred.toString());
				}
	}


	




}
