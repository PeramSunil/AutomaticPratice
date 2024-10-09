package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticWebTable {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		
		// 1) Finding the number rows in table
		
		/* If we have only one table name on the web page. we can get the number of rows by tag name
		int rows1=driver.findElements(By.tagName("tr")).size();
		System.out.println(rows1);*/
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows "+ rows);
		
		//2) Finding the number of coloums 
		int colomns=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("Number of colomns " + colomns);
		
		//3) Some data from specific row and colomn
		
		String Data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).getText();
		System.out.println(Data);
		
		// 4) Read the data from each row and colomn
		
		for (int r=2;r<=rows;r++) {
			for (int c=1;c<=colomns;c++ ) {
				// We pass the variabes as parameters in xpath
				System.out.println((driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText())+"\t"); // "+r+" is used to paramater in xpath. standard path
				}
		}
		  
		//5) Printing the data based on condition.
		
		for (int x=2;x<=rows;x++) {
			if (driver.findElement(By.xpath("//table[@name='BookTable']//tr["+x+"]//td[2]")).getText().equals("Amit")) {
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+x+"]//td[1]")).getText());
				
			}
			}
		
		//6) Total price of all books on the data
		int int_price=0;
		for (int q=2;q<=rows;q++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+q+"]//td[4]")).getText();
			int_price=int_price+Integer.parseInt(price);
			}
			System.out.println(int_price);

		
		
			//blazedemo.com
			
		//driver.quit();

	}

}
