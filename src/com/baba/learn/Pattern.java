package com.baba.learn;

import java.util.Scanner;

public class Pattern {
	Scanner sc = null;
	int number = 0;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
	}

	public void halfPyramid() {
		input();		
		//Logic
		for ( int i = 1 ; i <= number ; i++) {
			for ( int j = 1 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	 
	public void halfPyramidNumber() {
		input();		
		//Logic
		for ( int i = 1 ; i <= number ; i++) {
			for ( int j = 1 ; j <= i ; j++) {
				System.out.print( j + " ");
			}
			System.out.println();
		}
	}
	
	public void halfPyramidCharecter() {
		input();
		char first = 'A', last = (char) ('A'+number);
		System.out.println(last);
		for ( int i = 0 ; i < number ; i++) {
			for ( int j = 0 ; j < i ; j++) {
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}
	}
	
	public void inverseHalfPyramid() {

		input();
		
		for ( int i = 0 ; i < number ; i++ ) {
			for ( int j = 0 ; j < number - i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void mirrorHalfPyramid() {
		input();
		
		for ( int i = 1 ; i <= number ; i++) {
			int j = 0;
			for ( j = 1; j <= number - i ; j++) {
					System.out.print(" ");
				}
			
			for ( int k = j ; k <= number ; k++) {
				System.out.print("*");				
			}
			
			System.out.println();
		}
	}

	public void mirrorFullPyramid() {
		input();
		for ( int i = 1 ; i <= number ; i++) {
			int j = 0;
			for( j = 1 ; j <= number - i ; j++) {
				System.out.print(" ");
			}
			int k = 0;
			for ( k = j ; k <= number ; k++) {
				System.out.print("*");
			}
			
			for (int l = 1 ; l < i ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void fullNumberPyramid() {
		input();
		for ( int i = 1 ; i <= number ; i++ ) {
			int j = 0;
			for ( j = 1 ; j <= number - i ; j++) {
				System.out.print(" ");
			}
			int k = 1;
			int printNumber = i - 1;
			for ( k = 1 ; k <= i ; k++ ) {
				System.out.print(++printNumber + " ");			
			}
			
			for (int l = 1 ; l < i ; l++) {
				System.out.print(--printNumber + " ");
			}
			System.out.println();
		}
	}

	public void inverseFullPyramid() {
		
		input();
		for ( int i = 1 ; i <= number ; i++) {
			
			int j = 0;
			
			for ( j = 1; j <= ((number * 2) - (i * 2)) + 1; j++) {
				System.out.print("*" + " ");
			}
			
			System.out.println();
						
			for ( int k = 1 ; k <= i ; k++) {
				System.out.print(" " + " ");
			}
		
			
		}
	}
}
