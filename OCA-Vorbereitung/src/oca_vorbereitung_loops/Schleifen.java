package oca_vorbereitung_loops;

import java.util.ArrayList;
import java.util.List;

public class Schleifen {

	public static void main(String[] args) {
		// die laufvariable kann ausserhalb der schleife deklariert und
		// initialisert werden
		int i = 0;
		for (; i < 5; i++) {
			System.out.println(i);
		}
		// ist die laufvariable bereits ausserhalb der schleife deklariert kann sie
		// in der schleife nicht erneut deklariert werden
		/*
		 * for (int i = 0 ;i< 5;i++){ // compilerfehler
		 * System.out.println(i);
		 * }
		 */
		System.out.println("---------");
		// aber mann der ausserhalb deklarierten laufvariable im initteil der schleife
		// neue anfangswerte zuweisen
		for (i = 1; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("---------");
		System.out.println(i);
		System.out.println("---------");
		for (i = 1; i < 5;) {
			System.out.println(i);
			i++;	// der update teil kann auch innerhalb der schleife stehen
		}
		System.out.println("---------");
		i = 0;
		// möglichkeit einer "endlosschleife" mit innerer abbruchbedingung
		for (;;) {
			System.out.println(i);
			i++;
			if (i == 5)
				break;
		}
		i = 0;
		// möglichkeit einer "endlosschleife" mit innerer abbruchbedingung
		// aber durch wenn i = 2 befindet sich die schleife im loop
		/*
		 * for (;;) {
		 * if (i == 2) {
		 * continue;
		 * } else {
		 * System.out.println(i);
		 * i++;
		 * if (i == 5)
		 * break;
		 * }
		 * }
		 */
		System.out.println("---------");
		i = 0;
		// möglichkeit einer "endlosschleife" mit innerer abbruchbedingung
		// und auslassen der ausgabe wenn i = 2
		for (;;) {
			i++;
			if (i == 2) {
				continue;
			} else {
				System.out.println(i);
				if (i == 5)
					break;
			}
		}
		System.out.println("---------");
		List<Integer> il = new ArrayList<Integer>();
		for (i = 0; i < 5; i++) {
			il.add(i);
		}
		System.out.println(il);
		for (Integer liste : il) {
			System.out.println(liste);
		}
		/*
		 * System.out.println("---------");
		 * int n = 0;
		 * outerloop: for (; n < 3; n += 2) {
		 * System.out.println("outer loop" + ", n hat den wert: " + n);
		 * innerloop: for (;;) {
		 * System.out.println("inner loop" + ", n hat den wert: " + n);
		 * switch (n) {
		 * case 1: {
		 * System.out.println("break outer loop"
		 * + ", n hat den wert: " + n);
		 * break outerloop;
		 * }
		 * case 2: {
		 * n = 1;
		 * System.out.println("break inner loop"
		 * + ", n hat den wert: " + n);
		 * break innerloop;
		 * }
		 * case 3: {
		 * System.out
		 * .println("n = 3, wegen defaultzweig und incrementierung im outer loop"
		 * + ", n hat den wert: " + n);
		 * break;
		 * }
		 * default: {
		 * n = 2;
		 * System.out.println("defaultzweig"
		 * + ", n hat nun den wert: " + n);
		 * }
		 * 
		 * }
		 * }
		 * }
		 * System.out.println(n);
		 */

		System.out.println("---------");
		int n = 0;
		int z = 0;
		outerloop: 
			for (; n < 3; n += 2) {
			System.out.println("was");
			innerloop: 
				for (;;z++) {
				System.out.println("geschieht");
				switch (n) {
				case 1: {
					System.out.println("hier");
					break outerloop;
				}
				case 2: {
					n = 1;
					System.out.println("eigentlich");
					break innerloop;
				}
				case 3: {
					System.out.println("hat jemand");
					break;
				}
				default: {
					n = 2;
					System.out.println("eine ahnung?");
				}
				}
			}
		}
		System.out.println(n);
		System.out.println(z);
		System.out.println("---------");
		boolean b = false;
		for (; b;){
			System.out.println("blubb");	// keine ausgabe, weil abbruchbedingung erfüllt
		}
		/*
		System.out.println("---------");
		final boolean bf = false;
		for (; bf;){						// compilerfehler, weil syso nicht erreicht werden kann
			System.out.println("blubb");	// unreachable code, weil die abbruchbedingung 
											// als final (nicht änderbar) deklariert ist
		}
		*/	
	}

}
