package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

}
