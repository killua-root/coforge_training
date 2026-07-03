package com.coforge.d3;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int s = (n * (n+1))/2;
		System.out.println("Sum of " + n +" natural numbers : " + s);
		sc.close();
	}

}
