package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

		WebDriver driver=null;
		System.SetProperty("webdriver.chrome.driver","C:/Users/EDWIN CECIL XAVIER/eclipse-workspace/CucumberJava/src/main/resources/drivers/chromedriver.exe");
	
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage.window().maximize();
}
		@Given("user is on login page")
		public void user_is_on_login_page() {
		    throw new io.cucumber.java.PendingException();
		}
		@When("user enters username and password")
		public void user_enters_username_and_password() {
		    throw new io.cucumber.java.PendingException();
		}
		@When("clicks on login button")
		public void clicks_on_login_button() {
		    throw new io.cucumber.java.PendingException();
		}
		@Then("user is navigated to the home page")
		public void user_is_navigated_to_the_home_page() {
		   	throw new io.cucumber.java.PendingException();
		}




		

}
