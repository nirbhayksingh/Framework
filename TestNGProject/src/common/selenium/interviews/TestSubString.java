package common.selenium.interviews;



public class TestSubString {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.quora.com/");
	
		String url="https://www.quora.com/";
		String partOfUrl=url.substring(url.indexOf(".")+1, url.length());
		System.out.println(partOfUrl.substring(0, (partOfUrl.indexOf(".")+2)));
		
		
		
		
		
		
	}

}
