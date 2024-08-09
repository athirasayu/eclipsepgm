package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktitle {
//title check
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="Facebook – log in or sign up";
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("case pass");
		}
		
		else
		{
			System.out.println("case fail");
		}
		//content check
		String actualsource=driver.getPageSource();
		String expect="profile";
		if(actualsource.contains(expect))
		{
		System.out.println("pass")	;
		}
		else
		{
			System.out.println("fail");
		}
	}

}
