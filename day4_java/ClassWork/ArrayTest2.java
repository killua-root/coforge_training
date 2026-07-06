package com.coforge.day4;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int arr[] = new int[5];
		System.out.println("Enter :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		
		System.out.println("Sum : " + sum);
		
	}
}
