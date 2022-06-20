package StepDefinations;

import org.testng.Assert;

import BasePage.Common;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1Step {
	@Before
	public void before() {
		System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeStep
	public void Before_step() {
		System.out.println("BeforeStep");
	}
	
	@AfterStep
	public void after_step() {
		System.out.println("AfterStep");
	}
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println(LoginPage.assertt());
	}

	@Given("user click on singIn button is top left corner")
	public void user_click_on_sing_in_button_is_top_left_corner() {
		LoginPage.SingInBtn_Click();
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		LoginPage.Login_Cred(username, password);
	}

	@When("clicks on login")
	public void clicks_on_login() {
		LoginPage.loginBtn_Click();
	}

	@Then("user is naigated to the home page")
	public void user_is_naigated_to_the_home_page() {
		LoginPage.LoginHomePage_Wait();
		Assert.assertEquals(LoginPage.assertt(), LoginPage.Authorized_HomePage_Title);
	}
//	@Then("window should close")
//	public void window_should_close() {
//		Common.driver_close();
//	}

	


}
