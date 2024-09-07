package Practice1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationalcommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//driver.get("https://www.orangehrm.com/"); // Accepts URL only string formart
		
		
		driver.navigate().to("https://www.orangehrm.com/"); // Accepts URL in both string and URL formart
		
		//URL myurl=new URL("https://www.orangehrm.com/");
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://games.pragmaticplaylive.net/portal");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
	}

}
