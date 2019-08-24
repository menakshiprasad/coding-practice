package com.java.assignment4;
//Remove vowels from a String, pront rest String
public class CheckVowels {

	public static boolean contains(String str, char c)
	{
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)==c)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {

		String s = "Hello how are you";
		String v="aeiou";
		StringBuilder sb=new StringBuilder();
		//String s1=s.replaceAll("[aeiou]", "");
		//System.out.println(s1);
		
		for(int i=0;i<s.length();i++)
		{
			if(!contains(v,s.charAt(i)))
			{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}