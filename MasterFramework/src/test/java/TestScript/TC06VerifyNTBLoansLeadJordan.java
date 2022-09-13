package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.NTBHLJordan;

public class TC06VerifyNTBLoansLeadJordan extends SetUp

{
	public LoginPage login;
	public NTBHLJordan PersonalLoan;
	@Test

	public void NTBLeads() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "NTBPL";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("NTBPL")))
				  {

						throw new SkipException(
								"Skipping the test NTBPL as the Run mode is NO");
					}
				  
				//setUpTest to launch browser
				 setUpTest(sheetName);
				 
				  
				  // login to CRM
				  login = new LoginPage(driver);
				  login.CRMLogin(sheetName);
				  
				  //cc = new NTBCCLeads(driver);
				  //cc.CreditCards(sheetName);
				  
				  PersonalLoan = new NTBHLJordan(driver);
				  PersonalLoan.Loans(sheetName);
	
	
	

	
}
}
