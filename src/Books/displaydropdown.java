package Books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displaydropdown {
	
	public static void main(String[]args) throws InterruptedException
	{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/books?orderby=0");
		  
		  Thread.sleep(2000);
		  WebElement position = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		  
		  driver.findElement(By.xpath("//select[@id='products-pagesize']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//select[@id='products-pagesize']//option[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//select[@id='products-pagesize']//option[2]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//select[@id='products-pagesize']//option[3]")).click();
		
		  
		  
		  driver.close();

}}
