package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://games.pragmaticplaylive.net/portal");
		
		System.out.println(driver.getTitle());//Gettitle command
		
		System.out.println(driver.getCurrentUrl()); // Get currenct URL command
		
		//System.out.println(driver.getPageSource());
		 
		System.out.println(driver.getWindowHandle());
		

	}

}
