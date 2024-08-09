package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadrobot {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileupload("C:\\Users\\admin\\Downloads\\ATHIRA_CV.pdf");
	}
	public void fileupload(String p) throws AWTException//by using java below full
	{
		StringSelection strSelection=new StringSelection(p);//to select path to clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);//to store path in clip board
		Robot robot=new Robot();//to paste into system window//robot class object create
		robot.delay(3000);//keep wait for sometime
		
		robot.keyPress(KeyEvent.VK_CONTROL);//press and VK constant inside key event its have
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);//release
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(3000);//wait for some time
		robot.keyRelease(KeyEvent.VK_ENTER);//for open we use enter
		
		
		
		
		
		
	}}
	
	
