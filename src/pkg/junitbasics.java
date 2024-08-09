package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitbasics {
	ChromeDriver driver;//global variable
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("browser open");
		
		
	}
	@Test
	public void test()
	{
		String src=driver.getTitle();
		//System.out.println(src);//
		String expected="Google";
		if(src.equals(expected))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}
	@Test
	public void test1()
	{
		String src=driver.getPageSource();
		//System.out.println(src);//
		String expected="Gmail";
		if(src.contains(expected))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		
	}
	@After
	public void close()
	{
		driver.close();
		System.out.println("browser closed");
		
	}

}
