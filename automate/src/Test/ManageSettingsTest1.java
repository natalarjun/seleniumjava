package Test;
import PageModel.Homepage;
import PageModel.LoginPage;
import PageModel.MobilePlan;
import PageModel.MyAmaysim;
import PageModel.MyDashBoard;
import PageModel.PaymentMethod;
import PageModel.PlanPayment;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class ManageSettingsTest1 {
	 
  WebDriver driver = new ChromeDriver();
	 
	 
  @Test
  public void loginSuccessulTest()  {	  
        
        Homepage home = new Homepage(driver);
        home.LoadLogInPage();
        LoginPage login = new LoginPage(driver);   
        login.userlogin("0468340754", "theHoff34");
        MyAmaysim amaysim = new MyAmaysim(driver);
        String dashboardtext = amaysim.GetDashboardText();
        String ExpectedMessage = "My Dashboard";
        Assert.assertEquals(ExpectedMessage.toUpperCase(), dashboardtext.toUpperCase());
  }
  
  @Test
  public void VerifyPaymentMethodSettings()  {	  
        
        Homepage home = new Homepage(driver);
        home.LoadLogInPage();
        LoginPage login = new LoginPage(driver);   
        login.userlogin("0468340754", "theHoff34");
        MyAmaysim amaysim = new MyAmaysim(driver);
        amaysim.ClickPaymentSettings();
        PaymentMethod paymethod = new PaymentMethod(driver);
        String actualPaymentMethodtxt = paymethod.GetPaymentMethod();
        Assert.assertEquals("payment method", actualPaymentMethodtxt.toLowerCase());
  }
  
  @Test
  public void VerifyPersonalDetailsSettings()  {	  
        
        Homepage home = new Homepage(driver);
        home.LoadLogInPage();
        LoginPage login = new LoginPage(driver);   
        login.userlogin("0468340754", "theHoff34");
        MyAmaysim amaysim = new MyAmaysim(driver);
        amaysim.ClickCustDetais();
        PaymentMethod paymethod = new PaymentMethod(driver);
        String actualPesonalDetailtxt = paymethod.GetPersonalDetail();
        Assert.assertEquals("personal info", actualPesonalDetailtxt.toLowerCase());
  }
  
  @Test
  public void AddNewService()
  {
	  
	  Homepage home = new Homepage(driver);
      home.LoadLogInPage();
      LoginPage login = new LoginPage(driver);   
      login.userlogin("0468340754", "theHoff34");
      MyAmaysim amaysim = new MyAmaysim(driver);
      amaysim.ClickDashBoard();
      
      MyDashBoard dashboard = new MyDashBoard(driver);   
      dashboard.SelectPlan(1);
      MobilePlan chooseplan = new MobilePlan(driver);
      chooseplan.ClickChosenPlan(2);
      
      PlanPayment payplan = new PlanPayment(driver);
      payplan.SelectGetNewNumber();
      payplan.CustomerDetail();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      payplan.PaymentDetail();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      payplan.TermsConChk(); 
	  
      payplan.OrderSubmit();
	  payplan.InputCardDetails("4111111111111111", "0120", "111");
	  
	  //Assertion to be implemented here

  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\arjunn\\eclipse-workspace\\automate\\External\\chromedriver.exe");
     
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("https://www.amaysim.com.au/");
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
	  
  }

}
