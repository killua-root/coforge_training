package com.coforge.day4;

public class AreaCalApp {

	public static void main(String[] args) {
	/*	Triangle t = new Triangle();
		t.area();
		Square s = new Square();
		s.area();
		Rectangle r = new Rectangle();
		r.area();*/
		Figure f;
		f= new Triangle();
		f.area();
		f= new Square();
		f.area();
		f= new Rectangle();
		f.area();
		/* Rectangle rect = (Rectangle) new Figure(5); REVERSE IS NOT POSSIBLE */
	}
}