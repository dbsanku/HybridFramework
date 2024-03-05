package Com.Cts.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static String getproperty(String key)
	{
		Properties pro=new Properties();
		try {
			pro.load(new FileInputStream(new File("./Configaration/Config properties")));
		} catch (FileNotFoundException e) {
			System.out.println("File not found please check the location "+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read the File"+e.getMessage());
		}
	
		 String value=pro.getProperty(key);
		 return value;
		
		
		
		
	}
	
	

}
