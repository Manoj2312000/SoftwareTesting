package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = "src/test/resources/Feature",
		glue = {"stepDefenition", "hook"},
		tags = "@Login1",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/Reports/htmlReport.HTML"}
		
		)

public class MyRunner {

}
