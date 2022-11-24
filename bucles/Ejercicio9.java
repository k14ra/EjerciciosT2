package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		final int DIVISOR = 8;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		int numDecimal = sc.nextInt();
		sc.close();
		
		String resultado = "";
		
		while(numDecimal != 0) {
			resultado = numDecimal % DIVISOR + resultado;
			numDecimal /= DIVISOR;
		}
		
		System.out.println(resultado);

	}
}
