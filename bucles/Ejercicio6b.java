package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio6b {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la base: ");
		int base = sc.nextInt();

		System.out.print("Introduzca exponente: ");
		int exp = sc.nextInt();

		sc.close();

		double resultado;

		if (exp == 0) { // Caso base
			System.out.println("Resultado: 1");
		} else {
			int expAux = exp;
			if (expAux < 0) { // potencias positivas
				expAux *= -1;
			}
			resultado = base;
			for (int i = 1; i < expAux; i++) {
				resultado *= base;
			}

			if (exp < 0) {
				System.out.println("Resultado: " + 1 / resultado);
			} else {
				System.out.println("Resultado: " + resultado);
			}
		}

	}
}
