package com.venancio.dam.tema2.fran.seleccionMultipleClase;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char letra;
		
		System.out.print("Teclea la letra de tu estado civil: ");
		letra = sc.nextLine().charAt(0);
		sc.close();

		
		switch (letra) {
		case 'S':
		case 's':System.out.println("Soltero/a");
			break;
		case 'C':
		case 'c':System.out.println("Casado/a");
			break;
		case 'V':
		case 'v':System.out.println("Viudo/a");
			break;
		case 'D':
		case 'd':System.out.println("Divorciado/a");
			break;

		default:
			break;
		}
	}

}
