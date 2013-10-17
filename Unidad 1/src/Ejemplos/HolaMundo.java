package Ejemplos;

public class HolaMundo {
	
	private static int a = 2;
	private static int b;
	private static int c;

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		System.out.println("a: " + a);
		a = 5;
		b = 4;
		c = 3;
		System.out.println("a + b + c = " + (a+b+c));

	}

}
