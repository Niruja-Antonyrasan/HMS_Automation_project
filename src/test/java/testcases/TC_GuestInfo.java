package testcases;

import org.testng.annotations.Test;

import pageobjects.GuestInfoPage;
import utils.LoginMethod;

public class TC_GuestInfo extends BaseTest{

	@Test
	public void tc() {
		LoginMethod LM=new LoginMethod(driver);
		LM.Login();
		GuestInfoPage gp = new GuestInfoPage(driver);

        gp.GIP();
	}
	
	
	
}
