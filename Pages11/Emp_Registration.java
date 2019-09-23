package Pages11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Emp_Registration {
	WebDriver driver;
	By RegPageFormText =By.xpath(".//*[@id='details']/h2");
	
	public String UserFormText(){
		return driver.findElement(RegPageFormText).getText();
		
	}

	public Emp_Registration(WebDriver driver){
		this.driver=driver;
		
	}
}
