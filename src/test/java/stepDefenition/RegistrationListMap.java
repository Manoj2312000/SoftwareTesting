package stepDefenition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DataTableListMap;

public class RegistrationListMap {
	
	WebDriver driver;
	
	@Given("User is in registration page for registration")
	public void user_is_in_registration_page() {
		driver = DriverFactory.getDriver();
	}

	@When("User fills the form with required details")
	public void user_enters_the_required_details(DataTable dataTable) {
		
		DataTableListMap data = new DataTableListMap(driver);

		
	    List<Map<String,String>> table = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> row : table) {
	    	
	    	String Firstname = row.get("Firstname");
	    	data.EnterFirstName(Firstname);
	    	String Email = row.get("Email");
	    	data.EnterEmail(Email);
	    	String Telephone = row.get("Telephone");
	    	data.EnterTelephone(Telephone);
	    	
	    	data.ClickSubmit();
	    	driver.switchTo().alert().accept();
	    	
	    	
	    }
	    
	

	}}
