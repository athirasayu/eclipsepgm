package testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazontask {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
		//search mobile phones
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones", Keys.ENTER);
		//verify title by using assertion
		String expect="Amazon.in : mobile phones";
		String actual=driver.getTitle()	;
		System.out.println(actual);
		Assert.assertEquals(expect, actual);
		
		String parentWindow=driver.getWindowHandle();//to handle current tab return type string
		System.out.println("parent window  "+driver.getTitle());
		//first phone detail
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2")).click();
		
		Set<String>allwindowhandles=driver.getWindowHandles();//multiple tabs return set
		for(String handle:allwindowhandles)//for each detail fetch
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
				
			{
   driver.switchTo().window(handle);
				//click add to cart 
   driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
           //select cart
   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")));
   driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
	}

}}}
