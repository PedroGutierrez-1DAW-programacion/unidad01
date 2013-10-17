package pro1;

public class ej05_operaciones {

	static double PI =  Math.PI;
	
	public static void main(String[] args) {
		boolean A, B, C, D, E, F;
		int X, Y, Z;
				
		A = ((4-2)*(5+1)/2)>2-(4+3);
		
		B = (6+3)>8 && (6-1) * 2 < 8 || 23 == 8;
		
			X = 7; Y = 0; Z = 2;
		C = (1.0 < X) && (X < Z+7.0); //donde X=7 y Z=2

			X = 1; Y = 4; Z = 10;
		D = (PI * Math.pow(X, 2)) > Y || 2 * PI * X <= Z; //donde X=1, Y=4, Z=10, PI=3.14
		
		E = X>3 && Y==4 || X + Y <= Z; //donde X=1, Y=4, Z=10
		
		F = X>3 && (Y==4 || X + Y <= Z); //donde X=1, Y=4, Z=10

		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
		System.out.println("E = " + E);
		System.out.println("F = " + F);

	}

}
