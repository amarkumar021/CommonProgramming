package com.baba.learn;

import java.util.Scanner;

public class FactorsOfNumber {
	
	public void factor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		
		for ( int i = 1 ; i <= number; i++) {
			if ( number % i == 0 )
				System.out.println(i);
		}
	}
}
