package com.coforge.day4;

public class Rectangle extends Figure {
	public Rectangle() {
		super(10, 20);
	}
	public void area() {
		int areaOfRect = getL() * getB();
		System.out.println(areaOfRect);
	}
}
