package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/register");	

}
   @Test
    public void test()
    {
    driver.findElement(By.name("name")).sendKeys("athira");
    driver.findElement(By.name("company")).sendKeys("ITC info");
    driver.findElement(By.name("email")).sendKeys("athira@gmail.com");
    driver.findElement(By.name("password")).sendKeys("athi@123");
    driver.findElement(By.name("password_confirmation")).sendKeys("athi@123");
    driver.findElement(By.name("password_confirmation")).sendKeys("athi@123");
   driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
    
    
    }}
