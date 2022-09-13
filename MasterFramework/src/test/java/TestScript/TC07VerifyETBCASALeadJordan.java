package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.ETBCASALeadJordan;
import ObjectRepository.LoginPage;

public class TC07VerifyETBCASALeadJordan extends SetUp

{
	public LoginPage login;
	public ETBCASALeadJordan CASA;
	@Test
	
	public void NTBDeposits() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "ETBCASA";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("ETBCASA")))
				  {

						throw new SkipException(
								"Skipping the test ETBCASA as the Run mode is NO");
					}
				  
				//setUpTest to launch browser
				 setUpTest(sheetName);
				 
				  
				  // login to CRM
				  login = new LoginPage(driver);
				  login.CRMLogin(sheetName);
				  
				  
				  //casa = new NTBCASAJordanSCTerminated(driver);
				  //casa.Casa(sheetName);
				  
				  
				  CASA = new ETBCASALeadJordan(driver);
				  CASA.ETBCASA(sheetName);
				  
}
}
