package oca_vorbereitung;

public class PrimitiveDatentypen {

	private static void ausgabe(byte b2, short s2, int i2, long l2, float f2,
			double d2, char c) {
		System.out.println("byte: " + b + " / " + "short: " + s + " / "
				+ "int: " + i + " / " + "long: " + l + " / " + "float: " + f
				+ " / " + "double: " + d + " / " + "char: " + c);
		System.out
				.println("-------------------------------------------------------------------------------------");
	}
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	
	static char c;

	public static void main(String[] args) {
		// automatische casts:
		// byte -> short -> int -> long -> float -> double
		b = 0b011;
		i = 0b011;
		s = (short) i;		// von short nach int muss gecastet werden
		l = i;				// von int nach long nicht
		d = i;
		f = (float) d;		// von double nach float muss gecastet werden
		c = (char)i;
		ausgabe(b, s, i, l, f, d,c);
		
		s = 128;
		b = (byte) s;		// wenn ausserhalb des wertebereichs kommt bei casts eine andere zahl heraus
		//b = 0b01111111;
		//b = 0b10000000;		// ohne cast und ausserhalb des wertebereichs kommt ein compilerfehler
		i = s;
		l = s;
		d = i;
		f = (float) d;
		c = (char)i;
		ausgabe(b, s, i, l, f, d,c);
		
		l = 0167;
		b = (byte) l;
		s = (short) l;
		i = (int) l;
		f = l;
		d = l;
		c = (char)i;
		ausgabe(b, s, i, l, f, d,c);
		
		d = 0x5f;
		b = (byte) d;
		s = (short) d;
		l = (long) d;
		i = (int)d;
		f = (float)d;
		c = (char)i;
		ausgabe(b, s, i, l, f, d,c);
		
		c = 'z';
		b = (byte)c;
		s = (short)c;
		l = (long)c;
		i = (int)c;
		f = (float)c;
		d = (double)c;
		ausgabe(b, s, i, l, f, d,c);

	}

}
