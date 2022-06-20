package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.Common;

public class LoginPage {
	
	public static WebDriver driver = Common.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static String Authorized_HomePage_Title = "Nike. Just Do It. Nike IN";
	
		public static void LoginHomePage_Wait() {
			wait.until(ExpectedConditions.visibilityOf(LoginPage.SignInBtn(driver)));
		}
	
		public static WebElement LoginBtn(WebDriver driver) {
			return driver.findElement(By.xpath("//form/div[6]/input"));
		}
		public static void loginBtn_Click() {
			LoginPage.LoginBtn(driver).click();
		}
		
		public static WebElement SignInBtn(WebDriver driver) {
			return driver.findElement(By.xpath("//div[@class='d-lg-flx']/div/button"));
		}
		public static void SingInBtn_Click() {
			wait.until(ExpectedConditions.elementToBeClickable(LoginPage.SignInBtn(driver)));
			LoginPage.SignInBtn(driver).click();
		}
		
		public static String assertt() {
			return driver.getTitle();
		}
		
		public static WebElement Username(WebDriver driver) {
			return driver.findElement(By.xpath("//form/div[2]/input"));
		}
		
		public static WebElement Password(WebDriver driver) {
			return driver.findElement(By.xpath("//form/div[3]/input"));
		}
		
		public static void Login_Cred(String username,String password) {
			LoginPage.Username(driver).sendKeys(username);
			LoginPage.Password(driver).sendKeys(password);
		}
		
		public static List<WebElement> NavBar_list() {
			return driver.findElements(By.xpath("//ul[@class='pre-desktop-menu']/li"));
		}
		
		public static void NavBar_Moveto_Action() {
			Actions action = new Actions(driver);
			for (WebElement i : LoginPage.NavBar_list()) {
				action.moveToElement(i).build().perform();
			}
		}
}

