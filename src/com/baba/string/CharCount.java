package com.baba.string;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		
		String str = "Halleluya";
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for (Character c : chars) {
			if ( map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}								
		}
		
		map.forEach((K, V) -> System.out.println(K + "  " + V) );
	}

}
