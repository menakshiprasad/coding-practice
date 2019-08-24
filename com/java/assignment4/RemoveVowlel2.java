package com.java.assignment4;

public class RemoveVowlel2 {

	public static void main(String[] args) {
		String s = "Hello how are you";
		
		String s1=s.replaceAll("[aeiouAEIOU]","%");

		String s2=s1.replaceAll("%", "");

		System.out.println(s2);
	}

}
