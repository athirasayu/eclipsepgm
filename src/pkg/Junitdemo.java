package pkg;

import org.junit.Before;
import org.junit.Test;

public class Junitdemo {
	@Before
	public void setup()
	{
	System.out.println("browser open");

}
	@Test
	public void test()
	{
		System.out.println("test activity");
	}
	@Before
	public void close()
	{
		System.out.println("test close");
	}
	
}
