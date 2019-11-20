package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass PObject=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		PObject.clicklink();
		
		PObject.typename();
		
		PObject.classpassword();
		PObject.clickonloginlyn();
		System.out.println("title of the page is "+driver.getTitle());
	}

}
