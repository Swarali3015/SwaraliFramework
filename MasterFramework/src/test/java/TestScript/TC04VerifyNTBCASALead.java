package TestScript;

import CommonUtility.SetUp;
import org.testng.SkipException;
import org.testng.annotations.Test;
import CommonUtility.CommonMethods;
import ObjectRepository.LoginPage;
import ObjectRepository.NTBCASAJordanSCTerminated;

public class TC04VerifyNTBCASALead extends SetUp
{
	public LoginPage login;
	public NTBCASAJordanSCTerminated casa;
	
	@Test
	
	
	public void NTBDeposits() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "NTBCASA";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("NTBCASA")))
				  {

						throw new SkipException(
								"Skipping the test NTBCASA as the Run mode is NO");
					}
				  
				//setUpTest to launch browser
				 setUpTest(sheetName);
				 
				  
				  // login to CRM
				  login = new LoginPage(driver);
				  login.CRMLogin(sheetName);
				  
				  //deposits = new DepositsLeadCreation(driver);
				 //deposits.Deposits(sheetName);
				  
				  casa = new NTBCASAJordanSCTerminated(driver);
				  casa.Casa(sheetName);
				  
				  
	}

}




