package com.venancio.dam.tema2.fran.seleccionMultipleClase;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float nota;

		System.out.print("Teclea la nota(1 a 10): ");
		nota = sc.nextFloat();
		sc.close();

		if (nota <= 10 && nota >= 9) {
			System.out.println("Sobresaliente");
		} else if (nota < 9 && nota >= 7) {
			System.out.println("Notable");
		} else if (nota < 7 && nota >= 6) {
			System.out.println("Bien");
		} else if (nota < 6 && nota >= 5) {
			System.out.println("Suficiente");
		} else if (nota < 5 && nota >= 2) {
			System.out.println("Insuficiente");
		} else if (nota < 2 && nota >= 0) {
			System.out.println("Muy Defiente");
		} else {
			System.out.println("Nota no valida");
		}

	}

}
