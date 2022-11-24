package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio6a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una letra:");
		char letra = sc.next().toLowerCase().charAt(0);
//		System.out.println("Letra introducida: " + letra);
		sc.close();

		// Como ya tengo minúsculas, en lugar de empezar en 65, comienzo en 97
		if (letra >= 97 && letra <= 122) {
			// A partir de aquí tengo una letra
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("Vocal");
			} else {
				System.out.println("Consonante");
			}
		} else {
			System.out.println("No es una letra");
		}
	}
}
