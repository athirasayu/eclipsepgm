package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class actionsclass {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();

	}
	@BeforeMethod
	public void urloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		name.sendKeys("athira");
		WebElement redif=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act=new Actions(driver);//object create and call driver inside value
		act.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(redif,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();//to call mtd
		//act.build().perform();
	}

}
