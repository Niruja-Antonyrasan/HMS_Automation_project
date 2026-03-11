package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuestInfoPage extends pagebase{

	public GuestInfoPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath = "//span[text()='Guest']") 
		WebElement Guest;
		@FindBy(xpath = "//a[normalize-space()='Guest Info']") 
		WebElement GuestInfo;
		@FindBy(xpath = "//span[text()='Create']") 
		WebElement Create;
		@FindBy(xpath = "//input[@id='stepForm_personTitleId']") 
		WebElement TitleName;
		@FindBy(xpath = "//div[contains(text(),'Prof')]") 
		WebElement Prof;
		@FindBy(xpath = "//input[@id='stepForm_firstName']") 
		WebElement Firstname;
		@FindBy(xpath = "//input[@id='stepForm_lastName']") 
		WebElement LastName;
		@FindBy(xpath = "//input[@id='stepForm_guestType']") 
		WebElement GuestType;
		@FindBy(xpath = "//div[contains(text(),'Reservation')]") 
		WebElement Reservation;
		@FindBy(xpath = "//input[@id='stepForm_idNumber']") 
		WebElement NIC;
		@FindBy(xpath = "//input[@id='stepForm_email']") 
		WebElement Email;
		@FindBy(xpath = "//div[@title='Equatorial Guinea']") 
		WebElement Country;
//		@FindBy(xpath = "//input[@id='stepForm_phoneNumber']") 
//		WebElement PhoneNo;
//		@FindBy(xpath = "//input[@id='stepForm_dateOfBirth']") 
//		WebElement DateofBirth;
//		@FindBy(xpath = "//span[text()='Guest']") 
//		WebElement Guest;
//		@FindBy(xpath = "//span[text()='Guest']") 
//		WebElement Guest;
//		@FindBy(xpath = "//span[text()='Guest']") 
//		WebElement Guest;
//		@FindBy(xpath = "//span[text()='Guest']") 
//		WebElement Guest;
		public void GIP() {
			  WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Guest']")));
			  
		Guest.click();
		GuestInfo.click();
		Create.click();
		TitleName.click();
		Prof.click();
		Firstname.sendKeys("Niru");
		LastName.sendKeys("A");
		GuestType.click();
		Reservation.click();
		NIC.sendKeys("1998457895");
		Email.sendKeys("nirushniru90@gmail.com");
		Country.click();
		
		
		}
	}
	


