package cucumbersteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MyAccountLoginSteps;
import steps.RegisterLinkSteps;

public class RegistrationProcess {

	@Steps
	MyAccountLoginSteps MYA;
	@Steps
    RegisterLinkSteps RL;

	
	@Then("^user fills the registration form and clicks on register$")
    public void user_fills_the_registration_form_and_clicks_on_register() throws Throwable {
		RL.RegistrationDetails();
      
    }

	
	
}
