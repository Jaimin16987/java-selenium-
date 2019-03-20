package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://automationpractice.com");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
// for mouse movement action.
		Actions action = new Actions(Driver);
		action.moveToElement(Driver.findElement(By.xpath("//a[text()='Women']"))).build().perform();
		Thread.sleep(3000);
		Driver.findElement(By.linkText("T-shirts")).click();
//for drop down handling.
		Driver.findElement(By.xpath("//input[@id=\"layered_id_attribute_group_2\"]")).click();
		WebElement ele = Driver.findElement(By.id("selectProductSort"));
		Select select = new Select(ele);
		Thread.sleep(3000);
		select.selectByVisibleText("In stock");
					
		System.out.println("Testing done");
		
		
		
		
		
		
		
		
		
		

	}

}
