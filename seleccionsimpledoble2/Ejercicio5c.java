package edu.alonso.daw.tema2.seleccionsimpledoble;

import java.util.Scanner;

public class Ejercicio5c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su estado civil (s, c, d, v):");
		String letra = sc.next().toLowerCase();
		System.out.println("Letra introducida: " + letra);
		sc.close();
		
		if(letra.equals("s")) {
			System.out.println("Tu estado civil es soltero/a");
		} else if(letra.equals("c")) {
			System.out.println("Tu estado civil es casado/a");
		} else if(letra.equals("d")) {
			System.out.println("Tu estado civil es divorciado/a");
		} else if(letra.equals("v")) {
			System.out.println("Tu estado civil es viudo/a");
		} else {
			System.out.println("Letra no válida");
		}
		
		
	}
}
