package com.gp.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsBenifitsTest1 {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Ganesh");
		names.add("Kiaan");
		names.add("Poonam");

		names.add(Integer.valueOf(100));

		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);

		}
//		names.forEach(name -> {
//			System.out.println(name);
//		});
	}
}

/**
 * 
 * Created List without using generic. i.e added integer to list of string and
 * while iterating it is throwing below exception: 
 * 
 * Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class
 * java.lang.String (java.lang.Integer and java.lang.String are in module
 * java.base of loader 'bootstrap') at
 * com.gp.client.GenericsBenifitsTest1.main(GenericsBenifitsTest1.java:17)
 * 
 */