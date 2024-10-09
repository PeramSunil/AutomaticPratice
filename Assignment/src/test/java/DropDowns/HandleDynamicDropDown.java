package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("Testing");
		Thread.sleep(5000);
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li//div[@class='wM6W7d']//span"));
		
		for (WebElement op:options) {
			System.out.println(op.getText());
			
		}
		
		
		
		

	}

}
