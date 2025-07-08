package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTableListMap {
	
WebDriver driver;
	
public DataTableListMap (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);	
}
	
	@FindBy(xpath = "//input[@id = 'username']")
	private WebElement FirstnameBox;
	
	public void EnterFirstName(String Firstname) {
		
		FirstnameBox.sendKeys(Firstname);
		
	}
	
	@FindBy(id = "email")
	private WebElement EmailBox;
	
	public void EnterEmail(String Email) {
		
		EmailBox.sendKeys(Email);
	}
	
	@FindBy(xpath = "//input[@id = 'tel']")
	private WebElement TelephoneBox;
	
	public void EnterTelephone(String Telephone) {
		
		TelephoneBox.sendKeys(Telephone);
		
	}
	
	@FindBy(xpath = "//input[@name = 'commit']")
	private WebElement RegisterButton;
	
	public void ClickSubmit() {
		
		RegisterButton.click();
		
	}

}
