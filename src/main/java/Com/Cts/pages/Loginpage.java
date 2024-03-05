package Com.Cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver )
	{
		this.driver=driver;
	}
private	By  user=By.xpath("//input[@id='email1']");
private	By pass=By.name("password1");
private	By login=By.xpath("//button[normalize-space()='Sign in']");
	
	public void logintoappasadmin(String username, String password)
	{
		
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(login).click();

}
}
