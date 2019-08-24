package com.java.assignment4;

public class Factorial {

	public static void main(String[] args)
	{
	fact(3);
	}
	public static void fact(int f)
	{
	int prd=1; 

	if(f==1)
	System.out.println("Factrorial is 1");
	else if(f==2)
	System.out.println("Factorial is 2");
	else
	{
	for(int i=f;i>0;i--)
	{
	prd=prd*i;
	}
	System.out.println(prd);
	}

	}
}
