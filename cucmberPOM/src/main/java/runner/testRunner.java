package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\work\\Practice-Projects\\cucmberPOM\\src\\main\\java\\feature",//Location of Feature File
		glue= {"StepDefinitions"},//step defintion file/format for output
		dryRun = false, //Checking the mapping of the feature and definiton file
		monochrome = true, //generate readable 
		format= {"pretty","html:test-outout","json:json-output/cucum.json"}, 
		plugin= {"html:target/cucumber-html-report"	,"json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
		strict = true,
		tags="@Login,@Dashboard"
		// will not allow to execute if mapping is not correct
		)


public class testRunner {

}
	