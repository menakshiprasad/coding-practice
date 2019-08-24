package com.java.practice;

public class Swapflchar {

	public static void main(String[] args) {

		String s="Geeks,for,Geeks";
		String str[]=s.split(",");
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<str.length;i++)
		{
			char c[]=str[i].toCharArray();
			
			int j=c.length-1;
			int k=0;
			
			char t=c[j];
			c[j]=c[k];
			c[k]=t;
			
			sb.append(c);
			if(i != str.length-1)
			{
				sb.append(",");
			}
						
			
		}
		System.out.println(sb.toString());
		
		
	}

}
