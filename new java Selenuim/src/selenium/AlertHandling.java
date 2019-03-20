package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver Driver = new ChromeDriver();
				
		Driver.get("http://demo.guru99.com/test/delete_customer.php");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
	String error = Driver.switchTo().alert().getText();
	System.out.println(error);
	Thread.sleep(5000);
	Driver.switchTo().alert().accept();
	System.out.println("Testing done");
	Driver.quit();
	
	
	}

}
