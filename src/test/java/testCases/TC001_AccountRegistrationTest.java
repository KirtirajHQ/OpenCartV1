package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass
{
	
	
	@Test(groups={"Sanity","Master"})
	void registertest() throws InterruptedException
	{
		try
		{
		logger.info("****Starting TC001_AccountRegistrationTest......***");
		HomePage hp=new HomePage(driver);
		
		hp.act_btn();
		hp.reg_btn();
		logger.info("Clicked on register link...");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("Entering customer details...");
		regpage.setFirstName(randomeString());
		regpage.setLastName(randomeString());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		String pwd=randomeAlphaNumeric();
		regpage.setPassword(pwd);
		regpage.setConfPassword(pwd);
		regpage.clickSubsBtn();
		regpage.clkAgreeChkbox();
		Thread.sleep(2000);
		regpage.clkContinueBtn();
		
		logger.info("Validating expected message");
		String confmsg=regpage.getconfirmationmsg();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			logger.info("Test Failed");
			logger.debug("debug logs");
			Assert.assertTrue(false);
		}
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****Finished TC001_AccountRegistrationTest......***");
		
	}
	
	
	
	


}
