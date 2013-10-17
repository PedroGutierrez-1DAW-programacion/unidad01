package pro1;

public class ej03_identificadores {
	
	public static void main(String[] args) {
		
		int año;
		int Año;
		
		año = 2013;
		Año = 2003;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Eñ año es " + año + " o " + Año);
			año++;
			Año--;
		}

	}
}
