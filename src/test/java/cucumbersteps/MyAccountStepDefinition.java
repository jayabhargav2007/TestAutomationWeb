package cucumbersteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MyAccountLoginSteps;
import steps.RegisterLinkSteps;

public class MyAccountStepDefinition {

	@Steps
	MyAccountLoginSteps MYA;
	@Steps
    RegisterLinkSteps RL;

	@Given("^user navigate to the website$")
	public void user_navigate_to_the_website() {
		// Write code here that turns the phrase above into concrete actions
		MYA.navigate();
		System.out.println("User is on website");

	}

	@When("^user clicks on my account link$")
	public void user_clicks_on_my_account_link() {
		// Write code here that turns the phrase above into concrete actions
		
		MYA.MYALogin();
    	
		System.out.println("User is on MYaccount Page");

	}

	@Then("^user should see the login screen$")
	public void user_should_see_the_login_screen() throws InterruptedException {
		//Thread.sleep(5000);
		// Write code here that turns the phrase above into concrete actions
		RL.Register();
		System.out.println("User is navigated successfully MYaccount Page");
	}
}
