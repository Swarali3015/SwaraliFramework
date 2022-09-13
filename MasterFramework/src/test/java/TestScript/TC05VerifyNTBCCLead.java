package TestScript;

import CommonUtility.SetUp;
import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;

import ObjectRepository.LoginPage;
import ObjectRepository.NTBCCLeads;


public class TC05VerifyNTBCCLead extends SetUp


{
	public LoginPage login;
	public NTBCCLeads cc;
	@Test
	
	
	public void NTBLeads() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "NTBCC";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("NTBCC")))
				  {

						throw new SkipException(
								"Skipping the test NTBCC as the Run mode is NO");
					}
				  
				//setUpTest to launch browser
				 setUpTest(sheetName);
				 
				  
				  // login to CRM
				  login = new LoginPage(driver);
				  login.CRMLogin(sheetName);
				  
				  //deposits = new DepositsLeadCreation(driver);
				 //deposits.Deposits(sheetName);
				  
				  cc = new NTBCCLeads(driver);
				  cc.CreditCards(sheetName);
	}
}

