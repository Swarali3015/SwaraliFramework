package TestScript;

import org.testng.SkipException;
import org.testng.annotations.Test;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;
import ObjectRepository.ETBCaseJordan;
import ObjectRepository.LoginPage;

public class TC15VerifyETBCaseJordan extends SetUp

{

	public LoginPage login;
	public ETBCaseJordan ETBCase;
	
	@Test
	
public void Case() throws Exception
	
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "ETBCaseJordan";
				
				//To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("ETBCaseJordan")))
				  {

						throw new SkipException(
								"Skipping the test ETBCaseJordan as the Run mode is NO");
					}
				   
				   		//setUpTest to launch browser
							setUpTest(sheetName);
							
							
							//login to CRM
							login = new LoginPage(driver);
							login.CRMLogin(sheetName);
							
							
							//newLeads = new LeadDedupe(driver);
							//newLeads.Leads(sheetName);
							
							ETBCase = new ETBCaseJordan(driver);
							ETBCase.Case(sheetName);
							
	}						
}


