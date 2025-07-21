package stepDefenition;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.ComparisonFailure;

import java.util.List;

import org.junit.Assert;
import pages.DropdownPage;

public class DropdownCases {

	WebDriver driver;
	
	@Given("User is in dropdown page")
	public void user_is_in_dropdown_page() {
	    driver = DriverFactory.getDriver();
	}

	@Then("User selects an option from dropdown")
	public void user_selects_an_option_from_dropdown() {
		DropdownPage dropdownpg = new DropdownPage(driver);
		dropdownpg.ChoosePercentage();
	    
	}
	
	@Then("User lists the drop")
	public void user_lists_the_drop() {
		DropdownPage dropdownpg = new DropdownPage(driver);
		dropdownpg.ListDropdown();

	}
	
	@Then("the dropdown should not allow multiselect")
	public void the_dropdown_should_not_allow_multiselect() {
		DropdownPage dropdownpg = new DropdownPage(driver);

		Assert.assertFalse("Dropdown did not allows multiple selections!",dropdownpg.isDropdownMultiselect());
}
	
	@When("the user selects {string}")
	public void the_user_selects(String string) {
		DropdownPage dropdownpg = new DropdownPage(driver);
		dropdownpg.ChoosePercentage();


	}

	@Then("the value should also be {string}")
	public void the_value_should_also_be(String expectedPercentage) {
		DropdownPage dropdownpg = new DropdownPage(driver);
		String actualPercentage = dropdownpg.getSelectedPercentage();
		System.out.println("Selected percentage" + actualPercentage );
		System.out.println("Expected percentage" + expectedPercentage);
		try {
		Assert.assertEquals("Percentage mismatch!!", expectedPercentage, actualPercentage);
		}catch(ComparisonFailure e) {
			System.out.println("Printing failure" + e);
		}
	}
	
	@When("I try to select invalid option")
	public void i_try_to_select_invalid_option() {
		DropdownPage dropdownpg = new DropdownPage(driver);
		
		try {
		dropdownpg.selectInvalidOption();
		}catch(NoSuchElementException e) {
			System.out.println("Printing exception" + e);
		}
	}
	
	@When("the user selects option with value {string} from dropdown")
	public void the_user_selects_option_with_value_from_dropdown(String String) {
		DropdownPage dropdownpg = new DropdownPage(driver);
		dropdownpg.selectByValue();
	}

	@Then("the selected option should be of value {string}")
	public void the_selected_option_should_be_of_value(String expectedDropdown) {
		DropdownPage dropdownpg = new DropdownPage(driver);
		String actualDropdown = dropdownpg.getSelectedDropdownByValue();
		try {
		Assert.assertEquals("Dropdown option mismatch!!", expectedDropdown, actualDropdown);
		}catch(ComparisonFailure e) {
			System.out.println("Failure" + e);
		}
	}
	
	@Then("the percentage dropdown should contain options:")
	public void the_percentage_dropdown_should_contain_options(io.cucumber.datatable.DataTable expectedOptionTable) {
		DropdownPage dropdownpg = new DropdownPage(driver);
		List<String> expectedOptions = expectedOptionTable.asList();
	    List<String> actualOptions = dropdownpg.getPercentageOptions();
	    System.out.println(expectedOptions);
	    System.out.println(actualOptions);
	    
	    Assert.assertEquals("Dropdown options do not match!", expectedOptions, actualOptions);
		

	}
	
	@Then("the dropdown should be enabled")
	public void the_dropdown_should_be_enabled() {
		DropdownPage dropdownpg = new DropdownPage(driver);
		
		Assert.assertTrue("DropDown is not enabled",dropdownpg.isDropdownEnabled());
	}
	
	@Then("the dropdown shoud have the font size {string}")
	public void the_dropdown_shoud_have_the_font_size(String expectedFontSize) {
		DropdownPage dropdownpg = new DropdownPage(driver);
		String actualFontSize = dropdownpg.checkFontSize();
		System.out.println("Run time Font-Size" + actualFontSize);
		System.out.println("Expected font-size" + expectedFontSize);
		Assert.assertEquals("Font-Size mis match!!", expectedFontSize, actualFontSize);
	}
}
