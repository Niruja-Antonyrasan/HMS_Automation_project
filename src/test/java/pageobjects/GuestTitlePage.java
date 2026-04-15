package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuestTitlePage extends pagebase {

	public GuestTitlePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()='Guest']")
	public WebElement Guest;

	@FindBy(linkText = "Title")
	public WebElement Title;
	@FindBy(xpath = "//span[text()='Create']")
	public WebElement Create;
	@FindBy(xpath = "//input[@id='guestTitleForm_titleName']")
	public WebElement TitleCreation;
	@FindBy(xpath = "//span[text()='Save']")
	public WebElement Save;
	
	
	public void GTC() {
		  WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Guest']")));
		  
					Guest.click();
					Title.click();
					Create.click();
					TitleCreation.sendKeys("Prof");
					Save.click();
	}

}
