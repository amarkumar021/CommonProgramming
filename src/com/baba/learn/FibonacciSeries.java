package com.baba.learn;

import java.util.Scanner;

public class FibonacciSeries {
	
	public void fibonacciSeries() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to enter generate fibonacci series");
		int number = sc.nextInt();
		
		//Logic
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for (int i = 0; i < number; i++) {			
			System.out.println(sum + "\t");
			sum = a + b;
			a = b;
			b = sum;
		}
	}

}
