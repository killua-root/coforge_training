package com.coforge.day4;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length; j++) {
			System.out.println(arr[i][j]);
			sum += arr[i][j];
			}
			System.out.println("sum of row" + sum);   
		}
		System.out.println(sum);
		
	}
}
// in multi dimensional arrays arr.length will represent the outer array length i.e. no. of rows kinda thing and for arr[i].length
//will represent respective row length