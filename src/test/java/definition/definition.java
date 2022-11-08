package definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class definition {

	
	WebDriver driver;
	public static  String url="https://demo.guru99.com/test/newtours/";
	
	@Given("i should open the browser and naviagte to the login page of guru99")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_guru99() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get(url);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	   
	}
	@When("Enter the User Name {string}")
	public void enter_the_user_name(String string)  {
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(string);
	}
	@And("Enter the Password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
	}
	@And("Click on the Submitbutton")
	public void click_on_the_submitbutton() {
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		
	    
	}
	@Then("I should see title as {string}")
	public void i_should_see_title_as(String string) {
		 Assert.assertEquals(string, driver.getTitle());
	  driver.close();
	    
	}

}