package org.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This is our first unit test class. The test class may contain multiple tests, but each test
 * should test a single unit of application code.
 * 
 * Maven naming conventions are for the test class to start or end with the word Test, with a few
 * extra alternatives (see https://maven.apache.org/surefire/maven-surefire-plugin/examples/inclusion-exclusion.html).
 *
 * To execute the tests, use your IDE to run this class as a Unit Test (in Eclipse, right click the class in
 * the Project Explorer or within the code editor window, Run As -> JUnit Test).
 */
public class Exercise1Test {

	/**
	 * This training uses the JUnit testing framework. JUnit requires every
	 * test method needs to be annotated with <code>@Test</code>. Alternative
	 * testing frameworks (e.g. TestNG) have their own conventions for recognising tests).
	 * 
	 * Assertions are used to verify the output of the code under test matches
	 * the expected result.
	 * 
	 * The test method name is used to describe the unit being tested and test being conducted.
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
