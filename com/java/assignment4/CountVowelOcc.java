package com.java.assignment4;

public class CountVowelOcc {

	public static void main(String[] args) {

		String s = "Hello how are you";
		String v = "aeiou";
		int cnt = 0;
		for (int k = 0; k < v.length(); k++) {
			for (int j = 0; j < s.length(); j++) {
				if (v.charAt(k) == s.charAt(j)) {
					cnt = cnt + 1;
					
				}
				
				

			}
			System.out.println("Vowel= "+v.charAt(k)+" Count="+cnt);
			cnt=0;
			
		}
		
	}
}
