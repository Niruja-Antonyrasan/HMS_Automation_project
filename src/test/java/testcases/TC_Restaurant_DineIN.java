package testcases;

import org.testng.annotations.Test;

import pageobjects.Restaurant_DineIn;
import utils.LoginMethod_Restaurant;

public class TC_Restaurant_DineIN extends BaseTest {

	@Test
	public void tc() {
		LoginMethod_Restaurant LM = new LoginMethod_Restaurant(driver);
		LM.Login();

		Restaurant_DineIn Dine = new Restaurant_DineIn(driver);
		Dine.DINE("TB-06");

	}

}
