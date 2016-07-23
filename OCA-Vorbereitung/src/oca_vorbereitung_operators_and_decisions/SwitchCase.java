package oca_vorbereitung_operators_and_decisions;

public class SwitchCase {

	public static void main(String[] args) {
		int i = 2;
		double d = 3.5;
		final int fi = 2;
		
		switch (i){
		case 1: System.out.println("wert ist 1");
			break;
		case 2: System.out.println("wert ist 2");
			break;
		default: System.out.println("defaultbedingung");
		}
		
		System.out.println("------------------");
		switch ((int) d){			// ohne cast nach (int) kommt ein compilerfehler
		case 1: System.out.println("wert ist 1");
			break;
		case 2: System.out.println("wert ist 2");
			break;
		case 3: System.out.println("wert ist 3");
			break;
		default: System.out.println("defaultbedingung");
		}
		
		System.out.println("------------------");
		switch (i){			// ohne cast nach (int) kommt ein compilerfehler
		case 1: System.out.println("wert ist 1");
			break;
		default: System.out.println("defaultbedingung");
			break;
		case fi: System.out.println("wert ist 2");
			break;
		case 3: System.out.println("wert ist 3");
			break;
		}
	}
}
