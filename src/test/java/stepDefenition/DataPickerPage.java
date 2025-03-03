package stepDefenition;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CalenderPage;

public class DataPickerPage {
	
	WebDriver driver;
	
	@Given("The user is in the data selector page")
	public void the_user_is_in_the_data_selector_page() throws InterruptedException {
		driver = DriverFactory.getDriver();
		Thread.sleep(1000);

	}

	@Then("The user clicks on the calender icon")
	public void the_user_clicks_on_the_calender_icon() throws InterruptedException {
		CalenderPage page = new CalenderPage(driver);
		page.ClickCalenderButton();
		Thread.sleep(2000);

	}

	@Then("The user selects the desired month")
	public void the_user_selects_the_desired_month() throws InterruptedException {
		CalenderPage page = new CalenderPage(driver);
		page.ClickNavigateButton();
		Thread.sleep(1000);

	}
	

@Then("The user selects the desired date")
public void the_user_selects_the_desired_date() throws InterruptedException {
	CalenderPage page = new CalenderPage(driver);
	page.ClickDate();
	Thread.sleep(1000);
	


}

}
