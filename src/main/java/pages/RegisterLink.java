package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class RegisterLink extends BasePage{

	
	String RegisterLink = "css=button[id='requestRegisterFormButton']";
	String Email="id=registration-form-email";
	String Password="id=registration-form-password";
	String FirstName="id=registration-form-fname";
	String LastName="id=registration-form-lname";
	String PhoneNumber="id=registration-form-phone";
	String Button="xpath=/html/body/div[1]/div[6]/div[3]/div/div/div[2]/div/form/div[7]/button";
	
	
	public void Register() {
		
		click(RegisterLink);
	}
	
	public void RegistrationForm() throws InterruptedException {
		type(Email,"test123@gmail.com");
		type(Password,"test1234");
		type(FirstName,"test");
		type(LastName,"testing122");
		type(PhoneNumber,"31687878655");
		click(Button);
		Thread.sleep(5000);
	}
	
	
}
