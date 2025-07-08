package stepDefenition;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FileUpload;

public class FileUploaderPage {
	
	WebDriver driver;
	
	@Given("User is in file uploader page")
	public void user_is_in_file_uploader_page() {
		driver = DriverFactory.getDriver();

	}
	
	@Then("User clicks on the choose file button and uploades a file")
	public void user_clicks_on_the_choose_file_button_and_uploades_a_file() throws InterruptedException {
		FileUpload upload = new FileUpload(driver);
		upload.ClickChooseFileButton();
		Thread.sleep(2000);

	}
	
	
	@Then("User clicks on the upload button.")
	public void user_clicks_on_the_upload_button() throws InterruptedException {
		FileUpload upload = new FileUpload(driver);
		upload.ClickUploadButton();
		Thread.sleep(1000);

	}

	@Then("The file is uploaded sucessfully")
	public void the_file_is_uploaded_sucessfully() {

	}
	
	@Then("User clicks on a link")
	public void user_clicks_on_a_link() {
		FileUpload upload = new FileUpload(driver);
		upload.ClickLink();

	}


}
