package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage
{
	//Constructor
	public LoginPage(WebDriver driver)
	{
	   super(driver);	
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_login;
	
	//Action Methods
	
	public void set_email(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void set_pwd(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void click_login()
	{
		btn_login.click();;
	}

}
