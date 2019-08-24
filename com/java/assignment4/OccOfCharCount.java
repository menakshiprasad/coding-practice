package com.java.assignment4;

import java.util.*;


public class OccOfCharCount {

	public static void main(String[] args) {

		String s="Hello How are You";
		String v="aeiou";
		Map<Character, Integer> map=new HashMap();
		
		
		for(int i=0; i<s.length(); i++)
		{
			if(map.get(s.charAt(i))!=null)
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
				
			}
			else
			{
			map.put(s.charAt(i), 1);
			}
		}
		
		for(int i=0;i<v.length();i++)
	
		{
			if(map.containsKey(v.charAt(i)))
			{
				int value=map.get(v.charAt(i));
				System.out.println("Vowel: "+v.charAt(i)+"  count: "+value);
				
			}
		}
		//System.out.println(map);
	}

}
