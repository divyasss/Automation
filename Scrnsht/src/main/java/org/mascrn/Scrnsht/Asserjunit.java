package org.mascrn.Scrnsht;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Asserjunit {
	@BeforeClass
	public static void setUp() {
		System.out.println("driven initialization");
	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@Test
	public void test1() {
		String s = "Thank you placing the order";
		Assert.assertEquals("Thank you place the order", s);

	}

	@Test
	public void test2() {
		String s = "Hello ABC";
		Assert.assertTrue(s.contains("Hi"));

	}

	@Test
	public void test3() {
		String s = "Thank you place the order";
		Assert.assertNotEquals("Thank you placing the order", s);
	}

	@Test
	public void test4() {
		String s = "Hello ABC";
		Assert.assertFalse(s.contains("Hi"));

	}

	@Test
	public void test5() {
		String s = null;
		Assert.assertNotNull(s);
	}

	@Test
	public void test6() {
		Assert.fail("comparison failure");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@AfterClass
	public static void close() {
		System.out.println("Driver quit");

	}

}
