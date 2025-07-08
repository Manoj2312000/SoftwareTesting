package pages;

import java.util.List;

 // ✅ Selenium's exception


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDataTable {
	
	WebDriver driver;
	
	public RegistrationDataTable (WebDriver driver) {
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
	private WebElement SubmitButton;
	
	public void ClickSubmit() {
		
		SubmitButton.click();
		
	}
	
	@FindBy(xpath = "//input[@name = 'datafile']")
	private WebElement ChooseFileButton;
	
	public void ChooseFile() {
		
		String filepath = "C:/Users/Manoj S/OneDrive/Desktop/Manoj/Az 900.pdf";
		ChooseFileButton.sendKeys(filepath);
		
	}
	
	@FindBy(xpath = "//select[@name = 'sgender']")
	private WebElement GenderDropdown;
	
	public void ChooseGender(String Gender) {
		
		GenderDropdown.click();
		Select dropdown = new Select(GenderDropdown);
		dropdown.selectByIndex(1);
		
		
		List<WebElement> options = dropdown.getOptions();
		for(WebElement option: options) {
			System.out.println("These are the options available in Gender dropdown" + option.getText());
		}	
	}
	
	public String getSelectedGender() {
		
		Select dropdown = new Select(GenderDropdown);
		
		return dropdown.getFirstSelectedOption().getText();
		
	}
	
	@FindBy(xpath = "//input[@value = 'three']")
	private WebElement ExperienceRadioButton;
	
	public void ChooseExperience() {
		
		ExperienceRadioButton.click();
		
	}
	
	public String getWindowHandle() {
		
		return driver.getWindowHandle();
	}
	
	public boolean isGenderDropdownMultiselect() {
		
		Select dropdown = new Select(GenderDropdown);
		return dropdown.isMultiple();
		
	}
	
	public void invalidDropdownSelect() {
		Select dropdown = new Select(GenderDropdown);
		
		dropdown.selectByIndex(4);
		
			
		
	}
	

	

}
