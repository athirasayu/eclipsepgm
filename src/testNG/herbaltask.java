package testNG;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class herbaltask {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]")).click();
		//click my account and register details
	
	/*	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("atghi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Athi@122");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		driver.navigate().refresh();	*/
		//click login button and login
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("atghi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Athi@122");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		driver.navigate().refresh();
		
		//search herbal agro growth booster in search bar
	    driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("herbal agro growth booster",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();//click product
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();//click add to wishlist
		
	/*	//click on link skin add aloe fairness cream to ur wishlist
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
		
		//click  "all" link 
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		//Click health link
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		//click safety link
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		
		//scroll down to the bottom of page and click about us
		JavascriptExecutor j=(JavascriptExecutor) driver;//use this interface
		j.executeScript("window.scrollBy(0,5000)", "");
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		
		//screenshot of the element privacy policy
		 WebElement pri = driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));//to store web el//
		 File src=pri.getScreenshotAs(OutputType.FILE);//to  store one reference//
		 FileHandler.copy(src,new File("./sstask//element.png"));
		 
		 //response code of the link
		 String url="https://rishiherbalindia.linker.store/";
		 URL ob=new URL(url);
        
         HttpURLConnection con=(HttpURLConnection)ob.openConnection();
         int code=con.getResponseCode();
         System.out.println(code);
         con.connect();
         if(con.getResponseCode()==200)
         {
         System.out.println("valid url");
         }
         else
         
          {
         System.out.println("invalid");
              
          }*/}}
		
		
		
		
		



