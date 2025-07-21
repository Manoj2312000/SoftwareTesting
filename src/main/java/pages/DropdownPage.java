package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownPage {
	
	WebDriver driver;
	
	public DropdownPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id = 'mySelect']")
	private WebElement PercentageDropdown;
	
	public void ChoosePercentage() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(PercentageDropdown));
        wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));

		
		//PercentageDropdown.click();
		Select dropdown = new Select(PercentageDropdown);
		dropdown.selectByIndex(0);
		
	}
	
	public void ListDropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
		Select dropdown = new Select(PercentageDropdown);
		List<WebElement> ls = dropdown.getOptions();
		for(WebElement options : ls){
			System.out.println(options.getText());
		}
		
	}
	
	public boolean isDropdownMultiselect() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
		
		Select dropdown = new Select(PercentageDropdown);
		return dropdown.isMultiple();
		
	}
	

    public String getSelectedPercentage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
    	Select dropdown = new Select(PercentageDropdown);
		return dropdown.getFirstSelectedOption().getText();
    	
    }
    
    public void selectInvalidOption() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
    	Select dropdown = new Select(PercentageDropdown);
    	dropdown.selectByIndex(5);
    }
    
    public void selectByValue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
    	Select dropdown = new Select(PercentageDropdown);
    	dropdown.selectByValue("25%");
    	
    }
    
    public String getSelectedDropdownByValue() {
    	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
    	Select dropdown = new Select(PercentageDropdown);
    	return dropdown.getFirstSelectedOption().getText();
    	
    }
    
    public List<String> getPercentageOptions(){
    	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
    	Select dropdown = new Select(PercentageDropdown);
    	List <WebElement> option = dropdown.getOptions();
    	List <String> optionTexts = new ArrayList<>();
    	for(WebElement opt :option) {
    		optionTexts.add(opt.getText().trim());
    		
    	}
		return optionTexts;
		
    	
    }
    
    public boolean isDropdownEnabled() {
    	Select dropdown = new Select(PercentageDropdown);
    	return dropdown.getWrappedElement().isEnabled();
		 
    }
    
    public String checkFontSize() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PercentageDropdown));
		return PercentageDropdown.getCssValue("font-size");
    	
    }

}

