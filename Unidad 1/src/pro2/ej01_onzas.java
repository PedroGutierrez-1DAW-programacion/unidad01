package pro2;

import java.util.Scanner;

public class ej01_onzas {

	public static void main(String[] args) {
		float peso = 0.0f, onzas;
		final float onzasPorKilo = 35.2739619f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el peso en kilogramos:");
		peso = teclado.nextFloat();
		onzas = peso * onzasPorKilo;
		System.out.println("El peso en onzas es: " + onzas + "onzas.");
		teclado.close();

	}

}
