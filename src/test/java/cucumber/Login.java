package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@When("user navigates to login page")
	public void user_navigates_to_login_page() {
		System.out.println("user on login pag");
	}
	@Given("enters username and password in user details")
	public void enters_username_and_password_in_user_details() {
	    System.out.println("user enters details");
	}

	@Given("clicks on SignIn button")
	public void clicks_on_sign_in_button() {
		 System.out.println("click on sign in");	}

	@Then("sucess message should displayed")
	public void sucess_message_should_displayed() {
		 System.out.println("successful display");
	}


}
