package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMethod_Restaurant extends pagebase {

	public LoginMethod_Restaurant(WebDriver driver) {
		super(driver);}
		
		public void Login() {
			
			By txt_username_loc = By.xpath("//input[@id='email']");
			By txt_password_loc = By.xpath("//input[@id='password']");
			By btn_login_loc = By.xpath("//span[normalize-space()='Sign In']");

			driver.findElement(txt_username_loc).sendKeys("netconet3@gmail.com");

			driver.findElement(txt_password_loc).sendKeys("123");

			driver.findElement(btn_login_loc).click();

			driver.findElement(By.xpath("//div[text()='MOJU']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'RESTAURANT')]")).click();
	}

}
