package Musficas_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Musfica {
	
   public static void main(String[]args){
	   
	   WebDriver driver = new FirefoxDriver(); 
	   driver.get("http://borkotmicrotechna.com/ers/");
	   
	  Select title = new Select(driver.findElement(By.cssSelector("select[name='TitleId']")));
	  title.selectByVisibleText("Ms.");
	
	  
	  WebElement Initial = driver.findElement(By.cssSelector("input#Initial"));
	  Initial.sendKeys("NY");
			  
	   
	  WebElement FirstName = driver.findElement(By.cssSelector("input[name$='me']"));
	  FirstName.sendKeys("Soniya");
	  
	  WebElement MiddleName = driver.findElement(By.cssSelector("input[name*='Mi']"));
	  MiddleName.sendKeys("Islam");
	  
	  
	  
	  WebElement RadioButton = driver.findElement(By.cssSelector("input[name='Female']"));
	  RadioButton.clear();
	  
	  
   } 
   
   
   
   

	

}
