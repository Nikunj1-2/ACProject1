package testlayer1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import acmanagePOM.PomAClogin;
import basePackage.BaseACmanage;
import testdata.Exceldata;

public class RunACmanage extends BaseACmanage{
	
	
	
	PomAClogin Log;
	public RunACmanage() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initiate();
		screenshots("Login");
		
		
	Log=new PomAClogin();
	}
	
	@Test(priority=1)
	public void Title() {
		String actual=Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");
	}
	
	@DataProvider
	public Object[][] Details(){
		Object result[][]=Exceldata.readdata("Sheet1");
		return result;
	}
	
	@Test(priority=2, dataProvider="Details")
	public void Login(String name,String password) throws InterruptedException {
		Log.typeusername(name);
		Thread.sleep(3000);
		Log.typeusername(password);
		//Log.clickbtn();
	}
	
	@AfterMethod
	public void close() { 
		driver.close();
	}

}
