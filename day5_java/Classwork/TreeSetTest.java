package com.coforge.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest {

	public static void main(String[] args) {
		SortedSet<Integer> l = new TreeSet<>(Collections.reverseOrder());
		//for each data type we have wrapper classes which coverts primitive to object lets us use primitive data types as objects
		l.add(new Integer(10));
		l.add(20); 
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(20);
		System.out.println(l);	
		for (Integer i : l) {
			System.out.println(i);
		}
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.println("using it : " + it.next());
		}		
	}
}
