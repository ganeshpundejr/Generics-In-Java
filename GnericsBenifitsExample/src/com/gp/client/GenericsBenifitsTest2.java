package com.gp.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * In this program we have used instanceof to check Type and based on that we
 * have printed a values from ArrayList
 **/
public class GenericsBenifitsTest2 {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Ganesh");
		names.add("Kiaan");
		names.add("Poonam");

		names.add(Integer.valueOf(100));

		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			Object object = iterator.next();
			if (object instanceof String) {
				String nameString = (String) object;
				System.out.println(nameString);

			} else if (object instanceof Integer) {
				Integer integerString = (Integer) object;
				System.out.println(integerString);

			} else {
				System.out.println(object);

			}
		}
	}
}

/**
 * 
 * Created List without using generic. i.e added integer to list of string and
 * while iterating it is throwing below exception:
 * 
 * Exception in thread "main" java.lang.ClassCastException: class
 * java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer
 * and java.lang.String are in module java.base of loader 'bootstrap') at
 * com.gp.client.GenericsBenifitsTest1.main(GenericsBenifitsTest1.java:17)
 * 
 */