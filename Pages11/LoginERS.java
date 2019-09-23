package Pages11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginERS {

	WebDriver driver;
	
	By userName = By.name("UserName");
	By password = By.name("Password");
	By login_btn = By.xpath(".//[@id='userName']/p[3]/input");
	By PageHeading =By.xpath("html/body/h1");
	
	public LoginERS(WebDriver driver){
		this.driver= driver;
	}
	
	public void setUserName(String strUserName){
		driver.findElement(userName).sendKeys("Soniya");
		
	}
	
	public void setPassword(String strPassword){
		driver.findElement(password).sendKeys("abc123");
		
	}
	
	public void clickOnLogin(){
	 driver.findElement(login_btn).click();
		
	}
	
	public String pageHeaderName(){
		return driver.findElement(PageHeading).getText();
		
		
	}
	
	public void loginERS_application(String strUserName,String strPassword){
		
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickOnLogin();
		System.out.println("Successfully");
	}
	
}
