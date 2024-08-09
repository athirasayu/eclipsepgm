package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.taskblaze;

public class taskblazetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();	
	}
   @BeforeMethod
   public void url()
   {
	  // driver.get("https://blazedemo.com/register");//
	   driver.get("https://blazedemo.com/login");
	   
   }
   @Test
   public void test()
   {
	 /* taskblaze ob=new taskblaze(driver);
	   ob.setvalues("athi","luminar","athi@gmail.com","athi123","athi123");
	   ob.register();*/
	   taskblaze ab=new taskblaze(driver);
	   ab.setvalues("athi@gmail.com","athi123");
	   ab.login();
   }
}
