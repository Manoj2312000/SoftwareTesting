package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	WebDriver driver;
	
	public SignUpPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	//Entering User
	@FindBy(xpath = "//a[@href ='/r.php?locale=en_GB&display=page']")
	private WebElement SignUpButton;
	
	public void clickSignupButton() {
		SignUpButton.click();	
	}
	
	//Entering Pwd
	@FindBy(name = "firstname")
	private WebElement FirstNameBox;
	
	public void EnterFirstName(String Firstname) {
		FirstNameBox.sendKeys(Firstname);
	}
	
	@FindBy(xpath = "//input[@name= 'lastname']")
	private WebElement SurNameBox;
	
	public void EnterSurName(String Surname) {
		SurNameBox.sendKeys(Surname);
		
	}
	
	@FindBy(xpath = "//input[@name= 'reg_email__']")
	private WebElement MobileNumberBox;
	
	public void EnterMobileNumber(String MobileNumber) {
		MobileNumberBox.sendKeys(MobileNumber);	
		
	
		
	}
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PasswordBox;
	
	public void EnterNewPassword(String NewPassWord) {
		PasswordBox.sendKeys(NewPassWord);
		
	}
	
	@FindBy(id = "day")
	private WebElement DropdownDay;
	
	public void ClickDayDropDown() {
		
	try {
		DropdownDay.click();
		Select Dropdown = new Select(DropdownDay);
		Dropdown.selectByIndex(35);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	
	@FindBy(id ="month")
	private WebElement DropdownMonth;
	
	public void ClickMonthDropDown() {
		DropdownMonth.click();
		Select Dropdown = new Select(DropdownMonth);
		Dropdown.selectByIndex(0);
		
	}
	
	@FindBy(id = "year")
	private WebElement DropdownYear;
	
	public void ClickYearDropDown() {
		DropdownYear.click();
		Select Dropdown = new Select(DropdownYear);
		Dropdown.selectByIndex(24);
		
	}
	
	
	@FindBy(xpath = "//input[@value = '2']")
	private WebElement RadioButton;
	
	public void ClickRadioButton() {
		RadioButton.click();
		
	}
	
	@FindBy(xpath = "//button[@name = 'websubmit']")
	private WebElement SubmitButton;
	
	public void ClickSubmitButton() throws Exception {
		SubmitButton.click();
		
		Thread.sleep(15000);	
	}
	
	
		
	

}
