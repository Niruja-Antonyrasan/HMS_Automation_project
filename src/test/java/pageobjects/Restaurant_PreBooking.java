package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Restaurant_PreBooking extends pagebase{

	public Restaurant_PreBooking(WebDriver driver) {
		super(driver);
		
	}

//	@FindBy(xpath="//div[contains(text(),'RESTAURANT')]")
//	public WebElement Restaurant;
	@FindBy(xpath="//div[contains(text(),'DINE-IN')]")
	public WebElement DineIn;
	@FindBy(xpath="//span[normalize-space()='BOOK A TABLE']")
	public WebElement BookTable;
	@FindBy(xpath="//select[@class='sc-cezyBN cxyZtd']")
	public WebElement Person;
	@FindBy(xpath="//option[@value='4']")
	public WebElement person4;
	@FindBy(xpath="//button[text()='BOOK NOW']")
	public WebElement BookNow;
	@FindBy(xpath="//input[@placeholder='Enter your full name']")
	public WebElement Name;
	@FindBy(xpath="//div[@id='phoneNumber']//input[1]")
	public WebElement PhoneNo;
	@FindBy(xpath="//textarea[@placeholder='Enter a description']")
	public WebElement Discription;
	@FindBy(xpath="//span[normalize-space()='Allocate Tables']")
	public WebElement Table;
	@FindBy(xpath="//strong[text()='TB-10']")
	public WebElement T10;
	@FindBy(xpath="//span[text()='Complete Reservation']")
	public WebElement Complete;
	
	
	public void PreBook() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'RESTAURANT')]")));
		
		//Restaurant.click();
		DineIn.click();
		BookTable.click();
		Person.click();
		person4.click();
		BookNow.click();
		Name.sendKeys("Wasu");
		PhoneNo.sendKeys("04787987");
		Discription.sendKeys("Ondum illlaaaaa");
		Table.click();
		T10.click();
		Complete.click();
		
		
	}
	
	
}
