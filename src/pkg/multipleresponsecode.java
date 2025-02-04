package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleresponsecode {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);//get url
		

}
	@Test
	public void linkcount()
	{
	List<WebElement> li	=driver.findElements(By.tagName("a"));
	//System.out.println("tot no of links="+li.size());//
	for(WebElement s:li)
	{
		String link=s.getAttribute("href");
		verify(link);
	}
	}
	public void verify(String link)
	{
		try 
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid----"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link---"+link);
			}
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}
  