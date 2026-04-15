package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobjects.Room_ViewTypePage;
import utils.LoginMethod_Hotel;

public class TC_RoomViewType extends BaseTest{

	@Test
	public void tc() {
		LoginMethod_Hotel LM=new LoginMethod_Hotel(driver);
		LM.Login();
		
		Room_ViewTypePage view = new Room_ViewTypePage(driver);
		view.View();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='View type created successfully']")));
		
		
	}
}
