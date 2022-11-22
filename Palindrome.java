package ineuron;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		      String original, reverse = ""; 
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Entered a value to check if it is a palindrome");  
		      original = in.nextLine();   
		      int length = original.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + original.charAt(i);  
		      if (original.equals(reverse))  
		         System.out.println("Entered value is a palindrome.");  
		      else  
		         System.out.println("Entered value isn't a palindrome.");   
		   }  
	}

