package com.gp.client;

import com.gp.generic.MyGenericClass;

public class GenericsBenifitsTest4 {
	public static void main(String[] args) {
		MyGenericClass<Integer> object = new MyGenericClass<Integer>();
		object.setObject(10000);
		Integer integer = object.getObject();
		System.out.println(integer);
	
		MyGenericClass<String> stringobject = new MyGenericClass<String>();
		stringobject.setObject("Ganesh");
		String s = stringobject.getObject();
		System.out.println(s);
	
		MyGenericClass<Double> doubleobject = new MyGenericClass<Double>();
		doubleobject.setObject(12.2);
		Double d = doubleobject.getObject();
		System.out.println(d);
	}
}
