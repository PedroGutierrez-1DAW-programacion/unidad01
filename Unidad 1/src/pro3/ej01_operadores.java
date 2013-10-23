package pro3;

public class ej01_operadores {
	public static void main(String[] args) {
		// (-5^2 + 10) * 3
		System.out.println( (Math.pow(-5, 2) + 10) * 3 );
		// 25.3 - 53 / 10
		System.out.println( 35.3 - 53 / 10 );
		// 1 + 5 % 1.5 * 8 / 2
		System.out.println( 1 + 5 % 1.5 * 8 / 2 );
		// - (-2^5 + 18 / 5)
		System.out.println( - (Math.pow(-2, 5) + 18 / 5) );
		// 65 / 3 / 4.0 * 3
		System.out.println( 65 / 3 / 4.0 * 3 );
		// 44 % 10 + 7 - 25^10 - 2
		System.out.println( 44 % 10 + 7 - Math.pow(25, 10) - 2 );
		// 10 % 4 + 6 / 2
		System.out.println( 10 % 4 + 6 / 2 );
		// (|4 - 20 / 3 |)^3
		System.out.println( Math.pow((4 - 20 / 3 ), 3) );
		// sqrt(4.5 - 5.0) + 7 * 3
		System.out.println( Math.sqrt(4.5 - 5.0) + 7 * 3 );
		// 3 * 30 / 3 + 10 % 3
		System.out.println( 3 * 30 / 3 + 10 % 3 );
		// 3L^3
		System.out.println( Math.pow(3l, 3) );
		// (36.0 / 4) + (5 * 3)
		System.out.println( (36.0 / 4) + (5 * 3) );
		// (28 / 7) * 2
		System.out.println( (28 / 7) * 2 );
		// (13 * 3) % 10
		System.out.println( (13 * 3) % 10 );
		// 2 ^ 3 ^ 3
		System.out.println( Math.pow(2, Math.pow(3, 3) ) );
	}
}
