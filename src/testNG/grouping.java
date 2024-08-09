package testNG;

import org.testng.annotations.Test;

public class grouping {
	@Test(groups= {"sanity"})//need to grp any 2 or 3 using xml
	public void main1()
	{
		System.out.println("this is main1")	;
 }
	@Test(groups={"sanity","smoke"})
	public void main2()
	{
		System.out.println("this is main2");
		
	}
@Test(groups= {"regression"})
public void main3()
{
	System.out.println("this is main3");
}
@Test(groups= {"sanity","regression"})
public void main4()
{
	System.out.println("this is main4");
}
@Test(groups= {"regression"})
public void main5()
{
	System.out.println("this is main5");
}
}
