package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	
	
	public WebDriver driver;

	@BeforeSuite 
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://teststaybreez.invictainnovations.com/auth/login/user");
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}

	
	
		

	}

	
	
	


