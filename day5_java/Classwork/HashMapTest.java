package com.coforge.day5;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(1,"Java");
		m.put(2,"CHA");
		m.put(3, "dattebayo");
		System.out.println(m);
		m.put(5,"CHSKA");
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		Set<Integer> k = m.keySet();
		for (Integer ke : k) {
			System.out.println(m.get(ke));
		}
		Set<Entry<Integer,String>> e = m.entrySet();
		for (Entry<Integer,String> en:e) {
			System.out.println(en.getKey()+"=>"+en.getValue());
		}
		
		}

}
