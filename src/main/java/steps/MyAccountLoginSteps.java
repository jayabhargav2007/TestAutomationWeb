package steps;

import base.BasePage;
import net.thucydides.core.annotations.Step;
import pages.HomePage;


public class MyAccountLoginSteps {
	HomePage home;
	
	@Step("Navigating to Website")
	
	public MyAccountLoginSteps navigate() {
		
		home.open();
		return this;
		
	}
	
	
	@Step("Clicking on MYA Login")
	
	public void MYALogin() {
		
		home.myAccountlLogin();
		
	}

}
