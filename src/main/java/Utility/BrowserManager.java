package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManager {
	
	public static WebDriver BeforeExe(WebDriver driver,String Name) {
		if (Name.equalsIgnoreCase("chrome")) {
			System.setProperty(Contraints.chromeName, Contraints.chromePath);
			driver = new ChromeDriver();
		}else if (Name.equalsIgnoreCase("edge")) {
			System.setProperty(Contraints.edgeName, Contraints.edgePath);
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}

}
