package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver Driver = new ChromeDriver();
				
		Driver.get("https://www.paychex.com/login");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.findElement(By.linkText("Paychex Flex login")).click();
		Set<String> handler = Driver.getWindowHandles();
		Iterator<String> str = handler.iterator();
           String perentWindowId =  str.next();
	System.out.println("perent windowId is "+ perentWindowId);
	        String childWindowId = str.next();
	 System.out.println("Child windowId is "+childWindowId);
	 
	 Driver.switchTo().window(childWindowId);
	 Thread.sleep(2000);
	 
	 System.out.println("child window title is "+Driver.getTitle());
	 Driver.close();
	 Driver.switchTo().window(perentWindowId);
	 Thread.sleep(2000);
	 System.out.println("perent window title is "+Driver.getTitle());
	 Driver.close();
	
	
	
	
	}

}
