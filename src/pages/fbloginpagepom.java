package pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class fbloginpagepom {
		WebDriver driver;//null bcz we didnt get url
		
		By fbemail=By.id("email");//by class lu one reference store path
		By fbpassword=By.id("pass");//object proposary
		By fblogin=By.id("login");
		
		public fbloginpagepom(WebDriver driver)//constructor through value pass
		{
			this.driver=driver;//same use this
		}
		public void setvalues(String email,String password)//value  pass use--  set values method
		{
			driver.findElement(fbemail).sendKeys(email);
			driver.findElement(fbpassword).sendKeys(password);
		}
		public void login()//login method
		{
			driver.findElement(fblogin).click();
		}

	}



