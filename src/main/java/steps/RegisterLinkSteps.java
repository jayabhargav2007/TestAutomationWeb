package steps;

import net.thucydides.core.annotations.Step;
import pages.RegisterLink;

public class RegisterLinkSteps  {
	RegisterLink RegistrationLink;

	@Step("Clicking on Register Link")
	public void Register() {

		RegistrationLink.Register();
		return;

	}

	@Step("Entering Registration details")
	public void RegistrationDetails() throws InterruptedException {

		RegistrationLink.RegistrationForm();
		return;

	}

	

}