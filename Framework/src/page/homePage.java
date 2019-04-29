package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	private WebDriver driver;
	
	private WebElement searchBox ;
	
	private WebElement signinButton;
	
	private WebElement cartButton;
	
	private WebElement searchButton;
	
	public homePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void searchItem(String input) {
		
		this.searchBox = this.driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		this.searchBox.sendKeys(input);
		
		this.searchButton = this.driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		
		this.searchButton.click();
		
	}
	
	public void clickSignin() {
		
		this.signinButton= this.driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
		
		this.signinButton.click();
	}

}
