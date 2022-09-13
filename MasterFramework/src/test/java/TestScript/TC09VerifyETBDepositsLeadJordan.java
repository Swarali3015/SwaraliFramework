package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.DepositsLeadCreation;
import ObjectRepository.ETBDepositsLeadJordan;
import ObjectRepository.LoginPage;

public class TC09VerifyETBDepositsLeadJordan extends SetUp
{
	public LoginPage login;
	public ETBDepositsLeadJordan deposits;
	@Test
	
	
	public void ETBDeposits() throws Exception
	{
		
		//sheetName from Excel to pass the testdata
		String sheetName = "ETBDeposits";
		
		//To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("ETBDeposits")))
		  {

				throw new SkipException(
						"Skipping the test ETBDeposits as the Run mode is NO");
			}
		  
		//setUpTest to launch browser
		 setUpTest(sheetName);
		 
		  
		  // login to CRM
		  login = new LoginPage(driver);
		  login.CRMLogin(sheetName);
		  
		  //deposits = new DepositsLeadCreation(driver);
		  //deposits.Deposits(sheetName);
		  
		  deposits = new ETBDepositsLeadJordan(driver);
		  deposits.ETBDeposits(sheetName);
	}
}
