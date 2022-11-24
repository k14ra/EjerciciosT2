package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio13a {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduzca otro número: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int factor = 2, mcm = 1;

		
		while(num1 != 1 || num2 != 1) {
			if(num1 % factor == 0 || num2 % factor == 0) {
				System.out.println(factor);
				mcm *= factor;
				
				if(num1 % factor == 0) {
					num1 /= factor;
				}
				
				if(num2 % factor == 0) {
					num2 /= factor;
				}
				
				
			} else {
				factor++;
			}
		}
		
		System.out.println("MCM: " + mcm);

		
	}
}
