package com.java.practice;

public class RevStringWord {

	public static void main(String[] args) {

		String s="My name is Menakshi";
		String str[]=s.split(" ");
		System.out.println(str.length);
		
		for(int i=str.length-1; i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
		

	}

}
