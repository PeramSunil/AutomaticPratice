package JavaScriptDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sunil");		
		WebElement name_id=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; // This is for upcasting if we use WebDriver
		//JavascriptExecutor js=driver; This is when we use ChromeDriver 
		
		// Alternative of sendkeys method
		
		js.executeScript("arguments[0].setAttribute('value','Sunil')", name_id); // JS statement for sendkeys method
		
		WebElement radio_ml=driver.findElement(By.xpath("//input[@id='male']"));
		
		// Alternative of click method
		
		js.executeScript("arguments[0].click()", radio_ml); // Js statements for click method
		
		
		
		
		
		
		
		

	}

}
