package com.gp.impl.rule2;

public class GenericServiceClientTest {

	public static void main(String[] args) {
		GenericServiceImpl genericServiceImpl = new GenericServiceImpl();
		genericServiceImpl.setValue("Implementing generic interface using specific data Type");
		Object value = genericServiceImpl.getValue();
		final String sValue = (String) value;
		System.out.println("Value from Generic Service ::" + sValue);
	}
}
