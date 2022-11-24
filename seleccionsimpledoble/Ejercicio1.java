package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio1 {

	private static final int MAYOR_EDAD = 18;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca su edad: ");
		int edad = sc.nextInt();
		sc.close();

		if (edad >= MAYOR_EDAD) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
}
