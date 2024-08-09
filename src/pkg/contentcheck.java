package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class contentcheck {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
    String actualsource=driver.getPageSource();
	String expected="Gmail";
	if(actualsource.contains(expected))
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("test fail");
	}
		
	

	}

}
