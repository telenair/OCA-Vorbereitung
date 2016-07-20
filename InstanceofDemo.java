package wbs.operators_and_decisions;

/*
 * der reference-type von feldern und variablen wird zur compile-time festgelegt
 * und ist dem compiler damit auch bekannt.
 * 
 * der object-type entscheidet sich zur laufzeit und ist dem compiler nicht bekannt
 */

public class InstanceofDemo {

	public static void main(String[] args) {
		
		CharSequence cs = "blabla";
		System.out.println(cs instanceof String);  // true
		System.out.println(cs instanceof StringBuffer);  // false
		
		cs = new StringBuffer("blabla");
		System.out.println(cs instanceof String);  // false
		System.out.println(cs instanceof StringBuffer);  // true
		
		// System.out.println(cs instanceof Integer);  compilerfehler (Integer ist final!)
		
		// o instanceof T liefert true, wenn zwischen dem object-type von o
		// und T eine IS A - Beziehung besteht
		
		// o instanceof T liefert false, wenn wenn zwischen dem object-type von o
		// und T keine IS A - Beziehung besteht
		
		// o instanceof T liefert einen compilerfehler, wenn es keine mögliche welt gibt,
		// in der zwischen dem object-type von o und T eine IS A - Beziehung besteht
		
		
		// kleine komplikation :)
		
		System.out.println(cs instanceof Number);  // false (Number ist nicht final!)
		
		cs = new StrangeNumber();
		
		System.out.println(cs instanceof Number);  // true

	}

}
