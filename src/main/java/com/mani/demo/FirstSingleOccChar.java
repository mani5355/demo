package com.mani.demo;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstSingleOccChar {

	public static void main(String[] args) {

		System.out.println(singleOcc("geeksforgeek"));

	}

	private static String singleOcc(String str) {

		LinkedHashMap<Character, Integer> tempMap= new LinkedHashMap<Character, Integer>();

		for(int i =0; i<str.length();i++) {
			
			if(tempMap.containsKey(str.charAt(i))) {
				tempMap.put(str.charAt(i), tempMap.get(str.charAt(i))+1);
			}else {
				tempMap.put(str.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> ch : tempMap.entrySet()) {
			
			if(ch.getValue()==1) {
				return ch.getKey() + "";
			}
			
		}
		
		return "No non-repeating char";
	}

}
