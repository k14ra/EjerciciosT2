package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio6b {

	public static void main(String[] args) {
		
		// Versión en castellano
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una letra:");
		char letra = sc.next().toLowerCase().charAt(0);
		System.out.println("Letra introducida: " + (int)letra);
		sc.close();

		// Como ya tengo minúsculas, en lugar de empezar en 65, comienzo en 97
		// Compruebo también ü, é, luego la á, é, í, ó, ú, ñ
		if (letra >= 97 && letra <= 122 || letra == 129|| letra == 130 || letra >= 160 && letra <= 165) {
			// A partir de aquí tengo una letra
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
					letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú'
					|| letra == 'ü') {
				System.out.println("Vocal");
			} else {
				System.out.println("Consonante");
			}
		} else {
			System.out.println("No es una letra");
		}
	}
}
