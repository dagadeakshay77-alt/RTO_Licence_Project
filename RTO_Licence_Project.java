package rto_project;

import java.util.Scanner;

public class Test {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in); 
			
			System.out.println("Enter Your age:");
			
			int age =sc.nextInt();
		    if (age>=18 && age<=75) {
		    	
		    	System.out.println("You are eligible for licence");
		    }
		    else if (age<18) {
		    	
		    	int wait = 18-age;
		    	
		    		System.out.println("You are not eligible for licence");
		    		System.out.println("Wait for "+wait +"Years for the licence");
		    	}
		    	else
		    	{
		    		System.out.println("Age bar");
		    		System.out.println("You are not eligible for licence");
		    	}
		    	sc.close();
	}
}
