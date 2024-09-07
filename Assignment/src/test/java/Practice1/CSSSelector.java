package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();// In order to maximize the window
	
	driver.get("https://demo.nopcommerce.com/");
	Thread.sleep(5000);
	
	// Searching with tag and ID combination
	
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Samsung S22"); // here tag name is optional.
	//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Samsung S22");

	
	// Searching with tab and classname
	
	//driver.findElement(By.cssSelector("button.button-1")).click(); // In class name when we have two names with two words with spaces. We can remove the second word
	
	
	// Searching with Tag and Attribute
	
	//driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	
	// Searching with Tag,Classname and attribute
	
	driver.findElement(By.cssSelector("button.button-1[type='submit']")).click();	
	
	}

}
