package pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataDrivenLoginPage {
	
	WebDriver driver;
	
	public DataDrivenLoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id = "username")
	private WebElement UserNameBox;
	@FindBy(id = "password")
	private WebElement PasswordBox;
	public void EnterUsernameAndPassword() throws IOException {
		String excelFilePath = ".\\Data\\DataFiles.xlsx";
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
	}
	

}
