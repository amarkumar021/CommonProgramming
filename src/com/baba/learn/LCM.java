package com.baba.learn;

import java.util.Scanner;

public class LCM {

	public void lcm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int lcmResult = (n1 * n2)/ gcd(n1, n2);
		System.out.println(lcmResult);
	}

	private int gcd(int n1, int n2) {
		if (n2 == 0)
			return n1;
		
		return gcd(n2, n1 % n2);
	}
}
