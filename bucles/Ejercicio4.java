package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la altura: ");
		int alturaFinal = sc.nextInt();

		sc.close();
		
		for(int alturaAltual=1; alturaAltual <= alturaFinal; alturaAltual++) {
			for(int col = 1; col <= alturaAltual; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
