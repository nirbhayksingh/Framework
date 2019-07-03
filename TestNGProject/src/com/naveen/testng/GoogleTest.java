package com.naveen.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		
	}
	
	@Test(priority=1, groups="Title")
	public void googleTitletest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2, groups="Logo")
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//*[@id=\"hplogo\"]/a/img")).isDisplayed();
	}
	
	@Test(priority=3, groups="Link Test")
	public void mailLinkTest() {
		boolean c=	driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority=4, groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5, groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
