package no.hvl.dat100;

public class OppgaveO2 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.print("Skriv inn poengsum #" + i + ": ");
			int tall = Integer.parseInt(input.next());
			char karakter = karakter(tall);

			if (karakter == 'X') {
				System.out.println(tall + " er ikke mulig grunnet at poengsum skal være innenfor (0, 100)");
				i--;
			}

			else
				System.out.println(tall + " poeng gir karakter: " + karakter);
		}

		input.close();
	}

	public static char karakter(int p) {
		if (p < 0)
			return 'X';
		if (p <= 39)
			return 'F';
		if (p <= 49)
			return 'E';
		if (p <= 59)
			return 'D';
		if (p <= 79)
			return 'C';
		if (p <= 89)
			return 'B';
		if (p <= 100)
			return 'A';
		else
			return 'X';

	}

}
