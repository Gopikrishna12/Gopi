package test;



import org.openqa.selenium.WebDriver;

import page.homePage;
import page.setUP;
import page.signinPage;

public class testCase1 {
	
	
	
	

	public static void main(String[] args) {
		
		
		setUP su = new setUP();
		
		su.setDriver();
		
		su.openURL("https://www.amazon.com/");
		
		
		
		homePage hp = new homePage(su.getDriver());
		
		hp.clickSignin();
		
		signinPage sp = new signinPage(su.getDriver());
		
		sp.signin("test@test.com", "test");
		
		
		
		
		
		
		
		

	}

}
