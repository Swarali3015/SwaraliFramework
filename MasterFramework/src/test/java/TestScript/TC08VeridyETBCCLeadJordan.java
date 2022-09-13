package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.ETBCCLeadJordan;
import ObjectRepository.LoginPage;

public class TC08VeridyETBCCLeadJordan extends SetUp 

{

		public LoginPage login;
		public ETBCCLeadJordan CC;
		@Test
		
		
		public void ETBCC() throws Exception
		{
			//sheetName from Excel to pass the testdata
					String sheetName = "ETBCC";
					
					//To check  testcase runmode from excel (Yes/No)
					  if (!(CommonMethods.isTestRunnable("ETBCC")))
					  {

							throw new SkipException(
									"Skipping the test ETBCC as the Run mode is NO");
						}
					  
					//setUpTest to launch browser
					 setUpTest(sheetName);
					 
					  
					  // login to CRM
					  login = new LoginPage(driver);
					  login.CRMLogin(sheetName);
					  
					  
					  CC = new ETBCCLeadJordan(driver);
					  CC.ETBCC(sheetName);
					  
	}

}
