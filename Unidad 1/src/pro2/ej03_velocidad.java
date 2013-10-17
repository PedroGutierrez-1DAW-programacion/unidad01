package pro2;

import java.util.Scanner;

public class ej03_velocidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double MB, Mbps, time;
		
		System.out.println("Tamaño de archivo (MB):");
		MB = teclado.nextInt() * 8; // Conversión Bit / Byte
		
		System.out.println("Velocidad de conexión (Mbps):");
		Mbps = teclado.nextInt();
		
		time = MB / Mbps;
		
		System.out.println("Tiempo para la descarga: " + time + " segundos");
		teclado.close();
	}
}
