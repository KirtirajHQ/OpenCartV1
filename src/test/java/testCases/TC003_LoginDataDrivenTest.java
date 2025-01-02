package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC003_LoginDataDrivenTest extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class, groups="DataDriven")
	public void logintest(String email, String pwd, String exp_result)
	{
		logger.info("*****Starting TC003_LoginDataDrivenTest*****");
		//HomePage
		try
		{
		HomePage hp=new HomePage(driver);
		hp.act_btn();
		hp.click_login();
		
		//LoginPage
		LoginPage lp=new LoginPage(driver);
		lp.set_email(email);
		lp.set_pwd(pwd);
		lp.click_login();
		
		//MyAccountPage
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		
		if(exp_result.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				macc.click_logout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp_result.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				macc.click_logout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***Finished TC003_LoginDataDrivernTest*****");
		
	}

}	


