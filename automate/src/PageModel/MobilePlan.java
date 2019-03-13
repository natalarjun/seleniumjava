package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePlan {
	
	WebDriver driver;
	
	public MobilePlan(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/main/div/div/div/article/div/div/div[20]/section/div/div[2]/div[2]/div[2]/article[1]/div[2]/p[1]/a")
	WebElement _1GData;
	
	@FindBy(xpath="//*[@id=\"basic-plan-as-you-go--2\"]/a")
	WebElement _AsUGo;
	
	@FindBy(xpath="/html/body/div[2]/div/main/div/div/div/article/div/div/div[20]/section/div/div[2]/div[3]/article/details/div[2]/p[4]/a")
	WebElement _AsUGoBuy;
	
	
	public void ClickChosenPlan(int plantype) {
		
		switch(plantype)
		{
		case 1:_1GData.click();
		        break;
		case 2: _AsUGo.click();
		        _AsUGoBuy.click();
		        break;
		}
		
	}
	

}
