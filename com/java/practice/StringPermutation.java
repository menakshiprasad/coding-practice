package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

	public static void main(String[] args) {
		String str1 = "boybbca";
		String str2 = "yobatca";
		int j = 0;
		int flag=0;

	
			if (str1.length() != str2.length()) {
				System.out.println("length is different,String is not he permutation of other");
				flag=1;
				return;
			}

			else {
				Map m = new HashMap();
				int l=1;
		for(int i=0;i<str1.length();i++)
		{
				m.put(str1.charAt(i), l);
				l++;
		}		
				while(j<str1.length())
				{
					if(m.containsKey(str2.charAt(j))) 
					j++;
					else {
						System.out.println("No Str2 is not permutation of str1");
						flag=1;
						break;}
				}
					
				
			}
			
			
		
		if(flag==0)
			System.out.println("yes Str2 is permutation of str1");

	}

}
