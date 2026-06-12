package computer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputerAccessories {

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
		 driver.findElement(By.linkText("Computers")).click();
		 
        //click on desktop
         driver.findElement(By.linkText("Accessories")).click();
      
     // drop down
         
         WebElement position = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		  
		  driver.findElement(By.xpath("//select[@id='products-orderby']//option[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-orderby']//option[2]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-orderby']//option[3]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-orderby']//option[4]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-orderby']//option[5]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-orderby']//option[6]")).click();
		  Thread.sleep(1000);
		  
		//  display
		  
		  WebElement position1 = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		  
		  driver.findElement(By.xpath("//select[@id='products-pagesize']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-pagesize']//option[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-pagesize']//option[2]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-pagesize']//option[3]")).click();
		
		
		  
		  //view grid
		  
         WebElement position2= driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		  
		  driver.findElement(By.xpath("//select[@id='products-viewmode']//option[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//select[@id='products-viewmode']//option[2]")).click();
		  
		  
		  
      
      

}
}

