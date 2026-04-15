package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Restaurant_DineIn extends pagebase {

	public Restaurant_DineIn(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(text(),'DINE-IN')]")
	public WebElement DineIn;
	@FindBy(xpath = "//div[text()='MENUS']")
	public WebElement Menu;
	@FindBy(xpath = "//div[contains(text(),'SRI LANKAN')]")
	public WebElement SL;
	@FindBy(xpath = "//div[contains(text(),'LUNCH')]")
	public WebElement Lunch;
	@FindBy(xpath = "//span[normalize-space()='Table']")
	public WebElement Table;
	@FindBy(xpath = "//div[text()='T8']")
	public WebElement T8;
	@FindBy(xpath = "//span[@aria-label='close']//*[name()='svg']")
	public WebElement Close;
	@FindBy(xpath = "//input[@value='CASH']")
	public WebElement Cash;
	@FindBy(xpath = "//h3[normalize-space()='Chicken Kothu']")
	public WebElement Chicken;
	@FindBy(xpath = "//span[normalize-space()='Order']")
	public WebElement Order;

	public void DINE(String name) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		DineIn.click();

		wait.until(ExpectedConditions.elementToBeClickable(Menu));
		Menu.click();

		wait.until(ExpectedConditions.elementToBeClickable(SL));
		SL.click();

		wait.until(ExpectedConditions.visibilityOf(Lunch));
		wait.until(ExpectedConditions.elementToBeClickable(Lunch));
		Lunch.click();
		Table.click();

		WebElement element=driver.findElement(By.xpath("//div[text()='" + name + "']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

		Close.click();
		Cash.click();

		wait.until(ExpectedConditions.elementToBeClickable(Chicken));
		Chicken.click();
		Order.click();

	}

}
