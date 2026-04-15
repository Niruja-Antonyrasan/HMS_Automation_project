package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildPolicyPage extends pagebase{

	public ChildPolicyPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//a[normalize-space()='Child Policy']")
	public WebElement ChildPolicy;
	@FindBy(xpath = "//span[normalize-space()='Create']")
	public WebElement Create;
	@FindBy(xpath = "//input[@id='stepForm_startDate']")
	public WebElement DateSelect;
	@FindBy(xpath = "//div[normalize-space()='10']")
	public WebElement n10;
	@FindBy(xpath = "//input[@id='stepForm_adultMinAge']")
	public WebElement MinAge;
	@FindBy(xpath = "//input[@id='stepForm_childMaxAge']")
	public WebElement MaxAge;
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement Save;

	public void ChildPLC() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Child Policy']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		ChildPolicy.click();
		Create.click();
		DateSelect.click();
		n10.click();
		MinAge.sendKeys("10");
		MaxAge.sendKeys("6");
		Save.click();

	}

}
