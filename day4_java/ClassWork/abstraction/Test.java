package com.coforge.day4.abstraction;

public class Test implements C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.sum();
	}

	@Override
	public void sum() {
		System.out.println(A.a+B.a);
		
	}

}
