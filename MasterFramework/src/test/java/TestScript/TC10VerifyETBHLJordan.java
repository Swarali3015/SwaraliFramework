package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.ETBLoansLeadJordan;
import ObjectRepository.LoginPage;
import ObjectRepository.NTBHLJordan;
import ObjectRepository.LoginPage;

public class TC10VerifyETBHLJordan extends SetUp

{
	public LoginPage login;
	public ETBLoansLeadJordan HL;
	@Test
	


public void NTBLeads() throws Exception
{
	//sheetName from Excel to pass the testdata
			String sheetName = "ETBLoans";
			
			//To check  testcase runmode from excel (Yes/No)
			  if (!(CommonMethods.isTestRunnable("ETBLoans")))
			  {

					throw new SkipException(
							"Skipping the test ETBLoans as the Run mode is NO");
				}
			  
			//setUpTest to launch browser
			 setUpTest(sheetName);
			 
			  
			  // login to CRM
			  login = new LoginPage(driver);
			  login.CRMLogin(sheetName);
			  
			  
			  //PersonalLoan = new NTBHLJordan(driver);
			  //PersonalLoan.Loans(sheetName);
			  
			  HL = new ETBLoansLeadJordan(driver);
			  HL.ETBLoans(sheetName);
}  
}
