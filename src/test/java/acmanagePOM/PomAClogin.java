package acmanagePOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseACmanage;

public class PomAClogin extends BaseACmanage {
	
	//object repository
		@FindBy(name="username")WebElement Username;    //driver.findElement(By.
		@FindBy(name="password") WebElement Password1;
		@FindBy(xpath="//button[normalize-space()='Login']") WebElement Loginbtn;
		
		//initiate page elements
		public PomAClogin() {
			PageFactory.initElements(driver, this);
		}
		
		//creating method for POM page
		public void typeusername(String name) {
			Username.sendKeys(name);
		}
		
		public void typepassword(String pass) {
			Password1.sendKeys(pass);
		}
		
		public void clickbtn() {
			Loginbtn.click();
		}
		public String verify() {
			return driver.getTitle();
		}
		
				
}
