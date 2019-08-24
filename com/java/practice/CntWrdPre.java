package com.java.practice;

import java.util.HashMap;

//Count word present is a String
public class CntWrdPre {

	public static void main(String[] args) {

		String s = "six seven eight six seven seven eight six seven";
		HashMap<String, Integer> m=new HashMap();
		String str[]=s.split(" ");
		
		for(String s1:str)
		{
			if(m.get(s1)!=null)
			{
				m.put(s1, m.get(s1)+1);
			}
			else
			{
				m.put(s1, 1);
			}
			
		}
		
		System.out.println(m);
		int maxval=0;
		String maxkey="";
		
		for(String k: m.keySet())
		{
			
			int value=m.get(k);
			System.out.println("key= "+k + "Value="+value);
			
			if(maxval<value)
			{
				maxval=value;
				maxkey=k;
			}
			
		}
		
		System.out.println("Word is "+maxkey);
		System.out.println("Occ of word "+maxval);
		
		
		
		
	}

}
