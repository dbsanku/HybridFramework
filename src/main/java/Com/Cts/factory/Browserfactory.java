package Com.Cts.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import Com.Cts.dataprovider.ConfigReader;

public class Browserfactory {
	
	public static  void Closeallsession(WebDriver driver)
	{
		driver.quit();
	}
	public static  void CloseActivesession(WebDriver driver)
	{
		driver.close();
	}
	public static WebDriver startBrowser(String appurl)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(appurl);
		return driver;
	}
	
	public static WebDriver startBrowser(String browser,String appurl)

	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
			
		else
		{
			System.out.println("sorry currently we do not support this" +browser);
		}
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getproperty("PageLoad"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Long.parseLong(ConfigReader.getproperty("scriptTimeout"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getproperty("implicitlyWait"))));

		driver.get(appurl);
		return driver;
	}

}
