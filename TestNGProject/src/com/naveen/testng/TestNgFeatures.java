package com.naveen.testng;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPagetest() {
		System.out.println("RegistrationPageTest");
	}
	
}
