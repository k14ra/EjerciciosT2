package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;
		// Con control de números inválidos
		do {			
			System.out.print("Introduzca el día de la semana: ");
			dia = sc.nextInt();
			if(dia < 1 || dia > 7) {
				System.out.println("Número no válido");
			}
		} while(dia < 1 || dia > 7);
		sc.close();
		
		
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
		}
	}
}
