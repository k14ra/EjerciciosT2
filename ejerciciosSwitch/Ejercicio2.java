package com.venancio.dam.tema2.fran.seleccionMultipleClase;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mes;
		
		System.out.print("Teclea un numero del 1 al 12: ");
		mes = sc.nextInt();
		sc.close();

		
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				System.out.println("31 dias");
			break;
			
		case 2:System.out.println("28 dias");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
				System.out.println("30 dias");
			break;
		
			
		default:System.out.println("Numero incorrecto");
			break;
		}
	}

}
