package Com.Cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	private	By WelcomeMsg=By.xpath("//h4[@class='WelcomeMessage']");	
	

	public String getwelcomemsg()
	{
		String welcometext=driver.findElement(WelcomeMsg).getText();
		return welcometext;
	}
}
