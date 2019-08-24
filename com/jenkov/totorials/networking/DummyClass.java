package com.jenkov.totorials.networking;

public class DummyClass {

	public String matches(String statement, String word) {
		if (statement.contains(word)) {
			return "Menakshi Prasad " + word;
		} else {
			return "NOTHING";
		}
	}
	
	public int factor(int n)
	
	{
		int i=n;
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		{
			while(n>1) {
				 i=i*(n-1);
			n--;
		}
			return i;
			}
	}
}
