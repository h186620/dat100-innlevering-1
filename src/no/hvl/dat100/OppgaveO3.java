package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skrive inn et heltall som er < 0:"));
		long fakultet = 1;
		
		for (int i = 1; i<= n; i++) {
			fakultet *= i;
			
		}
		System.out.println("n! = " + fakultet);
		
	}

}
