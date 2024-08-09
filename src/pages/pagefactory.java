package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	
	public pagefactory(WebDriver driver)//constructor value
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//no need to use driver. findelement just call
	}
	public void setvalues(String email,String Password)
	{
		fbemail.sendKeys(email);
		fbpassword.sendKeys(Password);
	}
public void login()
{
	fblogin.click();
}
}
