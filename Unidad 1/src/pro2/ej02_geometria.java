		/*
		 *	Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
		 *	Calculen el per�metro y �rea de un c�rculo dado su radio.
		 *	Calculen el volumen de una esfera dado su radio.
		 *	Calculen el �rea de un rect�ngulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		 *	Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
		 */

package pro2;

public class ej02_geometria {

	public static void main(String[] args) {
		System.out.println( perimetoRectangulo(5, 10) );
		System.out.println( areaRectangulo(5, 10) );
		System.out.println( perimetroCirculo(6) );
		System.out.println( areaCirculo(7) );
		System.out.println( volumenEsfera(20) );
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
		// v = 3/4*PI * r^3
		return (4.0f / 3.0f) * Math.PI * Math.pow(r, 3);
	}
}
