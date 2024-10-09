package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 	// Handing the select type drop down.
		 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
	
	Select dropdownopt=new Select(drpCountryEle);
	
	// Select the options from the drop down
	
	dropdownopt.selectByVisibleText("France");
	//Thread.sleep(5000);
	dropdownopt.selectByValue("uk");
	//Thread.sleep(5000);
	dropdownopt.selectByIndex(5);
	//Thread.sleep(5000);
	
	
	// Capturing the options from dropdown
	
	List<WebElement> options=dropdownopt.getOptions();
	
	System.out.println("Options in Drop Down : "+options.size());
	
	// Printing the elements in dropdown.Enhanced for loop

	for (WebElement opt:options)
	{
		System.out.println(opt.getText());
	}
	
	// normal for loop
	
	for (int i=0;i<=options.size()-1;i++)
	{
	System.out.println(options.get(i).getText());	
	}
	
		
	//driver.quit();
	}

}
