package testcases;

import org.testng.annotations.Test;

import pageobjects.Restaurant_PreBooking;

import utils.LoginMethod_Restaurant;

public class TC_Restaurant_PreBooking extends BaseTest{
	
	@Test
	public void tc() {
		LoginMethod_Restaurant LM = new LoginMethod_Restaurant(driver);
		LM.Login();
		
		Restaurant_PreBooking Pre = new Restaurant_PreBooking(driver);
		Pre.PreBook();
		
	}
	

}

