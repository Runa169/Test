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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
				
	}
	
	@And("^user enter username and password$")
	public void user_enter_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
	}
	
	@And("^user click on login$")
	public void user_click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
	}
	
	@Then("^user is on Dashboard Page$")
	public void user_is_on_Dashboard_Page() throws InterruptedException {
		assertTrue("user is not on Dashboard Page", driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed());
		Thread.sleep(3000);
	}
	@When("^The User click on Admin Tab$")
	public void click_Admin() throws InterruptedException	{
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][1]")).click();
		Thread.sleep(3000);
	}
	
	@And("^user enter name in system users$")
	public void user_enter_name_in_system_users() throws InterruptedException	{
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("abcabc111");
		Thread.sleep(3000);
	}
	
	@And("^user click on dropdown arrow$")
	public void user_click_on_dropdown_arrow() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]")).click();
	}
	
	@And("^User selects '(.*)' from UserRole dropdown$")
	public void User_selects_from_UserRole_dropdown(String UserRole) {
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][1]")).sendKeys("Admin");
	}
	
	@And("^User enter employee name$")
	public void User_enter_employee_name () {
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("PaulabcabcTestabc  Collingssefgefgefg");
	}
	
	@And("^user click on dropdown arrow two$")
	public void user_click_on_dropdown_arrow_two() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
	}
	
	@And("^user selects '(.*)' from Status dropdown$")
	public void user_selects_from_Status_dropdown(String Status) {
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).sendKeys("Enabled");
	}
	
	@And("^user click on search$")
	public void user_click_on_search() {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}
	
	@And("^user click on Time$")
	public void user_click_on_Time()	throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][4]")).click();
		Thread.sleep(3000);
	}
	
	@And("^user enter employee name in time$")
	public void user_enter_employee_name_in_time()	throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("test0  test2");
		Thread.sleep(3000);
	}
	
	@And("^user click on View$")
	public void user_click_on_View()	throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(3000);
	}
	
	
	
	@And("^user click on PIM$")
	public void user_click_on_PIM()	throws InterruptedException {
		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]")).click();
		Thread.sleep(3000);
	}

	@And("^user enter employee name$")
	public void  user_enter_employee_name()	throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...'][1]")).sendKeys("Hema Chandrika");
		Thread.sleep(3000);
	}
	
	@And("^user enter employee id$")
	public void user_enter_employee_id()	throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2277");
		Thread.sleep(3000);
	}
	
	@And ("^user click on dropdown arrow in EmploymentStatus$")
	public void user_click_on_dropdown_arrow_in_EmploymentStatus()	throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]")).click();
		Thread.sleep(3000);
	}
	
	@And("^User selects '(.*)' from EmploymentStatus dropdown$")
	public void User_selects_from_EmploymentStatus_dropdown(String EmploymentStatus) {
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][1]")).sendKeys("Freelance");
	}
	
	@And ("^user click on dropdown arrow in Include$")
	public void user_click_on_dropdown_arrow_in_Include()	throws InterruptedException {
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		Thread.sleep(3000);
	}
	
	@And("^user selects '(.*)' from Include dropdown$")
	public void user_selects_from_Include_dropdown(String Include) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys("Current and Past Employees");
	}
	
	@And("^user enter supervisor name$")
	public void  user_enter_supervisor_name()	throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys("John c wall");
		Thread.sleep(3000);
	}
	
	@And ("^user selects '(.*)' from JobTitle dropdown$")
	public void user_selects_from_JobTitle_dropdown(String JobTitle) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]")).sendKeys("Account Assistance");
	
	}
	
	@And ("^user selects '(.*)' from Subunit dropdown$")
	public void user_selects_from_Subunit_dropdown (String Subunit) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[4]")).sendKeys("Administration");
	}
	
	@And ("^user click on Search in Employee Information$")
	public void user_click_on_Search_in_Employee_Information()	throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(3000);
	}
	
	
	
	@And ("^user click on Recruitment$")
	public void user_click_on_Recruitment()	throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]")).click();
		Thread.sleep(3000);
	}
	
	@And ("^user click on dropdown arrow in Recruitment$")
	public void user_click_on_dropdown_arrow_in_Recruitment()	throws InterruptedException {
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		Thread.sleep(3000);
	}
	
	@And ("^user select '(.*)' from JobTitle$")
	public void user_select_from_JobTitle (String JobTitle) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).sendKeys("Content Specialist");
	}
	
	@And ("^user select '(.*)' from Vacancy$")
	public void user_select_from_Vacancy (String Vacancy) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys("Senior Support Specialist");
	}
	
	@And ("^user select '(.*)' from Hiring Manager$")
	public void user_select_from_Hiring_Manager (String Vacancy) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]")).sendKeys("Odis Adalwin");
	}
	
	@And ("^user select '(.*)' from Status$")
	public void user_select_from_Status (String Vacancy) {
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[4]")).sendKeys("Job Offered");
	}
	
	@And("^user enter Candidate Name$")
	public void user_enter_Candidate_Name()	throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Charles Haywire");
		Thread.sleep(3000);
	}
	
	@Then("^user enter Keywords$")
	public void user_enter_Keywords()	throws InterruptedException {
		assertTrue("user not enter Keywords", driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).isDisplayed());	
	}
	
	@And("^user enter Date of Application$")
	public void user_enter_Date_of_Application()	throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("2023-10-16");
	}
	
	
	
	@Then("^Close The Browser$")
	public void Close_The_Browser() throws InterruptedException  {
		Thread.sleep(3000);
		driver.quit();
	}
}
