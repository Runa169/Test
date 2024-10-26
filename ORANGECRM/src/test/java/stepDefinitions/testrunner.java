package stepDefinitions;
import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.plugin.*;



	@RunWith(Cucumber.class)
	@CucumberOptions(

			features = "src/test/resources/feature", 
			glue= {"classpath:stepDefinitions"}, 
			tags= "@OrangeCRMRecruitment",
			plugin = {"pretty", "html:target/cucumber-reports/report.html"},		
			monochrome = true
			
					
			)

public class testrunner {
	
	

}