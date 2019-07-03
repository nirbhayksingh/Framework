package com.naveen.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts {
	
	WebDriver driver;
	
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		WebElement myLoink=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
	
		Assert.assertTrue(myLoink.isDisplayed());
		
		myLoink.click();
		
		driver.close();
		
		
		
	
	
	}
	
	

}
