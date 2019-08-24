package com.java.assignment4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccOfWord {

	public static void main(String[] args) {
		String s = "six seven eight six seven seven eight six seven";

		String s1[]=s.split(" ");
		
		//System.out.println(s1[1]);
		//System.out.println(s1.length);
		Map<String, Integer> m=new HashMap();
			
		for(String str:s1)
		{
			//System.out.println(m.get(str));
			
			if(m.get(str)!=null)
				m.put(str, m.get(str)+1);
			else
				m.put(str,1);
				
		}
		System.out.println(m);
		
		///////
		int max=0;
		String max_key = "";
		
		Iterator<String> i=m.keySet().iterator();
		while(i.hasNext())
		{
			String k=i.next();
			int value=m.get(k);
			System.out.println("key="+k+"      Value="+value);
			
			if(max<value)
			{
				max=value;
				max_key = k;
				
			}
				
			
		}
		System.out.println("max_key="+max_key);
		System.out.println("maxvalue="+max);
		
		
		//System.out.println(m);
		
		//System.out.println(Collections.max(m.values()));;	
		
	
		
		
	}

}
