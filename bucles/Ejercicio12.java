package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la altura del rombo (impar): ");
		int alturaTriangulo = sc.nextInt();

		sc.close();

		for (int numFila = 1; numFila <= alturaTriangulo; numFila++) {
			// Espacios
			for (int col = 1; col <= alturaTriangulo - numFila; col++) {
				System.out.print(" ");
			}

			// Triángulo izda
			for (int col = 1; col <= numFila; col++) {
				System.out.print(col);
			}

			// Triángulo dcha
			for (int col = numFila - 1; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
