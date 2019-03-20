package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelenuimClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver Driver = new ChromeDriver();
				
		Driver.get("http://www.practiceselenium.com/");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    Driver.findElement(By.xpath("//a[@id=\"wsb-button-00000000-0000-0000-0000-000450914890\"]")).click();
	    Driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000451955160")).click();
	    Driver.findElement(By.id("email")).sendKeys("patel@yahho.com"); 
	    Driver.findElement(By.xpath("//textarea['rows=\"3\"']")).sendKeys("3456,irving,tx8");
// this following code for drop down Elements.
	    Select select = new Select(Driver.findElement(By.id("card_type")));
	    select.selectByVisibleText("Visa");
	    
	    Driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("12345");
	    Driver.findElement(By.className("span1")).sendKeys("456");
	    Thread.sleep(5000);
	    Driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	    Thread.sleep(5000);
	    Driver.quit();
	    System.out.println("Testing done");
	}

}
