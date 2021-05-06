package pages;

import base.BasePage;

public class HomePage extends BasePage{
	
	//String newCarMenu = "xpath=//span[@class='margin-right5 top-nav-label-text'][contains(text(),'New Cars')]";
	String myAccountlLogin = "xpath=/html/body/div[1]/header/div[1]/nav/ul/li[2]/div/a";
	
	
	
	public void myAccountlLogin() {
		
		click(myAccountlLogin);
	}
}
