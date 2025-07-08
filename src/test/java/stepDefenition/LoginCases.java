package stepDefenition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sun.tools.javac.util.Options;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginTest;

public class LoginCases {
	
	WebDriver driver;
	
	@Given("The user is in login page")
	public void the_user_is_in_login_page() {
		driver = DriverFactory.getDriver();

	}
	

	@Then("^User enters the username (.+)$")
	public void user_enters_the_username_username(String UserName) {
		LoginTest test = new LoginTest(driver);
		test.EnterUserName(UserName);

	}

	@Then("^User enters the password (.+)$")
	public void user_enters_the_password_password123(String Password) {
		LoginTest test = new LoginTest(driver);
		test.EnterPassword(Password);
		

	}

	@Then("Clicks the submit button")
	public void clicks_the_submit_button() throws IOException {
		LoginTest test = new LoginTest(driver);
		test.ClickSubmit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File ("D:\\Login screenshots\\login.png"));
		

	}

	@Then("^User enters the valid username (.+)$")
	public void user_enters_the_valid_username_student(String UserName) {
		LoginTest test = new LoginTest(driver);
		test.EnterUserName(UserName);
	}

	@Then("^User enters the invalid password (.+)$")
	public void user_enters_the_invalid_password_ggiugi(String Password) throws IOException {
		LoginTest test = new LoginTest(driver);
		test.EnterPassword(Password);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)","");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
		File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File ("D:\\Login screenshots\\login.png"));
		
	}

	@Then("^User enters the invalid username (.+)$")
	public void user_enters_the_invalid_username_gytf(String UserName) {
		LoginTest test = new LoginTest(driver);
		test.EnterUserName(UserName);

	}

	@Then("^User enters the valid password (.+)$")
	public void user_enters_the_valid_username_fufg(String Password) {
		LoginTest test = new LoginTest(driver);
		test.EnterPassword(Password);

	}

	@Then("^User enters the wrong username (.+)$")
	public void user_enters_the_wrong_username(String UserName) {
		LoginTest test = new LoginTest(driver);
		test.EnterUserName(UserName);
	}
	
	@Then("^User enters the wrong password (.+)$")
	public void user_enters_the_wrong_password_khgjd(String Password) {
		LoginTest test = new LoginTest(driver);
		test.EnterPassword(Password);
	}

	@Then("^User enters the correct password (.+)$")
	public void user_enters_the_correct_password(String Password) {
		LoginTest test = new LoginTest(driver);
		test.EnterPassword(Password);
	}
	
	@Then("^User enters the correct username (.+)$")
	public void user_enters_the_correct_username_student(String UserName) {
		LoginTest test = new LoginTest(driver);
		test.EnterUserName(UserName);
		
	}
	

}
