package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAmaysim {

	WebDriver driver;
	
	public MyAmaysim(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Payment method")
	WebElement paymentmethodsettings;
	
	@FindBy(linkText="Personal details")
	WebElement personaldetailssettings;
	
	//@FindBy(xpath="//*[@id=\"back_to_services\"]/a")
	//WebElement mydashboard;
	
	@FindBy(xpath="//*[@id=\"back_to_services\"]/a")
	WebElement dashboard;
	
	public void ClickDashBoard() {
		dashboard.click();
	}
	public void ClickPaymentSettings() {
		paymentmethodsettings.click();
	}
	public void ClickCustDetais() {
		personaldetailssettings.click();
	}
	
	public String GetDashboardText()
	{
		return dashboard.getText();
	}
	

}
