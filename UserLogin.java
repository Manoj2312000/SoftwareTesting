package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin {
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getEmailBox() {
		return EmailBox;
	}
	public void setEmailBox(WebElement emailBox) {
		EmailBox = emailBox;
	}
	public WebElement getPasswordBox() {
		return PasswordBox;
	}
	public void setPasswordBox(WebElement passwordBox) {
		PasswordBox = passwordBox;
		
		
	}

	WebDriver driver;
	
	public UserLogin (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		

}
	
	@FindBy(id = "email")
	private WebElement EmailBox;
	public void EnterEmail(String Email) {
		EmailBox.sendKeys(Email);
			
	}
	
	@FindBy(id = "pass")
	private WebElement PasswordBox;
	public void EnterPassword(String Password) {
		PasswordBox.sendKeys(Password);
		
	}
	

	
	
}
	
