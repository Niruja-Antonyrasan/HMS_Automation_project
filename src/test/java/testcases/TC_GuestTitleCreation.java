package testcases;

import org.testng.annotations.Test;

import pageobjects.GuestTitlePage;

import utils.LoginMethod_Hotel;

public class TC_GuestTitleCreation extends BaseTest {
	@Test
	public void test001() throws InterruptedException {
		LoginMethod_Hotel LM = new LoginMethod_Hotel(driver);
		LM.Login();

		GuestTitlePage guesttitle = new GuestTitlePage(driver);

		guesttitle.GTC();

		Thread.sleep(2000);

	}

}
