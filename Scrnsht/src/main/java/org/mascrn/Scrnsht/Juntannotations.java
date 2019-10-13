package org.mascrn.Scrnsht;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Juntannotations {
	@BeforeClass
	public static void setUp() {
		System.out.println("Driven initializtion");
	}
	@Before
	public void login() {
		System.out.println("login the application");

	}
	@Test
	public void testcase1() {
		System.out.println("search and add to cart");

	}
	@Test
	public void testcase2() {
		System.out.println("menu to drill down page and add to cart");

	}
	@After
	public void logout() {
		System.out.println("logout the application");

	}
	@AfterClass
	public static void tearDown() {
		System.out.println("driver quit");

	}

}
