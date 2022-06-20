package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePage.Common;

public class HomePage {
	public static WebDriver driver = Common.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	

	public static WebElement SearchBtn(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='pre-search-contain']/div/button[2]"));
	}
	public static void SearchBtn_Click() {
		HomePage.SearchBtn(driver).click();
	}
	public static WebElement SearcheFeild(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='pre-search-contain']/div/input"));
	}
	public static void SearchFeild_Input(String input) {
		HomePage.SearcheFeild(driver).sendKeys(input);
	}
	public static void SearchFeild_Click() {
		HomePage.SearcheFeild(driver).click();
		
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
	public static WebElement Footer_Career(WebDriver driver) {
		return driver.findElement(By.xpath("//li/a[contains(text(),'Careers')]"));
	}
	
	public static void FooterCareer_Javascript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		HomePage.Footer_Career(driver).click();
	}

	public static void Alert_Switch() {
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("ok");
		driver.switchTo().alert().dismiss();
	}
	public static void Iframe_Switch() {
		driver.switchTo().frame(4);
		driver.switchTo().frame("nike-unite-session");
	}
}
