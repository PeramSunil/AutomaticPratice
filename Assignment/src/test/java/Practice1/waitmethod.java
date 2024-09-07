package Practice1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitmethod {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
		
		// Explicit wait Concept
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));// Declaration of Explicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))); // Usage of Explicit wait
		
		// We can also do in this way
		
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))); // Usage of Explicit wait
		username.sendKeys("Admin");*/
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		/* Different Conditions
		elementSelectionStateToBe()
		elementToBeClickable()
		elementToBeSelected()
		frameToBeAvaliableAndSwitchToIt()
		presenceOfAllElementsLocatedBy()
		presenceOfElementLocated()
		textToBePresentInElement()
		textToBePresentInElementLocated()
		textToBePresentInElementValue()
		titleIs()
		titleContains()
		visibilityOf()
		visibilityOfAllElements()
		visibilityOfAllElementsLocatedBy()
		visibilityOfElementLocated() 
		*/
		
		// Fluent wait Concept
	
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// Declaration ofFluent Wait
			 Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				       .withTimeout(Duration.ofSeconds(10))
				       .pollingEvery(Duration.ofSeconds(2))
				       .ignoring(NoSuchElementException.class);
		
			 
			 WebElement userna=mywait.until(new Function<WebDriver, WebElement>() {
				 public WebElement apply(WebDriver driver) {
				 return driver.findElement(By.xpath("//input[@placeholder='Username']"));
				 }
				 });
	}

}
