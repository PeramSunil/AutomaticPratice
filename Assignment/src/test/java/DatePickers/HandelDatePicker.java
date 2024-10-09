package DatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelDatePicker {
	
	public static void SelectFutureDate(WebDriver driver,String month,String year,String Date){
		 while(true) {
			 String web_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 String web_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 if (web_month.equals(month) && web_year.equals(year)) 
			 {
				 List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				 for (WebElement dt:dates) {
					 if (dt.getText().equals(Date)) {
						 dt.click();
						 //break;
					 }
				
				 }
				 break;
				 
			 }
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // To click the Next button, when we want to select the future date.
		 }
	}
	
	public static void SelectPastdate(WebDriver driver,String month,String year,String Date) {
		 while(true) {
			 String web_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 String web_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 if (web_month.equals(month) && web_year.equals(year)) 
			 {
				 List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				 for (WebElement dt:dates) {
					 if (dt.getText().equals(Date)) {
						 dt.click();
						 //break;
					 }
				
				 }
				 break;
				 
			 }
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // To click on Previous button, when we want to select the past date
		 }
	}

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker");
		driver.manage().window().maximize();
		
		// Date picker is available i frame. Switch to frame
		
		driver.switchTo().frame(0);
		
		//1) Using send keys method
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/06/1998");
		
		// 2) Using Date Picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // To open the date picker
		SelectFutureDate(driver,"April","2026","10");
		//SelectPastdate(driver,"June","1998","10");
		
		
		
		
		
		
		
		
		

	}

}
