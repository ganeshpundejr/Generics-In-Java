/**
 * 
 */
package com.gp.generic;

/**
 * @author GP
 *
 */
public interface GenericServiceInterface<E> {
	void setValue(E e);
	E getValue();
}
