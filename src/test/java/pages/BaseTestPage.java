package pages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePage.Common;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;

public class BaseTestPage  extends AbstractTestNGCucumberTests{
	public TestNGCucumberRunner testng;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browser) throws IOException {
		testng = new TestNGCucumberRunner(getClass());
		Common.OpenUrl(browser);
		Common.Start_Report();
	}
	@Test
	public void NavBar_Action() {
		LoginPage.NavBar_Moveto_Action();
	}
	@Test
	public void Carrer_Btn_Scroll() {
		HomePage.FooterCareer_Javascript();
	}
	@Test(priority = 1,enabled = false)
	public void AlertClick() {
		HomePage.Alert_Switch();
	}
	@Test(enabled = false)
	public void Iframe_Test() {
		HomePage.Iframe_Switch();
	}
	
	
	@AfterMethod
	public void after_Meth(ITestResult result) {
		try {
			Common.afterMeth(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@AfterTest
	public void afterTest() {
		Common.End_Report();
		Common.driver_close();
	}
}
