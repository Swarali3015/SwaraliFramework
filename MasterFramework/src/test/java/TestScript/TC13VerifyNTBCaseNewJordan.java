package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.LoginPage;
import ObjectRepository.NTBCaseNewJordan;

public class TC13VerifyNTBCaseNewJordan extends SetUp

{
	public LoginPage login;
	public NTBCaseNewJordan New;
	@Test
	
	
	public void Case() throws Exception
	
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "NTBCaseNewSC";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("NTBCaseNewSC")))
				  {

						throw new SkipException(
								"Skipping the test NTBCaseNewSC as the Run mode is NO");
					}
				   
				   		//setUpTest to launch browser
							setUpTest(sheetName);
							
							
							//login to CRM
							login = new LoginPage(driver);
							login.CRMLogin(sheetName);
							
							
							//newLeads = new LeadDedupe(driver);
							//newLeads.Leads(sheetName);
							
							New = new NTBCaseNewJordan(driver);
							New.NTBCaseNew(sheetName);
							
	}

}
