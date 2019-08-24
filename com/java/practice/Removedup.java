package com.java.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Removedup {

	public static void main(String[] args) {

		String str="Javavaes";
		Set<Character> s=new LinkedHashSet();
		for(int i=0; i<str.length();i++)
		{
		s.add(str.charAt(i));
		}
		
		for(char c:s)
		{
			System.out.print(c);
		}
		System.out.println();
		
		Map<Character,Integer> m=new HashMap();
		for(int i=0; i<str.length();i++)
		{
			if(m.get(str.charAt(i))!=null)
				m.put(str.charAt(i),m.get(str.charAt(i))+1);
			else
				m.put(str.charAt(i),1);
				
					
			
		}
		
		System.out.println(m);
		int max=0;
		char max_char='a';
		Iterator<Character> i=m.keySet().iterator();	
		while(i.hasNext())
		{
			char k=i.next();
		int v=m.get(k);
		if(v>max)
		{
			max=v;
			max_char=k;
		}
		}
		
		System.out.println(max);
		System.out.println(max_char);
		
	}

}
