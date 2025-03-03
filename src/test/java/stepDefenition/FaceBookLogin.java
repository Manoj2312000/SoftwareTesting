package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUpPage;
import pages.UserLogin;

public class FaceBookLogin {
	
	WebDriver driver;
	

@Given("^User is on login page$")
public void user_is_on_login_page() throws InterruptedException {
	driver = DriverFactory.getDriver();
	Thread.sleep(2000);

}

@When("^User enters valid email address(.+)$")
public void user_enters_valid_email_address(String Email){
	UserLogin login = new UserLogin(driver);
	login.EnterEmail(Email);
	
	
	
}

@And("^User enters valid password (.+)$")
public void user_enters_valid_password_kujgygg(String Password) {
	UserLogin login = new UserLogin(driver);
	login.EnterPassword(Password);

}

@Then("^User clicks signup button$")
public void user_clicks_signup_button() {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.clickSignupButton();

}

@Then("^user enter first name (.+)$")
public void user_enter_first_name_manoj(String Firstname) {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.EnterFirstName(Firstname);
}

@Then("^user enters surname (.+)$")
public void user_enters_surname_s(String Surname) {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.EnterSurName(Surname);
	
}

@Then("^user enters mobile number (.+)$")
public void user_enters_mobile_number(String MobileNumber) {

	SignUpPage signin = new SignUpPage(driver);
	signin.EnterMobileNumber(MobileNumber);
	
	
}

@Then("^user enters password (.+)$")
public void user_enters_password_chcjchg(String NewPassWord) {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.EnterNewPassword(NewPassWord);
	
}

@Then("user clicks and selects day in dropdown")
public void user_clicks_and_selects_day_in_dropdown() {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.ClickDayDropDown();

}

@Then("user clicks and selects month in dropdown")
public void user_clicks_and_selects_month_in_dropdown() {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.ClickMonthDropDown();

}

@Then("user clicks and selects year in dropdown")
public void user_clicks_and_selects_year_in_dropdown() {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.ClickYearDropDown();

	
}

@Then("User click on gender radio button")
public void user_click_on_gender_radio_button() throws InterruptedException {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.ClickRadioButton();
	
	/*try{
		driver.findElement(By.xpath("//input[@value = '2']"));
	}catch(Exception e) {
		System.out.println("Printing Error "+e);
	}*/
	
}

/*@After
public void tearDown(Scenario scenario) {
	if (scenario.isFailed()) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, null ,"D:\\Facebook Screenshot\\fb.png");
		
	}
} */

@Then("user clicks Submit button")
public void user_clicks_submit_button() throws Exception {
	
	SignUpPage signin = new SignUpPage(driver);
	signin.ClickSubmitButton();
	Thread.sleep(3000);
		
}

	}
	
	



