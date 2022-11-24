package edu.alonso.daw.tema2.bucles;

import java.util.Scanner;

public class Ejercicio13b {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduzca otro número: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int sum1 = num1, sum2 = num2;
		

		while(sum1 != sum2) {
			if(sum1 > sum2) {
				sum2 += num2;
			} else {
				sum1 += num1;
			}
		}
		
		System.out.println("MCM: " + sum1);
	
		
	}
}
