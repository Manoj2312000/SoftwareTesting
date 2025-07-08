package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {
	
	WebDriver driver;
	
	public FileUpload (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@id ='file-upload']")
	private WebElement ChooseFileButton;
	public void ClickChooseFileButton () {
		String filepath = "C:/Users/Manoj S/OneDrive/Desktop/Manoj CV/Manoj Resume.pdf";
		ChooseFileButton.sendKeys(filepath);
		
	}
	
	@FindBy(id = "file-submit")
	private WebElement UploadButton;
	public void ClickUploadButton() {
		String text = UploadButton.getTagName();
		System.out.println("This is the visible text:"+ text);
		UploadButton.click();

		
		
	}
	
	@FindBy(linkText = "Elemental Selenium")
	private WebElement Link;
	public void ClickLink() {
		Link.click();
	}

}
