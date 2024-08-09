package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddropmethod {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);//object
		act.dragAndDrop(drag, drop);//call drag and drop method by using object name
		act.perform();
		String s=drop.getText();//test verification
		System.out.println(drop.getText());	
		if(s.equals("dropped"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}}
		
	


