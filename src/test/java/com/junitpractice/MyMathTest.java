package com.junitpractice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junitpractice.junit.MyMath;

public class MyMathTest {

	MyMath myMath = new MyMath();

	@Before // runs before every test used in case if we want to establish connection to
			// database
	public void before() {
		System.out.println("Before");

	}

	@After // runs after every test used when we want to clean after the test has completed
			// its execution
	public void after() {
		System.out.println("After");
	}

	// these are class level methods therefore this are static and are invoked
	// before class execution starts and after the class execution has completed is
	// execution

	@BeforeClass//before all the test
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass //after all the tests within the class
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test // this annotation makes sure that its a test case
	public void sum_with3numbers() {

		// absence of failure is success

		int result = myMath.sum(new int[] { 1, 2, 3 });

		// check that the result is 6
		// assertEquals(expected,actual)
		assertEquals(6, result);

		System.out.println(result);

	}

	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}

}
