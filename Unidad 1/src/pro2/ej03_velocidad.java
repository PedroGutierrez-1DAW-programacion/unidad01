package pro2;

import java.util.Scanner;

public class ej03_velocidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double MB, Mbps, time;
		
		System.out.println("Tama�o de archivo (MB):");
		MB = teclado.nextInt() * 8; // Conversi�n Bit / Byte
		
		System.out.println("Velocidad de conexi�n (Mbps):");
		Mbps = teclado.nextInt();
		
		time = MB / Mbps;
		
		System.out.println("Tiempo para la descarga: " + time + " segundos");
		teclado.close();
	}
}
