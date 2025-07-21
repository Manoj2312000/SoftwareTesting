package runner;
import static io.cucumber.junit.platform.engine.Constants.*;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Feature") // relative to src/test/resources
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefenition,hook")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-html-report.html, junit:target/cucumber-reports/Cucumber.xml")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@Dropdown")
@ConfigurationParameter(key = PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME, value = "true") // ✅ Correct constant
public class JUnit5CucumberRunner {
}


