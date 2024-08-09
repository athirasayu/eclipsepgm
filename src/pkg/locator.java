package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	ChromeDriver driver;//Global variable
	@Before
	public void setup()
	{
	driver=new ChromeDriver();//object call
	driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("selenium");//Keys.ENTER);//locating selenium  by using locator of name by inspection//
		//name q//
		driver.findElement(By.name("btnK")).click();//if click doesnt work or run use-- enter key//google search -inspection -name btnk//
	}
	

}

