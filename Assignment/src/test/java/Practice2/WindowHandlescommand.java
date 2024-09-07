package Practice2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlescommand {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowsID=driver.getWindowHandles();

		// Approach
		List<String> windowList= new ArrayList(windowsID);
		
		String ParentID=windowList.get(0);
		String ChildID=windowList.get(1);
		
		System.out.println(driver.getTitle());
		
		// Switch to child window
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		
		// Switch to parent window
		driver.switchTo().window(ParentID);
		System.out.println(driver.getTitle());
		
	}
	

}
