package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

	WebDriver driver;
	
	public LoginTest (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@name = 'username']")
	private WebElement UserNameField;
	
	public void EnterUserName(String Username) {
		UserNameField.sendKeys(Username);
	
	}
	
	@FindBy(xpath = "//input[@name = 'password']")
	private WebElement PassWordField;
	
	public void EnterPassword(String Password) {
		PassWordField.sendKeys(Password);
	}
	
	@FindBy(xpath = "//button[@id = 'submit']")
	private WebElement SubmitButton;
	
	public void ClickSubmit() {
		SubmitButton.click();
	}
}
