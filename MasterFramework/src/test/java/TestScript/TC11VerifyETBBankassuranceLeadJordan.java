package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.ETBBankassuranceJordan;
import ObjectRepository.ETBLoansLeadJordan;

public class TC11VerifyETBBankassuranceLeadJordan extends SetUp

{
	private LoginPage login;
	private ETBBankassuranceJordan Bancassurance;
	@Test
	
	public void ETBLeads() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "ETBBankassuranceJordan";
		
		//To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("ETBBankassuranceJordan")))
		  {

				throw new SkipException(
						"Skipping the test ETBBankassuranceJordan as the Run mode is NO");
			}
		  
		//setUpTest to launch browser
		 setUpTest(sheetName);
		 
		  
		  // login to CRM
		  login = new LoginPage(driver);
		  login.CRMLogin(sheetName);
		  
		  
		  //PersonalLoan = new NTBHLJordan(driver);
		  //PersonalLoan.Loans(sheetName);
		  
		  Bancassurance = new ETBBankassuranceJordan(driver);
		  Bancassurance.ETBBanca(sheetName);
		  
	}
	
	
	

}
