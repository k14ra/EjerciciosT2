package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mes;
		// Con control de números inválidos
		do {
			System.out.print("Introduzca el mes: ");
			mes = sc.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Número no válido");
			}
		} while (mes < 1 || mes > 12);
		sc.close();

		if (mes == 2) {
			System.out.println("28 días");
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("30 días");
		} else {
			System.out.println("31 días");
		}
	}
}
