package com.Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
// if we define (priority=1)with any test case, its run first.
	WebDriver Driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		 Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void facebookTitle() {
		String title = Driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1)
	public void signUpLinkTest() {
		boolean d = Driver.findElement(By.xpath("//*[@id=\"u_0_15\"]")).isDisplayed();
	}

   @AfterMethod
   public void tearDown() {
	   Driver.quit();
   }


}
