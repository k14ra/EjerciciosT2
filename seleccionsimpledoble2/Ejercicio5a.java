package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio5a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su estado civil (s, c, d, v):");
		char letra = sc.next().charAt(0);
		sc.close();
		
		if(letra == 's' || letra == 'S') {
			System.out.println("Tu estado civil es soltero/a");
		} else if(letra == 'c' || letra == 'C') {
			System.out.println("Tu estado civil es casado/a");
		} else if(letra == 'd' || letra == 'D') {
			System.out.println("Tu estado civil es divorciado/a");
		} else if(letra == 'v' || letra == 'V') {
			System.out.println("Tu estado civil es viudo/a");
		} else {
			System.out.println("Letra no válida");
		}
		
		
	}
}
