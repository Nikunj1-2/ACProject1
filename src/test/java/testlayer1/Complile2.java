package testlayer1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Complile2 {
	
	
	
	@Test
	public void testing() throws InterruptedException{
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nikun\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	driver.close();
	
 }
	
	

}
