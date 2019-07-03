package com.naveen.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite--Setup System property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launch Chrome Browser");
	}
	
	@BeforeClass
	public void logIn() {
		System.out.println("@BeforeClass--Login to App");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod--Enter URl");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	@Test
	public void SearchTest() {
		System.out.println("Search Test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod--Logout from App");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass--Close Browser");
	}
	
	@AfterTest
	public void deleAllCookies() {
		System.out.println("@AfterTest--Delete all Cookies");
	}
	
	
}
