package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1 {

	public static void main(String[] args) {

		double trinn_0 = 0.0;
		double trinn_1 = 0.017;
		double trinn_2 = 0.040;
		double trinn_3 = 0.136;
		double trinn_4 = 0.166;
		double trinn_5 = 0.176;

		int inntekt = parseInt(showInputDialog("Inntekt: "));

		if (inntekt <= 208050) {
			double skatt = inntekt * trinn_0;
			System.out.println("Du skal betale " + skatt + " kroner i trinnskatt");

		} else if (inntekt <= 292850) {
			double skatt = inntekt * trinn_1;
			System.out.println("Du skal betale " + skatt + " kroner i trinnskatt");

		} else if (inntekt <= 670000) {
			double skatt = inntekt * trinn_2;
			System.out.println("Du skal betale " + skatt + " kroner i trinnskatt");

		} else if (inntekt <= 937000) {
			double skatt = inntekt * trinn_3;
			System.out.println("Du skal betale " + skatt + " kroner i trinnskatt");

		} else if (inntekt <= 1350000) {
			double skatt = inntekt * trinn_4;
			System.out.println("Du skal betale " + skatt + " kroner i trinnskatt");

		} else {
			double skatt = inntekt * trinn_5;
			System.out.println("Du skal betale " + skatt + " kroner i trinnskatt");
		}

	}

}
