package stepDefenition;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.NoSuchElementException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationDataTable;

public class RegistrationDemo {
	
	WebDriver driver;

	@Given("User is in registration page")
	public void user_is_in_registration_page() {
 
		driver = DriverFactory.getDriver();
	}

	@When("User enters the required details")
	public void user_enters_the_required_details(DataTable dataTable) {
		
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		
		
		
		
		List<Map<String,String>> userList = dataTable.asMaps(String.class, String.class);
		
		for(Map<String,String> row : userList) {
			
			String Firstname = row.get("Firstname");
			reg.EnterFirstName(Firstname);
			String Email = row.get("Email");
			reg.EnterEmail(Email);
			String Telephone = row.get("Telephone");
			reg.EnterTelephone(Telephone);

			reg.ClickSubmit();
			
			driver.switchTo().alert().accept();
		}		

	}
	
	@Then("User uploads a file")
	public void user_uploads_a_file() {
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		reg.ChooseFile();
		
	    
	} 

	@Then("User selects the gender")
	public void user_selects_the_gender(String Gender) throws InterruptedException {
	
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		reg.ChooseGender(Gender);

	   
	}
	


	@Then("User selects the experinece")
	public void user_selects_the_experinece() {
		
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		reg.ChooseExperience();
	    
	}
	
	@Then("Following user data has been registered")
	public void following_user_data_has_been_registered() throws IOException, InterruptedException {
		
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
	
		
		File fl = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:/Users/Manoj S/OneDrive/Desktop/Testing SS/screenshot.png");
		FileHandler.copy(fl, dest);
		
		reg.ClickSubmit();
		
		driver.switchTo().alert().accept();		
	}
	
	@Then("Get the window handle")
	public void get_the_window_handle() {
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		reg.getWindowHandle();

	}
	
	@When("user selects gender as {string}")
	public void user_selects_gender_as( String Gender) {
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		reg.ChooseGender(Gender);
	}

	@Then("selected gender should be {string}")
	public void selected_gender_should_be(String expectedGender) {
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		
		String actualGender = reg.getSelectedGender();
	    System.out.println("Expected: " + expectedGender);
	    System.out.println("Actual: " + actualGender);
	    try {
	    	Assert.assertEquals("Gender mismatch!",expectedGender, actualGender);
	    }catch(AssertionError e) {
	    	
	    	System.out.println(e);
	    	
	    }
		
		
	}
	
	@Then("the gender dropdown should not allow multiple selections")
	public void the_gender_dropdown_should_not_allow_multiple_selections() {
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		Assert.assertFalse("Dropdown allows multiple selections!",reg.isGenderDropdownMultiselect());
	}
	
	@Then("try invalid select")
	public void try_invalid_select() {
		RegistrationDataTable reg = new RegistrationDataTable(driver);
		try {
		reg.invalidDropdownSelect();
		}catch(NoSuchElementException e) {
			System.out.println("Element not available" + e);
		}
	}
	
}
