package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	
	static WebDriver driver;
	
	@DataProvider(name="Authentication")
	 public static Object[][] credentials() {
        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};

  }

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider = "Authentication")
  public void test(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		driver.close();
	
	
}
}