package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio5b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su estado civil (s, c, d, v):");
		char letra = sc.next().toLowerCase().charAt(0);
		System.out.println("Letra introducida: " + letra);
		sc.close();
		
		if(letra == 's') {
			System.out.println("Tu estado civil es soltero/a");
		} else if(letra == 'c') {
			System.out.println("Tu estado civil es casado/a");
		} else if(letra == 'd') {
			System.out.println("Tu estado civil es divorciado/a");
		} else if(letra == 'v') {
			System.out.println("Tu estado civil es viudo/a");
		} else {
			System.out.println("Letra no válida");
		}
		
		
	}
}
