package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod {

WebDriver driver;
	
	public PaymentMethod(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"current_payment_method\"]/div[1]/div[1]/h1")
	WebElement paymentmethodtext;
	
	@FindBy(xpath="//*[@id=\"personal_info_block\"]/div/div[1]/div/h2")
	WebElement personaldetailtxt;
	
	
	public String GetPaymentMethod() {
		return paymentmethodtext.getText();
	}
	
	public String GetPersonalDetail() {
		return personaldetailtxt.getText();
	}
	
}
