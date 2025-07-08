package stepDefenition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SeleniumDemoPage;

public class DemoPage {
	
	WebDriver driver;
	
	@Given("User is in demo page")
	public void user_is_in_demo_page() throws InterruptedException {
		driver = DriverFactory.getDriver();
		Thread.sleep(3000);

	}
	
	@Then("user inspectes the css value of a element")
	public void user_inspectes_the_css_value_of_a_element() {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.Inspect();

	}


	@Then("^User enters text input (.+)$")
	public void user_enters_text_input_text_input(String TextInput) {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.EnterText(TextInput);
		
	}

	@Then("User slides the slider")
	public void user_slides_the_slider() throws InterruptedException {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.MoveSlider();
		
	}
	
	@Then("User selects dropdown")
	public void user_selects_dropdown() throws InterruptedException {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.ClickDropDown();
		
		

	}
	
	@Then("User clicks the checkBox")
	public void user_clicks_the_check_box() throws InterruptedException {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.ClickCheckBox();
		
		

	}
	
	@Then("User drags and drops a webelement")
	public void user_drags_and_drops_a_webelement() throws InterruptedException {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.DragDrop();
		

	}
	
	@Then("^User erases the prefilled text field and enters new text input (.+)$")
	public void user_erases_the_prefilled_text_field_and_enters_new_text_input_input(String PreTextInput) throws InterruptedException {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.TextBox2(PreTextInput);
		

	}
	
	
	@Then("User clicks iframe checkbox")
	public void user_clicks_iframe_checkbox() {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.IFrameCheckBox();	
		
	}
	
	
	@Then("user clicks on the link.")
	public void user_clicks_on_the_link() {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.ClickLink();
	}  

	
	
	@Then("User context clicks")
	public void user_context_clicks() throws InterruptedException, IOException {
		SeleniumDemoPage demo = new SeleniumDemoPage(driver);
		demo.RightClick();
		
	}
	
}
	





