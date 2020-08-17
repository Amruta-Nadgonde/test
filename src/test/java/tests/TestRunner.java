package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = true,
		monochrome = true,
		features = "src/test/resources/Features/rediff.feature",
		glue = {"stepDefinition"},
		plugin = {"pretty" , "html: result/report.html"}
		
		)
public class TestRunner {

}
