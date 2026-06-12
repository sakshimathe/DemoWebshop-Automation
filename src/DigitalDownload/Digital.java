package DigitalDownload;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Digital {

	public static void main(String[] args) throws Exception {
		  String expected_title="Demo Web Shop";
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/digital-downloads");
		  Thread.sleep(2000);
		  
		  List<WebElement> poll = driver.findElements(By.xpath("//select[@id='products-orderby']/option"));
		  
			 if(poll.size()>0)
			 {
				 System.out.println("i am in digital download and test case will pass");
				
			 }
			 else {
				 driver.close();
				 throw new Exception("i am not in digital download and test case will fail");
			 }
			 
			 

			 driver.get("https://demowebshop.tricentis.com/digital-downloads");

			 int size = driver.findElements(By.xpath("//select[@id='products-orderby']/option")).size();

			 for (int i = 0; i < size; i++) {

			     WebElement dropdown = driver.findElement(By.id("products-orderby"));
			     Select sel = new Select(dropdown);

			     sel.selectByIndex(i);

			     Thread.sleep(2000);
			 }

				  

}
}
