package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setUP {
	
	
	private WebDriver driver;
	
	
	public void setDriver() {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\testadmin\\Desktop\\test\\chromedriver_win32 (1)\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		
		return this.driver;
		
		
	}
	
	public void openURL(String URL) {
		
		this.driver.get(URL);
	}

}
