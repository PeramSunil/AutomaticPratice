package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com");
		Thread.sleep(1000);
		String St=driver.getTitle();
		
		if(St.equalsIgnoreCase("nopCommerce demo store"))// checking given web page title matches with that tile.
		{
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		Thread.sleep(1000);
		driver.quit();
		

	}

}
