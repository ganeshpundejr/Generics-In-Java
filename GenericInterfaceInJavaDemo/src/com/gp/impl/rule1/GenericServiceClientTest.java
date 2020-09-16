package com.gp.impl.rule1;

public class GenericServiceClientTest {

	public static void main(String[] args) {
		GenericServiceImpl<Integer> genericServiceImpl = new GenericServiceImpl<Integer>();
		genericServiceImpl.setValue(1000);
		Integer value = genericServiceImpl.getValue();
		System.out.println("Value from Generic Service ::"+value);
	}
}
