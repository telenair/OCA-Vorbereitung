package oca_vorbereitung_interfaces;

interface I1{
	int x = 2;		
}
class C3 {
	int x = 3;
}
class C7 implements I1{
	int x = 4;
}
public class Interfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		C7 c5 = new C7();
		//I1 c5 = new C3(); 	compilerfehler weil der cast con C4 nach I1 fehlt 
		I1 c4 = new C7(); 		// wenn C4 das interface implementiert, compiliert das programm
		I1 c6 = (I1) new C7();
		//C7 c7 = new I1();		compilerfehler, weil vom interface keine instanz (object) angelegt werden kann 	
		//C3 c8 = new I1();		compilerfehler, weil vom interface keine instanz (object) angelegt werden kann
		//C7 c9 = (C7) new I1();compilerfehler, weil vom interface keine instanz (object) angelegt werden kann

	}

}
