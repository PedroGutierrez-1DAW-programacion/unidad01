package pro3;

public class ej03_masOpLogicos {

	public static void main(String[] args) {
		/*
			not (5>3)
			(5!=3) and (4>3)
			(5!=3) or (4>3)
			(5<8) and (3=3)
			not((5!=3) or (4>3))
			((4!=3) and ((3>2) or (4>8))
			not(3==5) or (4!=2)
			not(3==5) and (4!=2)
			(8>2) and (4<2) or (3!=4)
			((3>2) and (4<5) or (3!=2)) and not(2!=5)
		*/
		System.out.println( !(5>3) ); // false
		System.out.println( (5!=3) && (4>3) ); // true
		System.out.println( (5!=3) || (4>3) ); // true
		System.out.println( (5<8) && (3==3) ); // true
		System.out.println( !((5!=3) || (4>3)) ); // false
		System.out.println( ((4!=3) && ((3>2) || (4>8))) ); // true
		System.out.println( !(3==5) || (4!=2) ); // true
		System.out.println( !(3==5) && (4!=2) ); // true
		System.out.println( (8>2) && (4<2) || (3!=4) ); // true
		System.out.println( ((3>2) && (4<5) || (3!=2)) && !(2!=5) ); // false
	}

}
