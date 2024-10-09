package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingMultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Handling the Bootstrap drop down
		
				driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // Opens the drop down
				
				// 1) Selecting the single value in dropdown
				
				//driver.findElement(By.xpath("//input[@value='Java']")).click();
				
				
				//2) Capturing all the values in dropdown
				
				List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
				
				System.out.println("Number of options : " +options.size() );
				
				//3) Printing all the elements
				for(WebElement ot:options) {
					System.out.println(ot.getText());
				}
		
				//4) Select the multiple options
				
				for (WebElement op:options) {
					String option=op.getText();
					 if (option.equals("Java")||option.equals("Python")||option.equals("Databases")) {
						 op.click();
					 }
				}
		
		
	}

}
