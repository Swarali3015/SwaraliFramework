package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.LeadDedupe;

public class TC12VerifyLeadDedupeCreation extends SetUp

{
	
	public LoginPage login;
	public LeadDedupe newLeads;
	@Test 
	
	
	public void lead() throws Exception
	{

		//sheetName from Excel to pass the testdata
		String sheetName = "LeadDedupe";
		
		//To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("LeadDedupe")))
		  {

				throw new SkipException(
						"Skipping the test LeadDedupe as the Run mode is NO");
			}
		   
		   		//setUpTest to launch browser
					setUpTest(sheetName);
					
					
					//login to CRM
					login = new LoginPage(driver);
					login.CRMLogin(sheetName);
					
					
					newLeads = new LeadDedupe(driver);
					newLeads.Leads(sheetName);
					
					
	}

}
