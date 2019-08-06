package com.baba.learn;

import java.util.Scanner;

public class ArmstrongNumber {

	public void armstrongCheck() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		double result = 0; 
		int num = number;
		while ( number > 0) {
			result = result + Math.pow(number % 10, 3);
			number = number / 10;
		}
		
		if (num == result)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
	}
}
