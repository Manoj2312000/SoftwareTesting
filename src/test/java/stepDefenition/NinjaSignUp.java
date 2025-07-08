package stepDefenition;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NinjaSignInPage;

public class NinjaSignUp {
	
	WebDriver driver;
	
	@Given("^User is in home page$")
	public void user_is_in_home_page() throws InterruptedException {
		driver = DriverFactory.getDriver();
		Thread.sleep(2000);

	}

	@When("^User clicks on My Account$")
	public void user_clicks_on_my_account() {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.ClickMyAccountButton();

	}

	@Then("^User clicks on Register$")
	public void user_clicks_on_register() {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.ClickRegisterButton();

	}

	@Then("^User enters First Name (.+)$")
	public void user_enters_first_name_manoj(String FirstName) {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.EnterFirstName(FirstName);
		

	}

	@Then("^User enters Last Name (.+)$")
	public void user_enters_last_name_selvakumar(String LastName) {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.EnterLastName(LastName);

	}

	@Then("^User enters email(.+)$")
	public void user_enters_email_svmanoj2312_gamil_com(String Email) {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.EnterEmail(Email);
	}

	@Then("^User enters phone number(.+)$")
	public void user_enters_phone_number(String PhoneNumber) {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.EnterPhoneNumber(PhoneNumber);

	}

	@Then("^User enters password (.+)$")
	public void user_enters_password_jlhvljhjv(String Password) {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.EnterPassword(Password);

	}

	@Then("^User re enters password (.+)$")
	public void user_re_enters_password_jlhvljhjv(String CnfPassword) {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.ReEnterPassword(CnfPassword);

	}

	@Then("^User clicks on radio button$")
	public void user_clicks_on_radio_button() {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.ClickRadioButton();

	}

	@Then("^User clicks the checkbox$")
	public void user_clicks_the_checkbox() throws InterruptedException {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.ClickCheckBox();
		Thread.sleep(5000);

	}

	@Then("^User clicks on submit$")
	public void user_clicks_on_submit() {
		NinjaSignInPage signin = new NinjaSignInPage(driver);
		signin.ClickSubmitButton();

	}

}
