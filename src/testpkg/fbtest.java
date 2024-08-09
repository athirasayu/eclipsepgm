package testpkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.fbpage;
import utilities.excelutil;

public class fbtest extends baseclass {
	@Test
	public void verifyloginwithvalidCred () throws Exception
	{
		fbpage p1=new fbpage(driver);
		//reading the data from excel file by the specified path
		
		String x1="C:\\\\Users\\\\admin\\\\Documents\\\\datadriven.xlsx";
		String Sheet="Sheet1";
		int rowCount=excelutil.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++)
{
	String username=excelutil.getCellValue(x1,Sheet,i,0);
	System.out.println("username---"+username);
	String pswd=excelutil.getCellValue(x1,Sheet,i,1);
	System.out.println("pswd---"+pswd);
	
	//passing username and password as parameters
	
	//submit the data by clicking on login button
	p1.setvalues(username, pswd);
	p1.login();
	
	
}
		
	}
	
	
	

}
