package com.venancio.dam.tema2.fran.seleccionMultipleClase;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nota;
		
		System.out.print("Teclea la nota(1 a 10): ");
		nota = sc.nextInt();
		sc.close();
		
		
		switch(nota){
		case 10:
		case 9:System.out.println("Sobresaliente");
			break;
		case 8:
		case 7:System.out.println("Notable");
			break;
		case 6:System.out.println("Bien");
			break;
		case 5:System.out.println("Suficiente");
			break;
		case 4:	
		case 3:System.out.println("Insuficiente");
			break;
		case 2:
		case 1:System.out.println("Muy Deficiente");
			break;
		default:System.out.println("Nota no valida");
			
		}
	}

}
