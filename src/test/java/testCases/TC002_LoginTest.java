package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest  extends BaseClass
{
	@Test(groups={"Regression","Master"})
	public void logintest()
	{
		logger.info("*****Starting TC002_LoginTest*****");
		//HomePage
		try
		{
		HomePage hp=new HomePage(driver);
		hp.act_btn();
		hp.click_login();
		
		//LoginPage
		LoginPage lp=new LoginPage(driver);
		lp.set_email(p.getProperty("email"));
		lp.set_pwd(p.getProperty("password"));
		lp.click_login();
		
		//MyAccountPage
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("*****Finished TC002_LoginTest*****");
		
		
		
	}

}
