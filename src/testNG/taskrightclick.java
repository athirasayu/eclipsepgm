package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class taskrightclick {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
	WebElement w=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));	//ctrl+shift+i bcz inspection option not availe
	Actions act=new Actions(driver);
	act.contextClick(w);//for right click use context click and call reference
	act.perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();//edit only have alert so inspect edit
	driver.switchTo().alert().accept();
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleclick).perform();//for double click we use double click mtd
	//driver.switchTo().alert().accept();//
	Alert a=driver.switchTo().alert();
	String s=a.getText();
	System.out.println(s);
	if(a.equals("You double clicked me.. Thank You.."))//for test verification
		
	{
	System.out.println("test pass");
	}
	else
		
	{
		System.out.println("test fail");
	}
	a.accept();

	}
	
	
	
}


