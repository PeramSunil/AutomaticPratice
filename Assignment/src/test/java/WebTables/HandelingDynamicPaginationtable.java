package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelingDynamicPaginationtable {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("demo");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'#collapse-5')]")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		Thread.sleep(5000);
		String S=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		
		int pages=Integer.parseInt(S.substring(S.indexOf("(")+1,S.indexOf("Pages")-1)); // Extracting the sub string based on starting and ending index values.
		
		for (int p=1;p<=10;p++) {
			Thread.sleep(3000);
			driver.manage().window().fullscreen();// Used to handle the element not clickable exception at a particular point
			System.out.println(p);
			int rows=driver.findElements(By.xpath("//div[@class='table-responsive']//tr")).size();
			System.out.println(rows);
			for (int i=1;i<rows;i++) {
			String Customer_name=driver.findElement(By.xpath("//div[@class='table-responsive']//tr["+i+"]//td[2]/br/parent::*")).getText();// We used child xpath to get parent xpath- xpath axis concept
			System.out.println(Customer_name);
			String mail_id=driver.findElement(By.xpath("//div[@class='table-responsive']//tr["+i+"]//td[2]/br/parent::*/following::td[1]")).getText(); //Xpath access concept to get xpath
			System.out.println(mail_id);
		}
			if (p>1) {
				Thread.sleep(3000);
			WebElement  page_number=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+" and @class='page-link']"));
			page_number.click();
			
			}
		}
		
		
		
		
		

	}

}
