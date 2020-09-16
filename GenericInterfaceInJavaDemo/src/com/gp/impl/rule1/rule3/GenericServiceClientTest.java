package com.gp.impl.rule1.rule3;
public class GenericServiceClientTest {

	public static void main(String[] args) {
		GenericServiceImpl<String, Integer> genericServiceImpl = new GenericServiceImpl<String, Integer> ();
		genericServiceImpl.setValue("Implementing Generic interface by generic class with other parameters");
		genericServiceImpl.setKey(Integer.valueOf(100000));
		final String sValue = genericServiceImpl.getValue();
		final Integer sKey = genericServiceImpl.getKey();
		System.out.println("[sKey , sValue]==[" + sKey+","+sValue+"]");
	}
}
