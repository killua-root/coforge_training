package com.coforge.d3;

import java.util.Scanner;

public class GradeCa {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int m = sc.nextInt();
		if(m>=90) {
			System.out.println("Grade-A");
		}
		else if(m<90 && m>=80) {
			System.out.println("Grade-B");
		}
		else if(m<80 && m>=70) {
			System.out.println("Grade-C");
		}
		else if(m<70 && m>=60) {
			System.out.println("Grade-D");
		}
		else {
			System.out.println("F");
		}
		sc.close();
	}

}
