package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Documents/design.html");	
	}
	@Test
	public void test()
	{
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();//handle driver to alert switch 
		/*Alert a=driver.switchTo().alert();//for test verification we use alert interface//
		String text=a.getText();
		if(text.equals("alert box"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		a.accept();*/
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("athira");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sm");
	}

}
