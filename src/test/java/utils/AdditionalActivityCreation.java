package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageobjects.AdditionalActivityPage;

public class AdditionalActivityCreation extends AdditionalActivityPage {

	public AdditionalActivityCreation(WebDriver driver) {
		super(driver);
	}

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
