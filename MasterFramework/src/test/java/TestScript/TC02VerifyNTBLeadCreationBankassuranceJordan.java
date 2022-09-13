package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.NewLeadsinNewSC;




public class TC02VerifyNTBLeadCreationBankassuranceJordan extends SetUp

{

	public LoginPage login;
	public NewLeadsinNewSC newLeads;
	@Test 
	
	
	
	public void NTBBankassuranceJordan() throws Exception
	{

		//sheetName from Excel to pass the testdata
		String sheetName = "NTBBankassuranceJordan";
		
		//To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("NTBBankassuranceJordan")))
		  {

				throw new SkipException(
						"Skipping the test NTBBankassuranceJordan as the Run mode is NO");
			}
		   
		   		//setUpTest to launch browser
					setUpTest(sheetName);
					
					
					//login to CRM
					login = new LoginPage(driver);
					login.CRMLogin(sheetName);
					
					newLeads = new NewLeadsinNewSC(driver);
					newLeads.Leads(sheetName);
					
					

	}

}
