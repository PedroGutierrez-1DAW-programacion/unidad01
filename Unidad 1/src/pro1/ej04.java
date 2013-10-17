package pro1;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		float n1, n2, media;
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce los dígitos para la media");
		
		n1 = teclado.nextFloat();
		n2 = teclado.nextFloat();
		
		media = (n1 + n2) / 2;
		
		System.out.println(media);
		
		teclado.close();
	}

}
