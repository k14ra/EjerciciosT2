package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio3a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Sin control de números inválidos
		System.out.print("Introduzca el día de la semana en formato numérico: ");
		int dia = sc.nextInt();
		sc.close();

		
		// Opción poco eficiente
		/*if (dia == 1) {
			System.out.println("Lunes");
		}	
		if (dia == 2) {
			System.out.println("Martes");
		}
		if (dia == 3) {
			System.out.println("Miércoles");
		}
		if (dia == 4) {
			System.out.println("Jueves");
		}
		if (dia == 5) {
			System.out.println("Viernes");
		}
		if (dia == 6) {
			System.out.println("Sábado");
		}
		if (dia == 7) {
			System.out.println("Domingo");
		}
		if (dia > 7 || dia <= 0) {
			System.out.println("No es un día válido");
		}*/
		
		// Opción más eficiente
		if (dia == 1) {
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
		} else if (dia == 3) {
			System.out.println("Miércoles");
		} else if (dia == 4) {
			System.out.println("Jueves");
		} else if (dia == 5) {
			System.out.println("Viernes");
		} else if (dia == 6) {
			System.out.println("Sábado");
		} else if (dia == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("No es un día válido");
		}
	}
}
