package rto_project;

import java.util.Scanner;

public class RTO_Licence_Project {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your age:"); {
			
		int age = sc.nextInt(); 
			
			if(age>=18 && age<=75) {
				
				System.out.println("Your Elligible for licence");
			} else if (age<18) {
				
				int wait=18-age;
				
				System.out.println("You are not Elligible for licence");
				System.out.println("Wait for"+wait +"Years of licence");
			} else {
				
				System.out.println("Age bar");
				System.out.println("Not Elligible for Licence");
			}
			sc.close();
		}
	}
}
