package Com.Cts.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import Com.Cts.dataprovider.ConfigReader;
import Com.Cts.factory.Browserfactory;

public class BaseClass {
public	WebDriver driver;
	@BeforeClass
	
	public void setup()
	
	{
		WebDriver driver=Browserfactory.startBrowser(ConfigReader.getproperty("browser"),ConfigReader.getproperty("appURL"));
	}
	
	public void teardown()	
	{
		Browserfactory.Closeallsession(driver);
	}

}
