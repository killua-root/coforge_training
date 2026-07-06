package com.coforge.day4.abstraction;

public class Triangle extends Figure{
	public Triangle() {
		super(98L,35L);
	}
	public void area() {
		double areaOfT = 0.5 * getBa() * getH();
		System.out.println(areaOfT);
	}

}
