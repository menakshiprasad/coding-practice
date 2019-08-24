package com.java.assignment4;

import java.util.Arrays;
import java.util.List;

public class RemoveVowel {

	

	public static void main(String[] args) {

		String s = "Hello how are you";
		
		List <Character> l=Arrays.asList('a','e','i', 'o','u');
		
		StringBuilder sb=new StringBuilder();
		for(int k=0; k<s.length();k++) {
			if(!l.contains(s.charAt(k)))
			sb.append(s.charAt(k));	
			}
		System.out.println(sb.toString());
		}

	
	
	
	}


