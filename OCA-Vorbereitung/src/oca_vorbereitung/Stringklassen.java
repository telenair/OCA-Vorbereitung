package oca_vorbereitung;

public class Stringklassen {

	static String s = "  abc  ";
	static StringBuffer sb = new StringBuffer(s);
	static StringBuilder sb2 = new StringBuilder(s);

	static StringBuffer sb3 = sb;
	static StringBuilder sb4 = sb2;

	public static void main(String[] args) {
		System.out.println(s);
		System.out.println(s.trim());	// entfernt leading/trailing whitespaces
		System.out.println(sb);
		System.out.println(sb2);

		// System.out.println(s == (String)sb); // cast geht nicht
		// System.out.println(s == sb); // vergleich mit == geht nicht
		System.out.println("--- vergleiche ---");
		System.out.println(s.equals(sb));
		System.out.println(s.equals(sb2));
		System.out.println(sb.equals(sb2));
		System.out.println(sb.equals(s));
		System.out.println(sb2.equals(s));
		System.out.println("content: " + s.contentEquals(sb));
		System.out.println("content: " + s.contentEquals(sb2));

		System.out.println(sb == sb3);
		System.out.println(sb.equals(sb3));

		System.out.println(sb2 == sb4);
		System.out.println(sb2.equals(sb4));
		System.out.println("--- andere methoden ----");
		System.out.println(s.length());
		System.out.println(s.trim().length());
		System.out.println("Characterzeichen an Position "+4 + ": " + s.charAt(4));
		System.out.println("länge von sb: " + sb.length());
		System.out.println("indexOf: " + s.indexOf("b"));
		
		sb3.append("hugo");
		System.out.println("sb3 nach append: " + sb3);
	}
}
