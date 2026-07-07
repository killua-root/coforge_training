package com.coforge.day5;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> l = new Vector<>();
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
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println("using it : " + it.next());
		}
		Enumeration<Integer> e = l.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
