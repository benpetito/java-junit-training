package org.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise1Test {

	/**
	 * Every test method needs to be annotated with <code>@Test</code>.
	 * 
	 * Assertions are used to verify the output of the code under test matches
	 * the expected result.
	 * 
	 * The test method name is used to describe the unit being tested.
	 */
	@Test
	public void testMultiplyTwoPositiveIntegersReturnsProduct() {
		// create the test data
		Exercise1 bean = new Exercise1();
		int a = 10, b = 10;

		// call the method under test
		int result = bean.multiply(a, b);

		// verify the result
		assertEquals(100, result);
	}
}
