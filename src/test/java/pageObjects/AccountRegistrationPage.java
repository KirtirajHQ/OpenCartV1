package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	//Constructor
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
	}
	
	//Locators

	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_confpassword;
	
	@FindBy(xpath="//label[normalize-space()='No']")
	WebElement rad_subscribe;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	WebElement chk_agree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement confmsg;
	
	
	
	//Action Methods
	public void setFirstName(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setTelephone(String telephone)
	{
		txt_telephone.sendKeys(telephone);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void setConfPassword(String pwd)
	{
		txt_confpassword.sendKeys(pwd);
	}
	
	public void clickSubsBtn()
	{
		rad_subscribe.click();
	}
	
	public void clkAgreeChkbox()
	{
		chk_agree.click();
	}
	
	public void clkContinueBtn()
	{
		btn_continue.click();
	}
	
	public String getconfirmationmsg()
	{
		try {
			return(confmsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
		

	}
	
}
