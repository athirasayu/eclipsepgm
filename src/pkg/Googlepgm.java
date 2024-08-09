package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();//get title variable string already shown in page
	    System.out.println(actualtitle);
	    String expected="Google";//compare expected and actual//
	    if(actualtitle.equals(expected))//equal operator use and contrl stmt used for check both
	    {
	    	System.out.println("test pass");
	    }
	    else
	    {
	    	System.out.println("test fail");
	    }



driver.close();//close the tab
//driver.quit();//close entire browser tab
}}