package com.baba.learn;

import java.util.Scanner;

public class GCD {
	
	public void gcd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int gcdNumber = gcdCalculate(number1, number2);
		System.out.println(gcdNumber);
	}

	private int gcdCalculate(int a, int b) {
		
		if (b == 0)
			return a;
		
		return gcdCalculate(b, a % b);
	}
}
