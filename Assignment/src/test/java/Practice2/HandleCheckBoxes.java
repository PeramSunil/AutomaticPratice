package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		
		// Clicking the check box
		System.out.println("Selecting status "+checkbox.isSelected());
		//checkbox.click();
		System.out.println("Selecting status "+checkbox.isSelected());
		
		// Capturing the check boxes
		
		List<WebElement> checkbox1=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		
		System.out.println("Count of check boxes "+checkbox1.size());
		
		// Selecting all the check boxes
		
		/*for(int i=0;i<checkbox1.size();i++)
		{
			checkbox1.get(i).click();
		}
		
		for (WebElement ckbox:checkbox1) {
			ckbox.click();
		}*/
		
		// Selecting the last four check boxes
		
		//for (int j=3;j<checkbox1.size();j++) {
			//checkbox1.get(j).click();
		//}
		
		// Selecting the first three check boxes
		for (int m=0;m<checkbox1.size();m++) {
			checkbox1.get(m).click();
		}
		
		// Select and Unselect the check box
		for(int i=0;i<checkbox1.size();i++)
		{
			if(checkbox1.get(i).isSelected()) {
				checkbox1.get(i).click();
			}
			else {
				checkbox1.get(i).click();
			}
		}
		
		// Selecting the random check boxes
		
		for(int q=0;q<checkbox1.size();q++) {
			if (q==0 || q==2 || q==4|| q==6) {
				checkbox1.get(q).click();
				
			}
		}
		
		String weekname="Monday";
		
		switch (weekname) 
		{
		case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
					break;
		case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
			break;
		case "Tuesday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
				break;
		case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
			break;
		case "Thursday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
		break;
		case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
		break;
		case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
		break;
		default : System.out.println("Invalid Week name");
		
		}
		
		

	}

}
