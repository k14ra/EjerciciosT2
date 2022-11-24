package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int alturaRombo;

		do {
			System.out.print("Introduzca la altura del rombo (impar): ");
			alturaRombo = sc.nextInt();
		} while (alturaRombo % 2 == 0);

		sc.close();

		int altMitadRombo = (alturaRombo / 2) + 1;

		for (int numFila = 1; numFila <= altMitadRombo; numFila++) {
			// Espacios
			for (int col = 1; col <= altMitadRombo - numFila; col++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int col = 1; col < numFila * 2; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int numFila = 1; numFila < altMitadRombo; numFila++) {
			// Espacios
			for (int col = 1; col <= numFila; col++) {
				System.out.print(" ");
			}

			// Asteriscos
			for (int col = 1; col < (altMitadRombo - numFila) * 2; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
