package com.coforge.day4.abstraction;

public class Square extends Figure{
	public Square() {
		super(23);
	}
	public void area() {
		int areaOfSq = getA() * getA();
		System.out.println(areaOfSq);
	}

}
