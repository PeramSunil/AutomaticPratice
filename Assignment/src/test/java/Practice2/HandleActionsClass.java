package Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleActionsClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		
		// Creating actions class
		Actions act=new Actions(driver);
		
		//1) Right click functionality
		
		WebElement double_click=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		act.doubleClick(double_click).build().perform();
		
		// Getting value getattribute call
		
		String value=driver.findElement(By.xpath("//input[@type='text' and @id='field1']")).getAttribute("value");
		System.out.println(value);
		
		
		// Drag and drop
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source, destination).build().perform();


		

	}

}
