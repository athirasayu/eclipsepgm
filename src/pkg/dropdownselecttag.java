package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownselecttag {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	

}
@Test
public void test()
{
	WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select day=new Select(dayelement);//object create
	day.selectByValue("04");//call by object
	List <WebElement> li=day.getOptions();//count get
	System.out.println(li.size());
	WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select month=new Select(monthelement);
	month.selectByIndex(2);
	List <WebElement> list=month.getOptions();
	System.out.println(list.size());
	WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select year=new Select(yearelement);
	year.selectByVisibleText("1996");
	List <WebElement> lis=year.getOptions();
	System.out.println(lis.size());
	
}}
