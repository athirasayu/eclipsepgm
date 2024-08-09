package testNG;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class taskdatadrivensauce {
		
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void test() throws IOException
	{
		File f=new File("C:\\Users\\admin\\Documents\\taskdatadriven.xlsx");//class object create thn give file path
		FileInputStream sb=new FileInputStream(f);//to read use this class
		XSSFWorkbook wb=new XSSFWorkbook(sb);//apache class object create
		XSSFSheet sw=wb.getSheet("Sheet1");//to store  
		System.out.println(sw.getLastRowNum());
		
		for(int i=1;i<=sw.getLastRowNum();i++)
		{
			String username=sw.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			String password=sw.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		}
	}
	}
			


