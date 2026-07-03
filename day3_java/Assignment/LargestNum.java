package com.coforge.d3;

import java.util.Scanner;

public class LargestNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a >= b && a >= c){
			System.out.println(a + "is the Largest.");
		}
		else if(b >= a && b >= c) {
			System.out.println(b + "is the Largest.");
		}
		else  {
			System.out.println(c + "is the Largest.");
		}
		sc.close();
	}
}
