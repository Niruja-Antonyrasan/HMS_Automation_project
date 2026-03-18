package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.GuestTitlePage;

public class GuestTitleCreation extends GuestTitlePage{
	
	
		public GuestTitleCreation(WebDriver driver) {
		super(driver);
		
	}

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


