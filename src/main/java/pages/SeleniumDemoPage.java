package pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemoPage {
	
	WebDriver driver;
	
	public SeleniumDemoPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	   @FindBy(id = "myDropdown")
	   private WebElement Element;
	   public void Inspect() {
		   String HoverCssValue = Element.getCssValue("font-size"); 
		   System.out.println("Printing the font size of Hover button "+ HoverCssValue);
	   }
		
		@FindBy(id = "myTextInput")
		private WebElement TextBox;
		public void EnterText(String TextInput) {
			TextBox.sendKeys(TextInput);
			
				
		}
		
		@FindBy(id = "mySlider")
		private WebElement SliderBar;
		public void MoveSlider() {
			Actions actions = new Actions(driver);
			//int xOffset = Integer.parseInt("45");
			actions.clickAndHold(SliderBar).moveByOffset(45, 0).release().perform();	
		
		}
		
		@FindBy(id = "mySelect")
		private WebElement DropDown;
		public void ClickDropDown() {
			DropDown.click();
			Select dropdown = new Select(DropDown);
			dropdown.selectByIndex(3);
			List <WebElement> options = dropdown.getOptions();
			for (WebElement option: options) {
				System.out.println("Printing options in the dropdown" + option.getText());
				
			}
			
		}
		
		@FindBy(xpath = "//input[@id = 'checkBox1']")
		private WebElement CheckBox;
		public void ClickCheckBox() {
			CheckBox.click();
			
		}
		
		@FindBy(xpath = "//img[@id = 'logo']")
		private WebElement DragAndDropSource;
		@FindBy(xpath = "//div[@id = 'drop2']")
		private WebElement DragAndDropTarget;
		public void DragDrop() {
			Actions action = new Actions(driver);
			action.dragAndDrop(DragAndDropSource, DragAndDropTarget).perform();
		
			
			
		}
		
		@FindBy(id = "myTextInput2")
		private WebElement TextBox2;
		public void TextBox2(String PreTextInput) {
			TextBox2.clear();
			TextBox2.sendKeys(PreTextInput);
			
			/* driver.navigate().refresh();
			driver.navigate().forward();
			driver.navigate().back(); */
			
			driver.get("https://seleniumbase.io/demo_page");
			System.out.println("Printing title of thw webpage: " + driver.getTitle());
			
			
			
		}
		
		@FindBy(xpath = "//input[@id = 'checkBox6']")
		private WebElement Checkbox2;
		public void IFrameCheckBox() {
			driver.switchTo().frame("frameName3");
			Checkbox2.click();
			
			
		}
		
		@FindBy(xpath = "//a[@href='https://seleniumbase.com']")
		private WebElement Link1;
		public void ClickLink() {
			driver.switchTo().defaultContent();
			Link1.click();
		}
		
		@FindBy(xpath = "//form[@id = 'myForm']")
		private WebElement ContextClick;
		public void RightClick() throws IOException {
			Actions action = new Actions(driver);
			action.contextClick().perform();
			driver.navigate().back();
			
			URL url = new URL("https://seleniumbase.io/demo_page");
			HttpURLConnection con = (HttpURLConnection) url.openConnection(); 
			int code = con.getResponseCode();
			System.out.println("The response code is"+code);

			//driver.get("https://seleniumbase.com/");
			//System.out.println("Printing window habdle:" + driver.getWindowHandle());
	
		}
		
}
		
		
		
		
		
		
		
		



