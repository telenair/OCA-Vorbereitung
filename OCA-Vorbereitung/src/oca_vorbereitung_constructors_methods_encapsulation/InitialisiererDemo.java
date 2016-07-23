package oca_vorbereitung_constructors_methods_encapsulation;

public class InitialisiererDemo {
	static{
		System.out.println("static eins");
	}
	static{
		System.out.println("static zwei");
	}
	{
		System.out.println("exemplar eins");
	}
	{{
		System.out.println("exemplar zwei");
	}}
	public InitialisiererDemo(String s){
		System.out.println("konstruktoraufruf");
	};
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InitialisiererDemo test = new InitialisiererDemo("blubb");

	}

}
