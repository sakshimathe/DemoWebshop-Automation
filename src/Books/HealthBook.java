package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthBook {
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
		 
		 //click on books
		 driver.findElement(By.linkText("Books")).click();
		 
		 // click add to cart
		 driver.findElement(By.linkText("Health Book")).click();
		 
		 //clear quantity
		  driver.findElement(By.xpath("//input[@id='addtocart_22_EnteredQuantity']")).clear();
		 
		 //add quantity
		 
		  driver.findElement(By.xpath("//input[@id='addtocart_22_EnteredQuantity']")).sendKeys("2");

		  //add to cart
		  driver.findElement(By.xpath("//input[@id='add-to-cart-button-22']")).click();
}
}