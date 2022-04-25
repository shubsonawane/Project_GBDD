package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\91820\\eclipse-workspace\\Guru99BankBDDFramework\\src\\main\\java\\Features\\login.feature",
		glue = {"stepDefinitions"},
		//format = {"pretty", "html:test-output"}
		monochrome = true, 
		//plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
		plugin = {"html:target/cucumber-html-report", "html:target/cucumber-html-report.html" }
		)

public class TestRunner {

}
 