package testcases;

import org.testng.annotations.Test;

import testcases.BaseTest;
import utils.AdditionalActivityCreation;
import utils.LoginMethod;

public class TCAdditionalActivity extends BaseTest{
	
	
	@Test
	public void test001() throws InterruptedException {
	LoginMethod LM=new LoginMethod(driver);
	LM.Login();
	
	AdditionalActivityCreation eventCreation= new AdditionalActivityCreation(driver);
	eventCreation.AAC();
	Thread.sleep(2000);
	
	
	}
	

}
