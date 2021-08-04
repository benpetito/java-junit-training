package org.training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Exercise2Test {

	private Exercise2 bean;

	@Before
	public void setup() {
		// this runs before every test method
		// we will create a new instance of our class here so that it is not null
		bean = new Exercise2();
	}

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
		Integer a = Integer.valueOf(10),
				b = Integer.valueOf(10);

		// call the method under test
		int result = bean.multiply(a, b);

		// verify the result
		assertEquals(100, result);
	}

	/**
	 * Every test method needs to be annotated with <code>@Test</code>.
	 */
	@Test
	public void testMultiplyNullAReturnsNull() {
		// create the test data
		Integer a = null;
		Integer b = Integer.valueOf(10);

		// call the method under test
		Integer result = bean.multiply(a, b);

		// verify the result
		assertNull(result);
	}

	/**
	 * Every test method needs to be annotated with <code>@Test</code>.
	 */
	@Test
	public void testMultiplyNullBReturnsNull() {
		// create the test data
		Integer a = Integer.valueOf(10);
		Integer b = null;

		// call the method under test
		Integer result = bean.multiply(a, b);

		// verify the result
		assertNull(result);
	}

}
