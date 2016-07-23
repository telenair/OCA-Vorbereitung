package oca_vorbereitung_basics;

import static java.lang.System.out;
import static java.lang.Math.*;

public class ImportStaticDemo {
	public static void main(String[] args) {
		// wenn die import statics vorhanden sind:		
		out.println(PI);
		out.println(sqrt(4.0));
		
		// wenn die import statics nicht vorhanden sind:
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(4.0));
	}
}