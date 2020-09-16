package com.gp.client;

import java.util.ArrayList;
import java.util.List;

/**
 * In this program we have used Generic to declare list of String. Explicit type
 * casting is not required.
 **/
public class GenericsBenifitsTest3 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ganesh");
		names.add("Kiaan");
		names.add("Poonam");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
