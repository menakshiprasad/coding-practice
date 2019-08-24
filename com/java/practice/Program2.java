package com.java.practice;
//Java program to find whether the String has all same characters or not.
public class Program2 {

	public static void main(String[] args) {

		String str="ggggj";
		if(issame(str))
		System.out.println("String has same character");
		else
			System.out.println("String does not have same character");
		
	}

	private static boolean issame(String s) {
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(0))
			{
			return false;
			}
			
				
		}
		return true;
		
	}

}
