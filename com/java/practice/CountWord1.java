package com.java.practice;

public class CountWord1 {

	public static void main(String[] args) {
		String s="My name is not Neha";
		int wc = 0;
int i=0;
		int flag = 1;
		while(i<s.length())
		{
			if(s.charAt(i)==' ')
			{
				flag=1;
				
			}
			else if(flag==1)
			{
				flag=2;
				wc=wc+1;
			}
			i++;	
		}
		System.out.println(wc);

	}

}
