package com.coforge.day3;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 0;
		String confirmation = "";
		
		do {
		
			System.out.println("1.Addition 2.Sub 3.Mul 4.Div 5.Quit");
		
		
			System.out.println("Enter your Choice : ");
		
		
			int choice = sc.nextInt();
		

			switch(choice) {
		
	
			case 1:
			
				res = a + b;
			
				System.out.println("Addition : " + res);
			
				break;
		

			case 2:
			
				res = a - b;
		
				System.out.println("Sub : " + res);
			
				break;
		
		
			case 3:
			
				res = a * b;
			
				System.out.println("Mul  : " + res);
			
				break;
		
	
			case 4:
			
				res = a / b;
		
				System.out.println("Div  : " + res);
			
				break;
		

			case 5:
			
				System.exit(0);
		
		}
		
		System.out.println("Do you want to continue (Yes | No");
		confirmation = sc.next();
		}while(confirmation.equalsIgnoreCase("Yes")); 
			
		
	}

}
