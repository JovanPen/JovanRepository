package paket;

import java.time.LocalDate;
import java.util.Scanner;

public class StandardniUlaz {
		
	static int prihvatiBrojPrekoSUlaza() {
		Scanner stUlaz = new Scanner(System.in);
		try {
			return Integer.parseInt(stUlaz.nextLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Greska, niste uneli broj kao format.");
			return 0;
		}
	}

	static String prihvatiStringPrekoSUlaza() {
		Scanner stUlaz = new Scanner(System.in);
		return stUlaz.nextLine();
	}
	
	static LocalDate prihvatiDatumPrekoSUlaza() {
		Scanner stUlaz = new Scanner(System.in);
		try {
			return LocalDate.parse(stUlaz.nextLine());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Uneli ste pogresan format datuma.");
			return null;
		}
	}

}
