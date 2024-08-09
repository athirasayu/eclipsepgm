
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.fbloginpagepom;



public class fblogintest {
	WebDriver driver;
	@BeforeTest//we use annotation for run
	public void setup()
{
	driver=new ChromeDriver();
}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin()
	{
		fbloginpagepom ob =new fbloginpagepom(driver);//constructor use so direct call access we use to create object 
		ob.setvalues("athi@gmail.com", "abcd");//then call setvalues and login method by using object
		ob.login();
	}

}
