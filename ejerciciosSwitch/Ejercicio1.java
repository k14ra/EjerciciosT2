package com.venancio.dam.tema2.fran.seleccionMultipleClase;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		
		System.out.print("Teclea un numero del 1 al 7: ");
		numero = sc.nextInt();
		sc.close();

		//Seleccion multiple

		switch ( numero ){
		case 1: System.out.println("Lunes");
				break;
		case 2: System.out.println("Martes");
				break;
		case 3: System.out.println("Miercoles");
				break;
		case 4: System.out.println("Jueves");
				break;
		case 5: System.out.println("Viernes");
				break;
		case 6: System.out.println("Sabado");
				break;
		case 7: System.out.println("Domingo");
				break;
		default:System.out.println("Error: numero de 1 a 7");
		}
		
		
		
		
	}

}
