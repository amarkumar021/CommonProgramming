package com.baba.string;

import java.util.stream.IntStream;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String str = "abcbja";
		char[] chars = str.toCharArray();
		int length = chars.length;
		int mid = chars.length / 2;
		int i = 0;
		for ( i = 0; i <= mid - 1 ; i ++) {
			if ( chars[i] != chars[length - i - 1])
				break;
		}
		
		if ( i == mid)
			System.out.println("Plaindrom");
		else
			System.out.println("Not a Palindrom");
		
		
	}

}
