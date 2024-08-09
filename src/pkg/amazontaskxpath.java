package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontaskxpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches",Keys.ENTER);//or right click xpath//
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("athira@123");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		driver.navigate().back();//navigate to back//
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/i")).click();//)
		
		
		
	}
	

}
