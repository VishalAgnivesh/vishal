package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By lin=By.xpath("//input[@value='Log in']");
	
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklink() {
		driver.findElement(lnc).click();
	}
	public void typename() {
		driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void classpassword() {
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void clickonloginlyn()  {
		driver.findElement(lin).click();
	}

}
