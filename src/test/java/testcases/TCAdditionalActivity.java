package testcases;

import org.testng.annotations.Test;

import pageobjects.AdditionalActivityPage;
import utils.LoginMethod_Hotel;

public class TCAdditionalActivity extends BaseTest{
	
	
	@Test
	public void test001() throws InterruptedException {
	LoginMethod_Hotel LM=new LoginMethod_Hotel(driver);
	LM.Login();
	
	AdditionalActivityPage eventCreation= new AdditionalActivityPage(driver);
	eventCreation.AAC();
	Thread.sleep(2000);
	
	
	}
	

}
