package com.coforge.day4.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTh {
	public static void myMethod() throws FileNotFoundException {
	//int a = 10 / 0;
	FileReader f = new FileReader("Demo.txt");

	}
	public static void main(String[] args) {
		try {
			ExceptionTh.myMethod();
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		}
	}
}
