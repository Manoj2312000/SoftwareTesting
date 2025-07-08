package stepDefenition;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelDataLogin {
	
	WebDriver driver;
	
	@Given("User is on data driven login page")
	public void user_is_on_data_driven_login_page() throws InterruptedException {
		driver = DriverFactory.getDriver();
		Thread.sleep(3000);

	}

	@When("Entering the username and password from the excel")
	public void entering_the_username_and_password_from_the_excel() {

	}
	
	@Then("User clicks login button")
	public void user_clicks_login_button() {
	    
		
		
	}

	@Then("User logged in succesfully")
	public void user_logged_in_succesfully() {

	}

}
