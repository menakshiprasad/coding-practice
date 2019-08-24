package com.java.practice;

//Program to check if input is an integer or a string
public class Program1 {
	 static boolean isNumber(String s) 
	    { 
	        for (int i = 0; i < s.length(); i++) 
	        if (Character.isDigit(s.charAt(i))  
	            == false) 
	            return false; 
	  
	        return true; 
	    } 
	public static void main(String[] args) {

		// Saving the input in a string 
        String str = "12.5"; 

      // Function returns 1 if all elements 
      // are in range '0 - 9' 
      if (isNumber(str)) 
          System.out.println("Integer"); 

      // Function returns 0 if the  
      // input is not an integer 
      else
          System.out.println("String"); 
		
	}

}
