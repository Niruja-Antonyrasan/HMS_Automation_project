package testcases;

import org.testng.annotations.Test;

import pageobjects.ChildPolicyPage;
import utils.LoginMethod_Hotel;

public class TC_ChildPolicy extends BaseTest{
	
	@Test
	public void tc() {
		LoginMethod_Hotel LM=new LoginMethod_Hotel(driver);
		LM.Login();
		ChildPolicyPage CP = new ChildPolicyPage(driver);
		CP.ChildPLC();
		
	}
	
}
