package pkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecode {//particular link only fetch
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);//get url
		
	}
	@Test
	public void linkcount() throws Exception
	{
		URL ob=new URL(baseurl);//object create
		                          //openconnection covert to subclass typecasting subclass of url httpurlconnection//
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();//call openconnection
		int code=con.getResponseCode();//response code only have httpurl so we typecast
		System.out.println(code);
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
		}
		else
		{
			System.out.println("invalid");
		}
		
	}

}
