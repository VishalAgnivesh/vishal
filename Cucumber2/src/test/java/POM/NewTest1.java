package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest1 {
	
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  PageClass1 locateElements=PageFactory.initElements(driver,PageClass1.class);
	  locateElements.loginMethod("aravind.guggilla57@gmail.com","aravind");
  }
}
