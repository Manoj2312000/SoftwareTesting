package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage {
	
	WebDriver driver;
	
	public CalenderPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//img[@class = 'imgdp']")
	private WebElement CalenderButton;
	public void ClickCalenderButton() {
		CalenderButton.click();
	}
	
	@FindBy(xpath = "//span[@class = 'ui-icon ui-icon-circle-triangle-w']")
	private WebElement NavigateButton;
	public void ClickNavigateButton() {
		NavigateButton.click();
		NavigateButton.click();
		
	}
	
	@FindBy(xpath = "//a[text() ='17']")
	private WebElement DateNavigate;
	public void ClickDate() {
		DateNavigate.click();
	}

}
