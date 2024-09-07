package Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledFrames {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	
	// Handeling the frames. Here we are switching the driver to frame
	
	// Frame 1
	WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	
	driver.switchTo().frame(frame1);
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
	
	driver.switchTo().defaultContent(); /* This is for switching back to main page. 
	With out switching back to main page. Frame to frame switching may not happens
	*/
	
	// Frame 2
	
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	
	driver.switchTo().frame(frame2);
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
	
	driver.switchTo().defaultContent();
	
	
	// Frame 3
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	
	driver.switchTo().frame(frame3);
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Testing");
	
	//driver.switchTo().defaultContent();
	
	Thread.sleep(5000);
	//driver.close();
	
	// Switching back to inner frame
	
	driver.switchTo().frame(0); // We are providing index as zero as we have only one page inside the page
	
	driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
	
	driver.switchTo().defaultContent();
	
	// Frame 5
	
	WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	
	driver.switchTo().frame(frame5);
	
	driver.findElement(By.xpath("//*[text()='https://a9t9.com']")).click();
	
	Boolean imgstatus=driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
	
	System.out.println("Image status after clicking on link " +imgstatus);

	
	
	

	}

}
