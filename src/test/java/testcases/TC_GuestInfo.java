package testcases;

import org.testng.annotations.Test;

import pageobjects.GuestInfoPage;
import utils.LoginMethod_Hotel;

public class TC_GuestInfo extends BaseTest{

	@Test
	public void tc() {
		LoginMethod_Hotel LM=new LoginMethod_Hotel(driver);
		LM.Login();
		GuestInfoPage gp = new GuestInfoPage(driver);

        gp.GIP();
	}
	
	
	
}
