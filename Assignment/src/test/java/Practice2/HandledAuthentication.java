package Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledAuthentication {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		/* In order to handle in this pop up we need pass the username and password values along with URL
		 Syntax: for the URL--------https://the-internet.herokuapp.com/basic_auth
		 
		  https://username(value):password(value)@the-internet.herokuapp.com/basic_auth
		  
		  it follows as-------
		  https://admin:admin@the-internet.herokuapp.com/basic_auth-- We need use this link in get command
		 
		*/
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		driver.close();
		
		
		
		
		

	}

}
