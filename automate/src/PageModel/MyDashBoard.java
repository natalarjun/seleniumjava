package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDashBoard {
	
	WebDriver driver;
	
	public MyDashBoard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/section/div[1]/a/h3")
	WebElement simplan;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div/section/div[1]/a/h3")
	WebElement energyplan;
	
	
	public void SelectPlan(int plantype)
	{
		
		  switch(plantype) { 
		  
		  case 1:
			  simplan.click();
			  break;
		  case 2: 
		  default:
			  // To be implemented //
		  
		  }
		 
	}
	
}
