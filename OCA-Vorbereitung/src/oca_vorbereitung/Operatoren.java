package oca_vorbereitung;

public class Operatoren {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;
		int d = Integer.MAX_VALUE;
		int e = 0b0100;

		if (a == b) {
			System.out.println("a ist gleich b");
		} else {
			System.out.println("a ist ungleich b");
		}
		System.out.println("-----------------------------");
		if (a < b && a >= b) {
			System.out.println("a < b && a >= b" + " ist true");
		} else {
			System.out.println("a < b && a >= b" + " ist false");
		}
		if (a >= b && a < b) {
			System.out.println("a >= b && a < b" + " ist true");
		} else {
			System.out.println("a >= b && a < b" + " ist false");
		}
		if (a < b && b >= c) {
			System.out.println("a < b && b >= c" + " ist true");
		} else {
			System.out.println("a < b && b >= c" + " ist false");
		}
		System.out.println("-----------------------------");
		if (a < b & a >= b) {
			System.out.println("a < b & a >= b" + " ist true");
		} else {
			System.out.println("a < b & a >= b" + " ist false");
		}
		if (a >= b & a < b) {
			System.out.println("a >= b & a < b" + " ist true");
		} else {
			System.out.println("a >= b & a < b" + " ist false");
		}
		if (a < b & b >= c) {
			System.out.println("a < b & b >= c" + " ist true");
		} else {
			System.out.println("a < b & b >= c" + " ist false");
		}
		System.out.println("-----------------------------");
		if (a < b || a >= b) {
			System.out.println("a < b || a >= b" + " ist true");
		} else {
			System.out.println("a < b || a >= b" + " ist false");
		}
		if (a >= b || a < b) {
			System.out.println("a >= b || a < b" + " ist true");
		} else {
			System.out.println("a >= b || a < b" + " ist false");
		}
		if (a < b || b >= c) {
			System.out.println("a < b || b >= c" + " ist true");
		} else {
			System.out.println("a < b || b >= c" + " ist false");
		}
		if (a > b || a >= c) {
			System.out.println("a < b || b >= c" + " ist true");
		} else {
			System.out.println("a < b || b >= c" + " ist false");
		}
		System.out.println("-----------------------------");
		if (a < b | a >= b) {
			System.out.println("a < b | a >= b" + " ist true");
		} else {
			System.out.println("a < b | a >= b" + " ist false");
		}
		if (a >= b | a < b) {
			System.out.println("a >= b | a < b" + " ist true");
		} else {
			System.out.println("a >= b | a < b" + " ist false");
		}
		if (a < b | b >= c) {
			System.out.println("a < b | b >= c" + " ist true");
		} else {
			System.out.println("a < b | b >= c" + " ist false");
		}
		if (a > b | a >= c) {
			System.out.println("a < b | b >= c" + " ist true");
		} else {
			System.out.println("a < b | b >= c" + " ist false");
		}
		System.out.println("-----------------------------");
		if (!(a > b)) {
			System.out.println("!(a > b)" + " ist true");
		} else {
			System.out.println("!(a > b)" + " ist false");
		}
		if (!(a < b)) {
			System.out.println("!(a < b)" + " ist true");
		} else {
			System.out.println("!(a < b)" + " ist false");
		}
		System.out.println("-----------------------------");
		if (a < b ^ b < c) {
			System.out.println("a < b ^ b < c " + " ist true");
		} else {
			System.out.println("a < b ^ b < c " + " ist false");
		}
		if (a < b ^ b >= c) {
			System.out.println("a < b ^ b >= c " + " ist true");
		} else {
			System.out.println("a < b ^ b >= c " + " ist false");
		}
		if (a > b ^ b < c) {
			System.out.println("a > b ^ b < c " + " ist true");
		} else {
			System.out.println("a > b ^ b < c " + " ist false");
		}
		if (a != b ^ b < c) {
			System.out.println("a != b ^ b < c " + " ist true");
		} else {
			System.out.println("a != b ^ b < c " + " ist false");
		}
		System.out.println("-----------------------------");
		if (d == 0) {
			System.out.println("d == 0" + " ist true");
		} else {
			System.out.println("d == 0" + " ist false");
		}
		System.out.println("d hat den wert: " + d);
		System.out.println("~d hat den wert: " + ~d);
		System.out.println("e hat den wert: " + e);
		System.out.println("~e hat den wert: " + ~e);
		System.out.println("-----------------------------");
		System.out.println("a = 100: " + (a = 100) + " / " + " (a %=7): "
				+ (a %= 7));
		System.out.println("-----------------------------");

		boolean b1, b2, b3;
		b1 = true;
		b2 = false;
		b3 = b1 || (b2 = true);		// weil b1 bereits wahr ist, bekommt b2 keine
								// neue zuweisung
		System.out.println("b2 hat den wert: " + b2);
		System.out.println("aber b3 = b1 || (b2 = true) ergibt "
				+ (b3 = b1 || (b2 = true)));
		b1 = true;
		b2 = false;
		b3 = b1 | (b2 = true);		// nun werden beide operanden ausgwertet und b2
								// bekommt eine neue zuweisung
		System.out.println(b2);
		System.out.println(b3);
		b1 = true;
		b2 = false;
		b3 = b2 || (b1 = false);	// weil b2 false ist, bekommt b1 eine neue
									// zuweisung
		System.out.println(b1);
		System.out.println("-----------------------------");
		b1 = true;
		b2 = false;
		b3 = b1 && (b2 = true);		// weil b1 true ist, bekommt b2 keine neue
								// zuweisung
		System.out.println(b2);
		b1 = true;
		b2 = false;
		b3 = b2 && (b1 = false);	// weil b2 false ist, bekommt b1 eine neue
									// zuweisung
		System.out.println(b1);
	}

}
