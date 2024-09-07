package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		//isDisplayed() method 
		System.out.println(logo.isDisplayed());
		
		System.out.println("Status of the logo "+driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed());
		
		//isEnabled()
		
		System.out.println("Search element is enabled "+driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
		
		System.out.println("Register button is enabled "+driver.findElement(By.xpath("//*[@name='register-button']")).isEnabled());
		
		// isSelected()
		
		System.out.println("Before selection");
		
		System.out.println("Element is selected "+driver.findElement(By.xpath("//input[@value='M']")).isSelected());
		
		System.out.println("After selection");
		
		driver.findElement(By.xpath("//input[@value='M']")).click();
		
		System.out.println("Element is selected "+driver.findElement(By.xpath("//input[@value='M']")).isSelected());
		

		
	}

}
