package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By _username = By.name("username");
	By _password = By.name("password");
	By _loginbtn = By.name("button");

	
	
	public void userlogin(String email, String pass) {
		
		driver.findElement(_username).sendKeys(email);
		driver.findElement(_password).sendKeys(pass);
		driver.findElement(_loginbtn).click();
	}
	
	
}
