package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NinjaSignInPage {
	
	WebDriver driver;
	
	public NinjaSignInPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//a[@title = 'My Account']")
	private WebElement MyAccountButton;
	
	public void ClickMyAccountButton() {
		MyAccountButton.click();
		
	}
	
	@FindBy(xpath = "//a[@href = 'https://tutorialsninja.com/demo/index.php?route=account/register']")
	private WebElement RegisterButton;
	
	public void ClickRegisterButton() {
		RegisterButton.click();
			
	}
	
	@FindBy(id = "input-firstname")
	private WebElement FirstNameBox;
	
	public void EnterFirstName(String FirstName) {
		FirstNameBox.sendKeys(FirstName);
				
	}
	
	@FindBy(id = "input-lastname")
	private WebElement LastNameBox;
	
	public void EnterLastName(String LastName) {
		LastNameBox.sendKeys(LastName);
		
	}
	
	@FindBy(id = "input-email")
	private WebElement EmailBox;
	
	public void EnterEmail(String Email) {
		EmailBox.sendKeys(Email);
	}
	
	@FindBy(id = "input-telephone")
	private WebElement PhoneNumberBox;
	
	public void EnterPhoneNumber(String PhoneNumber) {
		PhoneNumberBox.sendKeys(PhoneNumber);
		
	}
	
	@FindBy(id = "input-password")
	private WebElement PasswordBox;
	
	public void EnterPassword(String Password) {
		PasswordBox.sendKeys(Password);
	}
	
	@FindBy(id = "input-confirm")
	private WebElement PasswordCnfBox;
	
	public void ReEnterPassword(String CnfPassword) {
		PasswordCnfBox.sendKeys(CnfPassword);
	}
	
	@FindBy(xpath = "//input[@value = '0']")
	private WebElement RadioButton;
	
	public void ClickRadioButton() {
		RadioButton.click();
		
	}
	
	@FindBy(xpath = "//input[@type = 'checkbox']")
	private WebElement CheckBox;
	
	public void ClickCheckBox() {
		CheckBox.click();
		
	}
	
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement SubmitButton;
	
	public void ClickSubmitButton() {
		SubmitButton.click();
		
	}

}
