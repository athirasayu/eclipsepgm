package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void main()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		String expected="https://www.facebook.com/";
		if(expected.equals(actual))
		{
		System.out.println("pass")	;
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
