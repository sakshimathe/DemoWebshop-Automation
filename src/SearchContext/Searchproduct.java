package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchproduct {
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
		 
		 //search product
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("computer");
		 
		 //click on search btn
		 driver.findElement(By.xpath("//input[@value='Search']")).click();
		 

}
}