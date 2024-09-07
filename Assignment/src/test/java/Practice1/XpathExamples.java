package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		// Xpath with single attribute
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Mac");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mac");
		
		//Xapth with multiple attributes
		
		//driver.findElement(By.xpath("//*[@name='search'][@placeholder='Search']")).sendKeys("Mac");
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Mac");
		
		
		// Xpath with 'and' operators
		//driver.findElement(By.xpath("//*[@name='search' and @placeholder='Search']")).sendKeys("Mac");// It will locate when both should be true. Now it will locate the element
		//driver.findElement(By.xpath("//*[@name='search' and @placeholder='Sear']")).sendKeys("Mac"); // It will not work as one xpath is incorrect
		
		
		// Xpath with 'or' operator.
		//driver.findElement(By.xpath("//*[@name='search' or @placeholder='Sear']")).sendKeys("Mac");  // It will work when any one of the Xpath is correct.

		
		
		/*Xapth with Inner text we will use method text.
		
		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		boolean status=driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		
		System.out.println(status);
		String S1=driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		System.out.println(S1);*/
		
		
		
		/*Xpath with contains method
	
		driver.findElement(By.xpath("//*[contains(@name,'sea')]")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[contains(@name,'sea')]")).sendKeys("Iphone");*/
		
		
		
		/* Xpath with starts with method
		driver.findElement(By.xpath("//*[starts-with(@name,'sea')]")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys("Iphone");*/
		
		
		
		
		
		// Chained Xpath-- Combination of relative and absolute xpath. We don't find the attribute for target element.Then we will work parent element attribute
		
		boolean img=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		boolean img1=driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
		System.out.println(img);
		
		
		
		
		
		
	}

}
