package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class feautures {
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urloading()
	{
		System.out.println("url open");
	}
	@Test(priority=3,enabled=false)//enabled =false skip test1
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority=2,invocationCount=2)//invocation count 2 times execute
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority=1,dependsOnMethods= {"test2"})//after test2 only start test3
	public void test3()
	{
		System.out.println("test 3");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("report generation");//to generate report after each test
	}
	@AfterTest
	public void end()
	{
		System.out.println("close");
	}

}
