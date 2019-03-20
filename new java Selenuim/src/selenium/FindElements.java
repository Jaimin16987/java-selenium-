package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver Driver = new ChromeDriver();
				
		Driver.get("http://www.practiceselenium.com/");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
        
// for get count the link
		List<WebElement> listLink = Driver.findElements(By.tagName("a"));
// all the links are represented by Tag name <a>.
	System.out.println(listLink.size());
// for get size and text the link.	
	for(int i=0; i<listLink.size(); i++){
		String linkText =listLink.get(i).getText();
		System.out.println(linkText);
	}
	
	
	}

}
