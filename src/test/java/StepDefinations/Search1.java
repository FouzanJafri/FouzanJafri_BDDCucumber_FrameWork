package StepDefinations;

import java.io.IOException;

import Pages.HomePage;
import Utility.ReadProp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search1 {
	
	@Given("user on Home page")
	public void user_on_home_page() {
		System.out.println(HomePage.assertt());
	}

	@Given("user should click on Search input feild")
	public void user_should_click_on_search_input_feild() {
		HomePage.SearchFeild_Click();
	}

	@When("user can enter Product you want to search")
	public void user_can_enter_product_you_want_to_search() throws IOException {
		HomePage.SearchFeild_Input(ReadProp.ProductName());
	}

	@When("user clicks on Search button")
	public void user_clicks_on_search_button() {
		HomePage.SearchBtn_Click();
	}

	@Then("user must see desired product")
	public void user_must_see_desired_product() {
		System.out.println(HomePage.assertt());
	}


}
