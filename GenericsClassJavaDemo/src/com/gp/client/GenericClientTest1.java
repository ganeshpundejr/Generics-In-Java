package com.gp.client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.gp.generic.MyGenericClass;
import com.gp.generic.MyGenericClass2;

public class GenericClientTest1 {
	public static void main(String[] args) {
		MyGenericClass<Integer> genericClass1 = new MyGenericClass<Integer>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(1000);
		list1.add(1001);
		list1.add(1002);

		genericClass1.setList(list1);

		List<Integer> list = genericClass1.getList();
		list.forEach(System.out::println);
		System.out.println("--------------------------------------");

		MyGenericClass<String> genericClass2 = new MyGenericClass<String>();
		List<String> lists = new LinkedList<String>();
		lists.add("Ganesh");
		lists.add("Kiaan");
		lists.add("Poonam");

		genericClass2.setList(lists);
		genericClass2.getList().forEach(System.out::println);

		System.out.println("--------------------------------------");
		
		MyGenericClass2<Integer,String> myGenericClass2 = new MyGenericClass2<Integer,String>(10001,"Kiaan Punde");
		System.out.println(myGenericClass2.getKey()+":"+myGenericClass2.getValue());
		
		System.out.println("--------------------------------------");
		
		MyGenericClass2<String,Integer> myGenericClass3 = new MyGenericClass2<String,Integer>("Ganesh Punde",10001);
		System.out.println(myGenericClass3.getKey()+":"+myGenericClass3.getValue());
	}
}
