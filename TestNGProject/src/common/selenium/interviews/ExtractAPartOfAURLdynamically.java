package common.selenium.interviews;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractAPartOfAURLdynamically {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.quora.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//*[contains(.,.)]"));
		//return element.getText(element);
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement ele:links) {
			String url=ele.getAttribute("href");
			System.out.println(url);
		}
		
		
		String url=driver.getCurrentUrl();	
		System.out.println(url);
		
		driver.close();
	}

}
