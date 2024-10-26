package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver.Timeouts;
import static org.junit.Assert.assertTrue;
import io.cucumber.core.cli.Main;



public class steps {
	


WebDriver driver = null;
	
	@Before
    public void setup() {
        

        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    }
	@After
    public void tearDown() {
       // if (driver != null) {
            driver.quit();
        //}
	}

	@Given("^User Launch Home Page$")
	public void User_Launch_Home_Page() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);			
	}
	
	@And ("^user click on WhatsNew$")
	public void user_click_on_WhatsNew() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all'])[1]")).click();
		Thread.sleep(3000);	
	}
	
	@And("^user click on Jackets in New in Womens$")
	public void user_click_on_Jackets_in_New_in_Womens() throws InterruptedException {
		driver.findElement(By.xpath("(//li[@class='item'])[2]")).click();
		Thread.sleep(3000);
	}
	@And("^user click on Juno Jacket$")
	public void user_click_on_Juno_Jacket() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='product-item-link'])[2]")).click();
		Thread.sleep(3000);
	}

	@And("^user click on Add to Cart$")
	public void user_click_on_Add_to_Cart() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		Thread.sleep(3000);
	}
	
	
	@And ("^user click on Women$")
	public void user_click_on_Women () throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all'])[2]")).click();
	}
	
	@And ("^user click on Tops$")
	public void user_click_on_Tops () throws InterruptedException {
		driver.findElement(By.xpath("(//li[@class='item'])[1]")).click();
		Thread.sleep(3000);
	}
	
	@And("^user click on Maya Tunic$")
	public void user_click_on_Maya_Tunic () throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='product-item-link'])[3]")).click();
		Thread.sleep(3000);
	}
	
	@And("^ user click on Add to Cart$")
	public void user_click_on_Add_to_Cart1 () throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
	}
	
	@And("^user click on Men$")
	public void user_click_on_Men () throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all'])[3]")).click();
		Thread.sleep(3000);
	}
	
	@And("^user click on Bottom$")
	public void user_click_on_Bottom () throws InterruptedException {
		driver.findElement(By.xpath("(//li[@class='item'])[2]")).click();
		Thread.sleep(3000);
	}
	
	@And("^user click on Sol Active Short$")
	public void  user_click_on_Sol_Active_Short () throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='product-item-link'])[3]")).click();
	}
	
	@And("^user click on Add to Cart2$")
	public void user_click_on_Add_to_Cart2 () throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
		Thread.sleep(3000);
	}
	
	
	@Then("^Close The Browser$")
	public void Close_The_Browser() throws InterruptedException  {
		Thread.sleep(3000);
		driver.quit();
	}
}
