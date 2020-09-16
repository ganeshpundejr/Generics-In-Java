package com.gp.impl.rule1;

import com.gp.generic.GenericServiceInterface;

/**
 * @author GP
 *
 */
public class GenericServiceImpl<E> implements GenericServiceInterface<E> {

	private E element;

	public GenericServiceImpl() {
		super();
	}

	@Override
	public void setValue(E e) {
		this.element = e;
	}

	@Override
	public E getValue() {
		return element;
	}

}

//Rules for implementing Generic interface
/*
 * 1. if your class is implementing generic interface then your class has to be
 * generic class
 */