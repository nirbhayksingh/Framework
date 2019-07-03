package datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FresherWorldTest {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.freshersworld.com/user/register?src=fwloginregplus");
	}
	
	@DataProvider
	public void getTestData() {
		
	}
	
	
	@Test
	public void fresherWorldRegPageTest() {
		
		driver.findElement(By.name("firstname")).sendKeys("Nirbhay");		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("pass")).sendKeys("38ry9wdwsiujbc");
		driver.findElement(By.id("mobile")).sendKeys("9876432678");

		Select select=new Select(driver.findElement(By.id("currentCity")));
		select.selectByVisibleText("Bangalore");
		
		Select select1=new Select(driver.findElement(By.id("course")));
		select1.selectByVisibleText("BE/B.Tech");
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
