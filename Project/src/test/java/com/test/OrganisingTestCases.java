package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrganisingTestCases {
	
	String testdata="Welcome max123";
	String tempdata=testdata.split("")[1];
	
	@Test
	public void e() {
		System.out.println("Execute test case E");
		Assert.assertEquals(testdata,"max1123","case failed");
	}
	@Test
	public void d() {
		System.out.println("Execute test case D");
	}
	@Test
	public void c() {
		System.out.println("Execute test case C");
	}
	@Test
	public void b() {
		System.out.println("Execute test case B");
	}
	@Test
	public void a() {
		System.out.println("Execute test case A");
	}
}
