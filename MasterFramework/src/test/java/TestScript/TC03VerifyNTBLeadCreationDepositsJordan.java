package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
//import ObjectRepository.NewLeadsinNewSC;
import ObjectRepository.DepositsLeadCreation;



public class TC03VerifyNTBLeadCreationDepositsJordan extends SetUp
{

	public LoginPage login;
	public DepositsLeadCreation deposits;
	@Test
	
	
	public void NTBDeposits() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "NTBDeposits";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("NTBDeposits")))
				  {

						throw new SkipException(
								"Skipping the test NTBDeposits as the Run mode is NO");
					}
				  
				//setUpTest to launch browser
				 setUpTest(sheetName);
				 
				  
				  // login to CRM
				  login = new LoginPage(driver);
				  login.CRMLogin(sheetName);
				  
				  deposits = new DepositsLeadCreation(driver);
				  deposits.Deposits(sheetName);
				  
				  
	}

}
