package com.baba.learn;

import java.util.Scanner;

public class PalindromNumber {

	public void palindrom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int rev = 0;
		int num = number;
		while ( number > 0) {
			rev = ( rev * 10 ) + ( number % 10 );
			number = number / 10;
		}
		
		if ( rev == num)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
	}
}
