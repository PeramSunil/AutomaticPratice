package JavaScriptDemo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		
		/*Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);*/
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// Statement for Zoom in and Zoom out
		
		js.executeScript("document.body.style.zoom='50%'"); // Zoom out the page to 50%
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='75%'");
		
		
		
		
		
		

	}

}
