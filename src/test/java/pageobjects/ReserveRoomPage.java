package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReserveRoomPage extends pagebase {

	public ReserveRoomPage(WebDriver driver) {
		super(driver);
		
	}

//	@FindBy(xpath="//span[normalize-space()='Manage Reservation']")
//	public WebElement ManageReservation;
	@FindBy(xpath="//a[text()='Reserve Rooms']")
	public WebElement Reservations;
	@FindBy(xpath="//input[@id='searchForm_dateRange']")
	public WebElement Checkin;
	@FindBy(xpath="//td[@title='2026-03-17']//div[@class='ant-picker-cell-inner'][normalize-space()='17']")
	public WebElement startdate;
	@FindBy(xpath="//td[@title='2026-03-18']//div[@class='ant-picker-cell-inner'][normalize-space()='18']")
	public WebElement endDate;
	@FindBy(xpath="//input[@id='searchForm_guestCount']")
	public WebElement GuestNo;
	@FindBy(xpath="//div[text()='Number of Guests']/parent::div/following-sibling::div//span[@class=\"anticon anticon-plus\"]")
	public WebElement Plus;
	@FindBy(xpath = "//span[text()='Done']")
    WebElement Done;
	@FindBy(xpath="//span[normalize-space()='Check Availability']")
	public WebElement Check;
	
	@FindBy(xpath="//span[@title='0']")
	public WebElement O;
	@FindBy(xpath="//div[@class='ant-select-item-option-content'][normalize-space()='1']")
	public WebElement I;
	@FindBy(xpath="//span[normalize-space()='Reserve Now']")
	public WebElement ReserveNow;
//	@FindBy(xpath="//span[normalize-space()='Manage Reservation']")
//	public WebElement ManageReservation;
//	@FindBy(xpath="//span[normalize-space()='Manage Reservation']")
//	public WebElement ManageReservation;
//	@FindBy(xpath="//span[normalize-space()='Manage Reservation']")
//	public WebElement ManageReservation;
//	@FindBy(xpath="//span[normalize-space()='Manage Reservation']")
//	public WebElement ManageReservation;
//	@FindBy(xpath="//span[normalize-space()='Manage Reservation']")
//	public WebElement ManageReservation;

	
	public void ResRoom() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.elementToBeClickable(Reservations));
		//ManageReservation.click();
		Reservations.click();
		Checkin.click();
		startdate.click();
		endDate.click();
		GuestNo.click();
		Plus.click();
		Done.click();
		Check.click();
	}
	
}
