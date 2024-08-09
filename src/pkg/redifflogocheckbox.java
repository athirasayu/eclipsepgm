package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifflogocheckbox {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()//check logo selected or not //is display is select is enable
	{
		WebElement sc=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		//Boolean b=driver.findelement((By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));//
		boolean b=sc.isDisplayed();//return type boolean so declare  isdisplayed method
		if(b)
		{
			System.out.println("logo displayed");
		}
		else
		{
			System.out.println("not displayed");
		}}
		@Test
		public void checkbox()//check checkbox
		{
		WebElement s=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		boolean bo=s.isSelected();
		if(bo)
		{
			System.out.println("checkbox selected");
		}
		else
		{
			System.out.println("not selected");
		}}
		@Test
		public void radio()//check radiobutton
		{
		WebElement si=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean bl=si.isDisplayed();
		if(bl)
		{
			System.out.println("male button selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		
		
	}

	


}
