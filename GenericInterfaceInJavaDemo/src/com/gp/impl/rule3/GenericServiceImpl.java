package com.gp.impl.rule3;

import com.gp.generic.GenericServiceInterface;

/**
 * @author GP
 *
 */
public class GenericServiceImpl<E, K> implements GenericServiceInterface<E> {
	private E element;
	private K key;

	@Override
	public void setValue(E e) {
		this.element=e;
	}

	@Override
	public E getValue() {
		return element;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

}