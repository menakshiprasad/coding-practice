package com.java.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveVowel2 {

	public static void main(String[] args) {

		String s = "Hello how are you";
		String v="aeiou";
		StringBuilder sb=new StringBuilder();
		for(int k=0; k<s.length();k++) {
			
			if(!contains(v, s.charAt(k)))
			{
			sb.append(s.charAt(k));	
			}
		
		}
		
	System.out.println(sb.toString());
	}
	public static boolean contains(String str,  char c)
	{
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				return true;
			}
			
		}
		return false;
		
	}
}
	
		
		
		
		
		
	
		
		
		

		
		
	
	
	

	
