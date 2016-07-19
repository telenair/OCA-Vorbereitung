package oca_vorbereitung;

abstract class Dog{						// wenn eine abstrakte methode enthalten ist, muss die klasse auch abstrakt sein
	public abstract void bark();		// abstrakte methoden haben keinen body {}	
	public void bark2(){ };
}
public class Poodle extends Dog {
	public void bark(){
		System.out.println("woof");
	}

	public static void main(String[] args) {
		

	}

}
