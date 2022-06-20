package Utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	
	public static String BrowserName(String browserName) throws IOException {
		File file = new File("./src/test/resources/Configure/configure.properties");
		FileReader fileRead = new FileReader(file);
		
		Properties prop = new Properties();
		prop.load(fileRead);
		
		return prop.getProperty(browserName);
	}
	
	public static String URL() throws IOException {
		File file = new File("./src/test/resources/Configure/configure.properties");
		FileReader fileRead = new FileReader(file);
		
		Properties prop = new Properties();
		prop.load(fileRead);
		
		return prop.getProperty("baseUrl");
	}
	
	public static String ProductName() throws IOException {
		File file = new File("./src/test/resources/Configure/configure.properties");
		FileReader fileRead = new FileReader(file);
		
		Properties prop = new Properties();
		prop.load(fileRead);
		
		return prop.getProperty("Product");

		
	}
	

}
