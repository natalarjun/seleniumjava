package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
	
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"block-useraccountmenu\"]/ul/li[3]/a/span")
	WebElement _login;
	
	
   // By _login = By.xpath("//*[@id=\"block-useraccountmenu\"]/ul/li[3]/a/span");
	
	public void LoadLogInPage(){
		
		// driver.get("https://www.amaysim.com.au/");
		System.out.print("Click Login");
		_login.click();
	}
	
}
