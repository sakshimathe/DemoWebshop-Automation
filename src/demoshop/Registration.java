package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	
public static void main(String args[] )throws InterruptedException {
		
	     //open the browser 
		ChromeDriver driver =new ChromeDriver();
		 Thread.sleep(2000);
		
		
		//maximize the browser
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		//enter into browser
		driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
	   // click the register link
	     driver.findElement(By.linkText("Register")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("gender-female")).click();
	     driver.findElement(By.id("FirstName")).sendKeys("sakshi");
	     driver.findElement(By.id("LastName")).sendKeys("mathe");
	     
	     //enter email
	     driver .findElement(By.id("Email")).sendKeys("sakshimathe@gmail.com");
	     Thread.sleep(2000);
	     
	     //enter password
	     driver .findElement(By.id("Password")).sendKeys("sakshi12");
	     Thread.sleep(2000);
	     
	     //confirm password
	     driver .findElement(By.id("ConfirmPassword")).sendKeys("sakshi12");
	     Thread.sleep(2000);
	     
	     //click on register
	     driver.findElement(By.id("register-button")).click();
	     
	     
	     
	     
//	     driver.close();
		 
}	 

}
