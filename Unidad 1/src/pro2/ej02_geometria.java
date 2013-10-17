		/*
		 *	Calculen el perímetro y área de un rectángulo dada su base y su altura.
		 *	Calculen el perímetro y área de un círculo dado su radio.
		 *	Calculen el volumen de una esfera dado su radio.
		 *	Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		 *	Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		 */

package pro2;

import java.util.Scanner;

public class ej02_geometria {
	
	static String[] funciones = new String[7];

	public static void main(String[] args) {
		int s, s1, s2, s3, s4;
		Scanner teclado = new Scanner(System.in);
		
		funciones[0] = "Perimetro de Rectángulo";
		funciones[1] = "Área de Rectángulo";
		funciones[2] = "Perímetro de Círculo";
		funciones[3] = "Área de Círculo";
		funciones[4] = "Volumen de esfera";
		funciones[5] = "Área de Recángulo (coordenadas)";
		funciones[6] = "Hipotenusa de Triángulo";
		
		System.out.println("Funciones:");
		for(int i=0; i<funciones.length; i++)
			System.out.println("[" + i + "] " + funciones[i]);
		System.out.println("Número de función:");
		s = teclado.nextInt();
		System.out.println("-------------------------\n" + funciones[s]);
		switch(s){
			case 0:
				System.out.println("Ancho:");
				s1 = teclado.nextInt();
				System.out.println("Alto:");
				s2 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [" + s1 + ", " + s2 + "] = ");
				System.out.print(perimetoRectangulo(s1, s2));
				break;
			case 1:
				System.out.println("Ancho:");
				s1 = teclado.nextInt();
				System.out.println("Alto:");
				s2 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [" + s1 + ", " + s2 + "] = ");
				System.out.print(areaRectangulo(s1, s2));
				break;
			case 2:
				System.out.println("Radio:");
				s1 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [" + s1 + "] = ");
				System.out.print(perimetroCirculo(s1));
				break;
			case 3:
				System.out.println("Radio:");
				s1 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [" + s1 + "] = ");
				System.out.print(areaCirculo(s1));
				break;
			case 4:
				System.out.println("Radio:");
				s1 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [" + s1 + "] = ");
				System.out.print(volumenEsfera(s1));
				break;
			case 5:
				System.out.println("Coordenada X1:");
				s1 = teclado.nextInt();
				System.out.println("Coordenada Y1:");
				s2 = teclado.nextInt();
				System.out.println("Coordenada X2:");
				s3 = teclado.nextInt();
				System.out.println("Coordenada Y2:");
				s4 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [(" + s1 + ", " + s2 + "), (" + s3 + ", " + s4 +")] = ");
				System.out.print(areaRectanguloCoords(s1, s2, s3, s4));
				break;
			case 6:
				System.out.println("Cateto 1:");
				s1 = teclado.nextInt();
				System.out.println("Cateto 2:");
				s2 = teclado.nextInt();
				System.out.print(funciones[s]);
				System.out.print(" [" + s1 + ", " + s2 + "] = ");
				System.out.print(hipotenusaTriangulo(s1, s2));
				break;
			default: System.out.println("[Error] Número no válido");
		}
		teclado.close();
		
	}
	public static int perimetoRectangulo(int w, int h){
		return (2 * w) + (2 * h);
	}
	public static int areaRectangulo(int w, int h){
		return w * h;
	}
	public static double perimetroCirculo(int r){
		// p = PI * 2r
		return (r * 2) * Math.PI;
	}
	public static double areaCirculo(int r){
		// a = PI * r^2
		return Math.pow(r, 2) * Math.PI;
	}
	public static double volumenEsfera(int r){
		// v = 4/3*PI * r^3
		return (4.0f / 3.0f) * Math.PI * Math.pow(r, 3);
	}
	public static int areaRectanguloCoords(int x1, int y1, int x2, int y2){
		int w, h;
		w = x2 - x1;
		h = y2 - y1;
		return w * h;
	}
	public static double hipotenusaTriangulo(int c1, int c2){
		// h^2 = c1^2 + c2^2 
		return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	}
}
