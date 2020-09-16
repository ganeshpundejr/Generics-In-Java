package com.gp.impl.rule1.rule2;

import com.gp.generic.GenericServiceInterface;

/**
 * @author GP
 *
 */
public class GenericServiceImpl implements GenericServiceInterface<String> {

	private String element;

	public GenericServiceImpl() {
		super();
	}

	@Override
	public void setValue(String e) {
		this.element = e;
	}

	@Override
	public String getValue() {
		return element;
	}

}

//Rules for implementing Generic interface
/*
 * 1. if your class is implementing generic interface then your class has to be
 * generic class
 */