package pro3;

public class ej02_opLogicos {

	public static void main(String[] args) {
		System.out.println("a	b	a&&b	a||b	!a	!b");
		linea("3>5", "12!=8", 3>5, 12!=8);
		linea("5>=6", "3!=3", 5>=6, 3!=3);
		//linea(-7==8, 22);	// Al pasar un entero da el error
		linea("21!=12", "true", 21!=12, true);
		linea("4==2", "7>=-9", 4==2, 7>=-9);
	}

	private static void linea(String ta, String tb, boolean a, boolean b) {
		System.out.println();
		print(ta);
		print(tb);
		print(a&&b);
		print(a||b);
		print(!a);
		print(!b);
	}
	
	private static void print(boolean t) {
		new String();
		print(String.valueOf(t));
	}
	private static void print(String t) {
		System.out.print(t + "\t");
	}
	
}