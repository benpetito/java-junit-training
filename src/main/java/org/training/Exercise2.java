package org.training;

public class Exercise2 {

	/**
	 * Multiplies two Integers together
	 * 
	 * @param a the first number
	 * @param b the second number
	 * @return The product of the two Integers
	 */
	public Integer multiply(final Integer a, final Integer b) {
		if (a != null && b != null) {
			return a.intValue() * b.intValue();
		}

		return null;
	}

}
