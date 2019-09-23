package Page_Factory11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emp_Registration {
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='details']/h2")
	@CacheLookup
	WebElement RegPageFormText;
	
	//By  RegPageFormText=By.xpath(".//*[@id='details']/h2");
	public String UserFormText(){
		return RegPageFormText.getText();
		//return driver.findElement(RegPageFormText).getText();
		
	}
	
	
	public Emp_Registration(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	

}
