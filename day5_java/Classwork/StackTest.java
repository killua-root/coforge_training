package com.coforge.day5;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(2);
		s.push(1);
		s.push(5);
		s.push(4);
		s.push(3);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}

}
