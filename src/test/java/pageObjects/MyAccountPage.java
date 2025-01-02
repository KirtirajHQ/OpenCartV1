package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement myaccountheading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement btn_logout;
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return (myaccountheading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void click_logout()
	{
		btn_logout.click();
	}
	
	

	

}
