
package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tabhandlepgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
		}
	@Test
	public void test()
	{
		String parentWindow=driver.getWindowHandle();//to handle current tab return type string
		System.out.println("parant window  "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindowhandles=driver.getWindowHandles();//multiple tabs return set
		for(String handle:allwindowhandles)//for each detail fetch
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
				
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("athira@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
			}
			driver.switchTo().window(parentWindow);
		}
		/*WEbDriver dr=driver.switchTo().newWindow(WindowType.TAB);
		WEbDriver dr=driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");*/
		
		
	}
	

}
