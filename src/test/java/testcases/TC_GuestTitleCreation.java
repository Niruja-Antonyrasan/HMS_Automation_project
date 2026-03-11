package testcases;


import org.testng.annotations.Test;

import utils.GuestTitleCreation;
import utils.LoginMethod;

public class TC_GuestTitleCreation extends BaseTest{
	@Test
	public void test001() throws InterruptedException   {
		LoginMethod LM=new LoginMethod(driver);
		LM.Login();
		
		GuestTitleCreation guesttitle= new GuestTitleCreation(driver);
		
		guesttitle.GTC();
		
		Thread.sleep(2000);
		
		
		
		
	}

}
