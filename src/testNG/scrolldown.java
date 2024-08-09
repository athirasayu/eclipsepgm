package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class scrolldown {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		JavascriptExecutor j=(JavascriptExecutor) driver;//use this interface
		//j.executeScript("window.scrollBy(0,1000)", "");//to call executescript by using pixel method
		j.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")));
		//by using element is visible
		//j.executeScript("window.scrollBy(0,document.body.scrollHeight)");//by using scrolldown to bottom of page
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
		
	}

}

