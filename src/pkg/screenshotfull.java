package pkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotfull {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void screenshot() throws Exception
	{
	File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//to read takescreenshot is interface and getssas is method
	FileHandler.copy(ss, new File("E:\\screenshot.png"));//to copy or save to folder--file and filehandler javas class
	
	}

}
