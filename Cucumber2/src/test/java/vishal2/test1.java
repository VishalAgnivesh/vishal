package vishal2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test1 {
	
	WebDriver driver=null;
	
	@Given("user is open the application")
	public void user_is_open_the_application() {
		
		System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream NEW\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("user click on to login link")
	public void user_click_on_to_login_link() {
		
		driver.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();
		driver.close();
	   
	}

	@Then("message displayed login successfully")
	public void message_displayed_login_successfully() {
	   
	}



}
