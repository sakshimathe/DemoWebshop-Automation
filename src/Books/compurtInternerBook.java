package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class compurtInternerBook {
	
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
		 
		 //click dropdown   //select[@id='products-orderby']
		 
		 
		 // click add to cart
		 driver.findElement(By.linkText("Computing and Internet")).click();
		 
		 //clear quantity
		  driver.findElement(By.xpath("//input[@id='addtocart_13_EnteredQuantity']")).clear();
		 
		 //add quantity
		 
		  driver.findElement(By.xpath("//input[@id='addtocart_13_EnteredQuantity']")).sendKeys("2");

		  //add to cart
		  driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
		  
}
}