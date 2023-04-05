package Stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sep_batch_finalproject.module.LoginModule;
import sep_batch_finalproject.pageobject.LoginPageObject;

public class StefAmazonLogin {
	
	LoginModule login = new LoginModule();
	
	@Given("User open Amazon site")
	public void user_open_google_site() {
	    login.OpenLink();
	}
	@When("User open login page")
	public void user_open_login_page() {
		login.OpenLoginPage();
	    
	}
	@Then("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		login.login(username, password);
	    
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
		login.User_click_on_login_button();
	   
	}
	@Then("User Validate homepage")
	public void user_validate_homepage() {
		login.ValidateHomePage();
	    
	}

	@When("User open login page1")
	public void user_open_login_page1() {
		login.OpenLoginPage();
    
	}
	@Then("User enter invalid {string} and valid {string}")
	public void user_enters_invalid_and_valid(String username, String password) {
		login.login_without_username(username, password);
	    
	}
	@Then("User should see an error message indicating that {string}")
	public void user_should_see_an_error_message_indicating_that(String string) {
	//    login.
	}
	

	@Then("User enter valid {string} and invalid {string}")
	public void user_enters_valid_and_invalid(String username, String password) {
		login.login_without_password(username, password);
	    
	}


	@Then("User enter username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		login.login_without_credential(username, password);
	    
	}
	@Then("User should see an error message indicating that {string} and {string}.both username and password are required")
	public void user_should_see_an_error_message_indicating_that_and_both_username_and_password_are_required(String username, String password) {
		login.notify();
	    
	}


	

	@Given("User open amazon site")
	public void user_open_amazon_site() {
		login.OpenLink();
	    
	}
	@When("the user open login page")
	public void the_user_open_login_page() {
		login.OpenLoginPage();
	    
	}
	@When("the user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		//login.
		
	}
	    
	@When("the user enters their email address associated with their account")
	public void the_user_enters_their_email_address_associated_with_their_account() {
		login.login_forgotpassword();
		
	
	}
	@When("the user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String forgotaPassword) {
		LoginPageObject.getBtn_login();
	    
	}





}
