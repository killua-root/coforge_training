package com.coforge.day5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		//for each data type we have wrapper classes which coverts primitive to object lets us use primitive data types as objects
		l.add(new Integer(10));//Boxing
		l.add(20); // Auto-Boxing
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(20);
		System.out.println(l);
		System.out.println(l.get(2));
		l.remove(5);
		System.out.println(l);
		//Update
		l.set(2, 40);
		System.out.println(l);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		for (Integer i : l) {
			System.out.println(i);
		}
		java.util.Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println("using it : " + it.next());
		}
	}

}
