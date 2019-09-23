package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ERS {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		String baseURL ="http://borkotmicrotechna.com/ers/login.html";
		driver.get(baseURL);
		
		String x = driver.getTitle();
		System.out.println(x);
	
	String Y = driver.findElement(By.xpath("html/body/h1")).getText();
	System.out.println(Y);
	
	driver.findElement(By.name("UserName")).sendKeys("Soniya");
	driver.findElement(By.name("Password")).sendKeys("abc123");
	driver.findElement(By.xpath("//*[@id='userName']/p[3]/input")).click();

	Select title = new Select(driver.findElement(By.id("TitleId")));
	title.selectByVisibleText("Ms.");
	
	driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Soniya");

	driver.findElement(By.xpath(".//*[@id='MiddleName']")).sendKeys("abc123");
	
	
	
	
	
	
	}
}
