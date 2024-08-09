package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class taskblaze {
	WebDriver driver;
	By bdname=By.name("name");
	By bdcomapny=By.name("company");
	By bdemail=By.name("email");
	By bdpassword=By.name("password");
	By bdconfirmpd=By.name("password_confirmation");
	By bdregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By bdlogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public taskblaze(WebDriver driver)
	{
		this.driver=driver;
	}
	//public void setvalues(String name,String company,String email,String password,String confirmpd)//
	public void setvalues(String email,String password)
	{
	//	driver.findElement(bdname).sendKeys(name);
	//	driver.findElement(bdcomapny).sendKeys(company);
		driver.findElement(bdemail).sendKeys(email);
		driver.findElement(bdpassword).sendKeys(password);
		//driver.findElement(bdconfirmpd).sendKeys(confirmpd);
	}
	//public void register()//
	public void login()//
	{
		//driver.findElement(bdregister).click();
		driver.findElement(bdlogin).click();//
		
	}

}
