package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
public static void main(String [] args) throws InterruptedException {
		
		//open the browser
		ChromeDriver driver =new ChromeDriver();
		 Thread.sleep(2000);
		
		
		//maximize the browser
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		//enter into browser
		driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 //click on login link 
		 driver.findElement(By.linkText("Log in")).click();
		 Thread.sleep(1000);
		 

	     //enter email
	     driver.findElement(By.id("Email")).sendKeys("mathesakshi20@gmail.com");
	   
	   //enter password
	     driver .findElement(By.id("Password")).sendKeys("sakshi");
	     
	     driver.findElement(By.id("RememberMe")).click();
	    
	    
	     
	     driver.findElement(By.className("buttons")).click();
	     Thread.sleep(1000);
		 
}
}
