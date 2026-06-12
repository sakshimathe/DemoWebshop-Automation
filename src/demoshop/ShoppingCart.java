package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {
	
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
		 
		 
		 //click on shopping cart
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

}
}
