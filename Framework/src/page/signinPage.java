package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinPage {
	
	private WebDriver driver;
	
	private WebElement email;
	
	private WebElement password;
	
	private WebElement signinButton;
	
	
	public signinPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void signin(String email,String password) {
		
		this.email = this.driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		
		this.email.sendKeys(email);
		
		this.password = this.driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		
		this.password.sendKeys(password);
		
		this.signinButton = this.driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		
		this.signinButton.click();
	}

}
