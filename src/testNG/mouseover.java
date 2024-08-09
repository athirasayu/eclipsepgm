
package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseover 
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();

	}
	@BeforeMethod
	public void urloading()
	{
		driver.get("https://www.ebay.com/");
		
	}
	@Test
	public void test()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait for all codes
		WebElement el=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(el).perform();//move to element method we use
		//act.moveToElement(el);
		//act.perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//explicit class //web driver class until method we use for particular
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();

		
	}

}
