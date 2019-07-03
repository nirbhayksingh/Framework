package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "emailId"})
	public void yahooLoginTest(String browser, String url, String emailId) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			
		}
		driver.get("url");
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("emailId");
		driver.findElement(By.id("login-signin")).click();
		
		
		
		
	}
	
}
