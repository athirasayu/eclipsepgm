package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://ww.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement> Li = driver.findElements(By.tagName("a"));//links start from a
		System.out.println("link count"+Li.size());//count get
		
		for(WebElement w:Li)     //for each//details one by one get  //for(datatype tempvarname:arrayname)//
		{
			String link=w.getAttribute("href");//links attribute
			String text=w.getText();//text also need to get
			System.out.println(link+"----"+text);
			
		}
		
	

}}
