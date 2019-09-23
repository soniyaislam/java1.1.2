package Test11;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages11.Emp_Registration;
import Pages11.LoginERS;

public class Test_Login1 {
	
	WebDriver driver;
	LoginERS objLogin;
	Emp_Registration objRegistrationPage;
	
	
	
	@BeforeMethod
	public void Setup(){ 
		driver = new FirefoxDriver();
		driver.get("http://borkotmicrotechna.com/ers/Login.html");
		
	}
	
	@Test(priority=0)
	
	public void test1(){
		
		objLogin=new LoginERS(driver);
		
		String loginPageTitle=objLogin.pageHeaderName();
		Assert.assertTrue(loginPageTitle.contains("Employee Registration System,ERS"));
		
		//to enter user and password
		objLogin.loginERS_application("soniya","abc123");
		
		//verify that user name in the Registration Page
		objRegistrationPage= new Emp_Registration(driver);
		
		String RegFormText = objRegistrationPage.UserFormText();
		Assert.assertTrue(RegFormText.contains("User Form"));
		
		
		System.out.println("good");
		
		
	}
}
