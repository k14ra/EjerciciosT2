package com.venancio.dam.tema2.fran.seleccionMultipleClase;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabra;
		
		System.out.print("Teclea un pueblo: ");
		palabra = sc.nextLine();
		sc.close();
		
		switch (palabra) {
		case "Toledo":System.out.println("Toledanos");
			break;
		case "Madrid":System.out.println("Madrileños");
			break;
		case "Cuenca":System.out.println("Conquenses");
			break;
		default:System.out.println("Que pueblo mas raro");
			break;
		}


	}

}
