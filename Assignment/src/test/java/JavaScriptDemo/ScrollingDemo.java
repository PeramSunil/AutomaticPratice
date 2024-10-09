package JavaScriptDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1) scrolling down to particular pixels
		
		/*js.executeScript("window.scrollBy(0,1000)", "");// It will scroll the page with 3000 pixels
		
		System.out.println(js.executeScript("return window.pageYOffset;")); // It will print the y axis position
		*/
		
		//2) Scrolling down to till particular element is visible
		
		/*WebElement ele=driver.findElement(By.xpath("//a[@class='home-link']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		*/
		
		
		//3) Scroll the page till bottom of page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// scrolling upto top of the page
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		
		

	}

}
