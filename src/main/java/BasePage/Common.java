package BasePage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.BrowserManager;
import Utility.ExtentRep;
import Utility.ReadProp;
import Utility.Screenshot;

public class Common {

	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest test;

	public static void OpenUrl(String name) throws IOException {
			driver = BrowserManager.BeforeExe(driver, ReadProp.BrowserName(name));
			driver.get(ReadProp.URL());
	}

	public static void driver_close() {
		driver.close();
	}
	public static void Start_Report() {
		reports = ExtentRep.getIns();
		test = reports.startTest("started");
	}
	public static void End_Report() {
		reports.endTest(test);
		reports.flush();
	}

	public static void afterMeth(ITestResult res) throws IOException {
		if (res.getStatus() == res.FAILURE) {
			String path = Screenshot.takeSS(driver, res.getName());
			String imagepath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, res.getMethod().getMethodName(),imagepath);
		}else if (res.getStatus() == res.SUCCESS) {
			test.log(LogStatus.PASS, res.getMethod().getMethodName());
		}else {
			test.log(LogStatus.SKIP, res.getMethod().getMethodName());
		}
	}
}
