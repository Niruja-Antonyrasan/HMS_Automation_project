package testcases;

import org.testng.annotations.Test;

import pageobjects.ReserveRoomPage;
import utils.LoginMethod;

public class TC_ReserveRoom extends BaseTest {
	@Test
	public void tc() {
		LoginMethod LM=new LoginMethod(driver);
		LM.Login();	
	
	ReserveRoomPage RR = new ReserveRoomPage(driver);
	RR.ResRoom();
			
	}
}
