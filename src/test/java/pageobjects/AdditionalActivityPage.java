package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AdditionalActivityPage extends pagebase{
	
	public AdditionalActivityPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath= "//span[normalize-space()='Additional Events']")
	public WebElement AdditionalActivity;
	@FindBy(xpath="//a[normalize-space()='Booking']")
	public WebElement Booking;
	@FindBy(xpath="//span[normalize-space()='Create']")
	public WebElement Create;
//	@FindBy(xpath = "//span[text()='Create']")
//	public WebElement create;

	@FindBy(xpath = "//span[@title='Resident']")
	public WebElement Resident;
	@FindBy(xpath = "//input[@id='stepForm_ownerName']")
	public WebElement Guest;
	@FindBy(xpath = "//input[@id='stepForm_guestEmail']")
	public WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Select date']")
	public WebElement Date;
	@FindBy(id = "stepForm_additionalActivityId")
	public WebElement Event;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary sc-koXPp euxzqs create-button']")
	public WebElement Save;
	
	

		public void AAC() {
			AdditionalActivity.click();
			Booking.click();
			Create.click();
			Resident.click();
			Guest.sendKeys("Niruja");
			Email.sendKeys("niruja@gmail.com");
			Date.sendKeys("2026-03-04");
			//Date.sendKeys(Keys.ENTER);
			Event.click();
			Save.click();

		}

	}

	
	

	


