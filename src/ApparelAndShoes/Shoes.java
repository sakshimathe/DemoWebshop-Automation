package ApparelAndShoes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoes {

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
		 driver.findElement(By.linkText("Apparel & Shoes\n"
		 		+ "")).click();
		 
      //click on desktop
       driver.findElement(By.linkText("Camera, photo")).click();
       
	}
	
}


