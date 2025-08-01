package hook;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class MyHooks {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		Properties prop = ConfigReader.initializationProperties();
		String browser = System.getProperty("browser", prop.getProperty("browser"));
		DriverFactory.initializeBrowser(browser);
		//DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = prop.getProperty("url");
		driver.get(url);
	}

	
	@After
	public void teardown() {
		driver.quit();
	}

}




