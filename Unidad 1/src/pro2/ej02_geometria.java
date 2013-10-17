		/*
		 *	Calculen el perímetro y área de un rectángulo dada su base y su altura.
		 *	Calculen el perímetro y área de un círculo dado su radio.
		 *	Calculen el volumen de una esfera dado su radio.
		 *	Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
		 *	Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
		 */

package pro2;

public class ej02_geometria {

	public static void main(String[] args) {
		System.out.println( "perimetoRectangulo:		" +	perimetoRectangulo(5, 10) );
		System.out.println( "areaRectangulo:			" + areaRectangulo(5, 10) );
		System.out.println( "perimetroCirculo:		" + perimetroCirculo(6) );
		System.out.println( "areaCirculo:			" + areaCirculo(7) );
		System.out.println( "volumenEsfera:			" + volumenEsfera(20) );
		System.out.println( "areaRectanguloCoords:		" + areaRectanguloCoords(5, 5, 10, 15) );
		System.out.println( "hipotenusaTriangulo:		" + hipotenusaTriangulo(3, 4) );
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
		return (2 * w) + (2 * h);
	}
	public static double hipotenusaTriangulo(int c1, int c2){
		// h^2 = c1^2 + c2^2 
		return Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	}
}
