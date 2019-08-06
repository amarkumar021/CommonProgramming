package com.baba.learn;

import java.util.Scanner;

public class PrimeNumber {
	
	public void checkPrime() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to check prime number");
		int number = sc.nextInt();
		
		// Prime number logic
		int i = 0; 
		for (i = 2; i < number; i++) {
			if (number % i == 0)
				break;
		}
		
		if (number == i)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
	

}
