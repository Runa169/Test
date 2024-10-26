package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"StrpDeffinations"},
monochrome=true,
plugin = {"pretty", "html:target/HtmlReports"},
tags= "@Login"
		)
public class TestRunner {

}

//plugin ={"Preety","json:target/JSONReports/report.json"},
//plugin ={"Preety","junit:target/JUniteports/report.xml"},