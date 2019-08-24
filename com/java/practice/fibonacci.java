package com.java.practice;

import java.util.Scanner;

public class fibonacci {
	


public static void main(String[]args)
{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the maximum limt to calculate fibonacci");
	int maxlimit=reader.nextInt();
	
			
	calFibonnaci(maxlimit);
	
}

public static void calFibonnaci(int ml) {

	
	int t1=0;
	int t2=1;
	int sum=0;
	int result;
	System.out.print(t1+","+t2+",");
	for(int i=1;i<=ml; i++)
	{
	result=t1+t2;
	sum=sum+result;
	System.out.print(result+",");
	t1=t2;
	t2=result;
	}
	System.out.println("sum of fibonacci no="+sum);
	
	
	
}

}