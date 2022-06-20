package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static String takeSS(WebDriver driver,String name) throws IOException {
		String logfile = new SimpleDateFormat("yyyyMMddHHmm'.png'").format(new Date());
		name = name + logfile;
		//String directory = "./Output/Screenshots/";
		String directory = System.getProperty("user.dir") + "//screenshot//";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(directory+name));
		return directory + name;
	}
	

}
