package com.baba.learn;

import java.util.Scanner;

public class Factorial {

	public void findFactorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int factorial = 1;
		for ( int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
	
}