package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio6a {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la base: ");
		int base = sc.nextInt();
		
		System.out.print("Introduzca exponente: ");
		int exp = sc.nextInt();

		sc.close();
		
		double resultado; 
		
		if(exp == 0) { // Caso base
			System.out.println("Resultado: 1");
		} else if(exp > 0) { // potencias positivas
			resultado = base;
			for(int i = 1; i < exp; i++) {
				resultado *= base;
			}
			System.out.println("Resultado: " + resultado);
		} else { // potencias negativas
			exp = exp * (-1);
			resultado = base;
			for(int i = 1; i < exp; i++) {
				resultado *= base;
			}
			System.out.println("Resultado: " + 1/resultado);
		}
		
	}
}
