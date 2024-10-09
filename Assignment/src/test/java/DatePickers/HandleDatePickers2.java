package DatePickers;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDatePickers2 {
	
	 static Month convertMonth(String month) {
		 HashMap<String, Month> monthmap=new HashMap<String, Month>();
		 
		 monthmap.put("Jan", Month.JANUARY);
		 monthmap.put("Feb", Month.FEBRUARY);
		 monthmap.put("Mar", Month.MARCH);
		 monthmap.put("Apr", Month.APRIL);
		 monthmap.put("May", Month.MAY);
		 monthmap.put("Jun", Month.JUNE);
		 monthmap.put("Jul", Month.JULY);
		 monthmap.put("Aug", Month.AUGUST);
		 monthmap.put("Sep", Month.SEPTEMBER);
		 monthmap.put("Oct", Month.OCTOBER);
		 monthmap.put("Nov", Month.NOVEMBER);
		 monthmap.put("Dec", Month.DECEMBER);
		 
		 Month vmonth=monthmap.get(month);
		 if (vmonth==null) {
			 System.out.println("Invalid Month..");
		 }
		 return vmonth;
	 	}
	 public static void Dateclicking(WebDriver driver,String required_year,String required_month, String required_date ) {
		 WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 Select select=new Select(year);
			select.selectByVisibleText(required_year);
			WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select select1=new Select(month);
			//String display_month="Oct";
			select1.selectByVisibleText(required_month);
			/*while(true) {
				Month expectedmonth=convertMonth(required_month);
				Month displayedmonth=convertMonth(display_month);
				
				int result=expectedmonth.compareTo(displayedmonth);
				
				// 0 both months are equal
				// >0 Future month
				//<0 past month
				
				if(result<0) {
					
				}
				else if(result>0) {
					
				}
				else {
					
				}
			}*/
			
			List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			
			for (WebElement dt:dates) {
				if(dt.getText().equals(required_date)) {
					dt.click();
					
				}
			}
	 }
	 public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.findElement(By.xpath("//input[@class='hasDatepicker' and @name='SelectedDate']")).click();
		// 1) Using select the class for selecting two parameters
		Dateclicking(driver,"2015","Aug","15");
		
		
		
		
		

	}

}
