package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebookdropdown {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
   @BeforeMethod
   public void open()
   {
	   System.out.println("url open");
	   driver.get("https://www.facebook.com/signup");
   }
   @Test
   public void test()
   {
	   WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	   Select day=new Select(dayelement);
	   day.selectByValue("4");
	   WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	   Select month=new Select(monthelement);
	   month.selectByValue("2");
	   WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	   Select year=new Select(yearelement);
	   year.selectByValue("1997");
	   
	   
   }
}
