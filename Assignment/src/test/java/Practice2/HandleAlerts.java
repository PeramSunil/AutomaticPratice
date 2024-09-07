package Practice2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		// 1) Normal Alert with OK button.
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Alert myalert=driver.switchTo().alert(); // Switching the driver to alert.
		
		Thread.sleep(10000);
		
		//myalert.accept();// accept() method will close the alert window with clicking on OK button.
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// 2) confirmation alert with OK & Cancel button.
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept(); // Closing the alert window by clicking on OK button
		
		driver.switchTo().alert().dismiss();// Closing the alert window by clicking on Cancel button.
		
		
		Thread.sleep(2000);
		
		// 3) Prompt Alert-- Input box
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert jsprompt=driver.switchTo().alert();
		System.out.println("Text message on alert " + jsprompt.getText());
		
		jsprompt.sendKeys("Welcome"); // sendkeys method will send the keys to prompt window.
		
		jsprompt.accept();
		
		String text=driver.findElement(By.xpath("//p[@id='result']")).getText(); // getText method will get the text on the prompt.
		if (text.contains("John")) {
			System.out.println("Text matched");
		}
		else {
			System.out.println("Text is not matched");
		}
	}

}
