package com.java.practice;

import java.util.HashMap;

//find one extra character in second string as compare to first String for eg: str1="abcd"; str2 b=abcde" output e;;
//str1=abcd; str2=adbcd, output=d
public class Program3 {

	public static void main(String[] args) {

		String str1="dabc";
		String str2="abbcd";
		int flag=1;
		HashMap<Character, Integer> map=new HashMap();
		for(int i=0;i<str2.length();i++)
		{
		if(map.get(str2.charAt(i))!=null)
			map.put(str2.charAt(i), map.get(str2.charAt(i))+1);
		else
			map.put(str2.charAt(i),1);
			
		}
		System.out.println(map);
	
		for(int j=0;j<str1.length();j++) {
			if(map.get(str1.charAt(j))==1)
			{
				
				map.remove(str1.charAt(j));
			}
		
			else {
				System.out.println("Extra character is "+str1.charAt(j));
				flag=2;
			}
		
		}
		
		if(flag==1)
		{
		for(char c: map.keySet())
		{
			System.out.println("Extra Character is: "+c);
			
		
		}
		}		
	}
	
	

}

