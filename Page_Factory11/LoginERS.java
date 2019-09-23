package Page_Factory11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginERS {
	WebDriver driver;
	
	//Locator
	
	@FindBy(name="Username")
	@CacheLookup
	WebElement userName;
	

	@FindBy(name="Password")
	@CacheLookup
	WebElement password;
	
	
	@FindBy(xpath=".//*[@id='username']/p[3]/input")
	@CacheLookup
	WebElement login_btn;
	
	@FindBy(xpath="html/body/h1")
	WebElement PageHeading;
	
	//By userName=By.name("UserName");
	//By password=By.name("Password");
	//By login_btn=By.(xpath=".//*[@id='username']/p[3]/input")
    //By pageHeading=By.(xpath="html/body/h1")

	public LoginERS(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);  //this=this class //initElements method will creat all elements.
	
	}

    public void setUserName(String strUsername){
    	userName.sendKeys("Soniya");
    	//driver.findElement(userName).sendkeys("Soniya");
    	
    }
    
    public void setpassword(String strPassword){
    	password.sendKeys("abc123");
    	//driver.findElement(Password).sendkeys("abc123");
  
}
    
    public void clickOnLogin(){
    	login_btn.click();
    	//driver.findElement(login_btn).click();
    }
    
    public String pageHeaderName(){
    	return PageHeading.getText();
    	//driver.findElement(PageHeading).getText();
    			 
    }
    
    public void loginERS_application(String strUsername,String strPassword){
    	this.setUserName(strUsername);
    	this.setpassword(strPassword);
    	this.clickOnLogin();
    	
    }
}
    	
    	
    	
    	
    	
    	
    	
    	
    
    
        