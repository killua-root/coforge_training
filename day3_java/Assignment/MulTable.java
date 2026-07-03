package com.coforge.d3;

import java.util.Scanner;

public class MulTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int res=0;
		
		for(int i = 0; i <= 10; i++) {
			res = n * i;
			System.out.println(n + "x" + i + "=" + res);
		}
		sc.close();

	}
}
