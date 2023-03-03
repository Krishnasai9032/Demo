package TestNgDemo;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownDeom1
{
	@Test
	public void Pograme()
	{
		 System.setProperty("webdriver.chrome.driver","E:\\Demo1\\chromedriver.exe");
		  
			WebDriver driver = new ChromeDriver();
			
	   driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	   WebElement link1 =  driver.findElement(By.xpath("//select[@name='toMonth']/option[8]"));
	  boolean k= link1.isDisplayed();
	  Assert.assertFalse(k, "error message");
	   

//	   List<WebElement> Dropdown = driver.findElements(By.xpath("//select[@name='toMonth']//option[8]"));
	  
//	   Assert.assertTrue(true, " ");
	   
	   
	}
	
}
