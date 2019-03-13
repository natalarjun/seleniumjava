package PageModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlanPayment {

   WebDriver driver;
	
	public PlanPayment(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"msn-section\"]/div[2]/div/label[2]/span")
	WebElement getnewnumber;
	
	@FindBy(id="step-plan")
	WebElement CustDetailsbtn;
	
	/*
	 * @FindBy(id="step-address") WebElement PaymentDetailsbtn;
	 */
	
	@FindBy(id="t_and_c_check")
	WebElement termsChkBox;
	
	@FindBy(id="order_submit")
	WebElement ordersubmitbtn;
	
	
	@FindBy(id="credit_card_card_number")
	WebElement cardnumbertxt;
	
	@FindBy(xpath="//*[@id=\"credit_card_expiry\"]")
	WebElement expirydatetxt;
	
	@FindBy(id="credit_card_card_security_code")
	WebElement securitycode;
	
	@FindBy(id="button_text")
	WebElement completeOrderbtn;
	
	@FindBy(xpath="//*[@id=\"order-transaction-address-form\"]/div/div/div[6]/div[2]/label/span")
	WebElement BillAddressChk;
	
	
	
	public void InputCardDetails(String cardnum, String date, String cvv)
	{
		cardnumbertxt.sendKeys(cardnum);
		expirydatetxt.sendKeys(date);
		securitycode.sendKeys(cvv);
		completeOrderbtn.click();
	}
	
	public void SelectGetNewNumber()
	{
		getnewnumber.click();
	}
	
	public void CustomerDetail()
	{
		CustDetailsbtn.click();
	}
	
	public void PaymentDetail()
	{
		
		 WebElement PaymentDetailsbtn = driver.findElement(By.id("step-address"));

		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click()", PaymentDetailsbtn);
	}
	
	public void SelectbillAdd() {
		BillAddressChk.click();
	}
	
	
	public void TermsConChk()
	{

		 WebElement termsChkBox = driver.findElement(By.xpath("//*[@id=\"t_c_dummy_form\"]/div[3]/label"));

		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click()", termsChkBox);
		 
		//termsChkBox.click();
	}
	
	public void OrderSubmit()
	{
		ordersubmitbtn.click();
	}
	
	
}
