package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Room_ViewTypePage extends pagebase{

	public Room_ViewTypePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[text()='Room']")
	public WebElement Room;
	@FindBy(xpath="//a[text()='View Type']")
	public WebElement ViewType;
	@FindBy(xpath="//span[text()='Create']")
	public WebElement Create;
	@FindBy(xpath="//input[@id='stepForm_viewType']")
	public WebElement ViewName;
	@FindBy(xpath="//textarea[@id='stepForm_description']")
	public WebElement Comment;
	@FindBy(xpath="//span[@role='button']")
	public WebElement UploadImage;
	@FindBy(xpath="//span[text()='Save']")
	public WebElement Save;
	
	public void View() {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)");
		  
		  Room.click();
		  ViewType.click();
		  Create.click();
		  ViewName.sendKeys("nalla View");
		  Comment.sendKeys("sola mudiyathu");
		  UploadImage.sendKeys(System.getProperty("user.dir")+"/HMS_Product/src/test/java/Testdata");
		  Save.click();
	}
	

}
