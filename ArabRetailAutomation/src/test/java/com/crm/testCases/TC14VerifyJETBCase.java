package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBCase;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.JNTBCase;
import com.crm.pages.CRMLogin.LoginPage;

public class TC14VerifyJETBCase extends SetUp
{
	public LoginPage login;
	public JETBLeadBanca ETBBanca;
	public JETBCase ETBCase;
	public JNTBCase NTBCase;
	
  @Test
  public void VerifyJETBCase() throws Exception
  {
	//sheetName from Excel to pass the testdata
			String sheetName = "JETBCase";
			  
			 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
			  if (!(CommonMethods.isTestRunnable("JETBCase",sheetName))) 
			  {

					throw new SkipException(
							"Skipping the test JETBCase as the Run mode is NO");
				}
			   		//login to CRM
						login = new LoginPage(driver);
						login.CRMLogin(sheetName);
						
						//Search the Customer & go to Customer Card View
						ETBBanca = new JETBLeadBanca(driver);
						ETBBanca.LeadSearch(sheetName);
						
						//Create ETB Case
						ETBCase = new JETBCase();
						ETBCase.ETBCaseClick(sheetName);
						
						//Selecting Case Category, Case SubCategory & Case Sub-Sub Category
						NTBCase=new JNTBCase();
						NTBCase.CaseCategories(sheetName);
						ETBCase.ETBNextPageCaseCreation(sheetName);
						
						//Select Channel
						NTBCase.CaseChannel(sheetName);
						
						//Select Priority & Source
						NTBCase.CasePrioritySource(sheetName);
						
						//Enter Comments
						NTBCase.CaseComments(sheetName);
						
						//AssignTo Field
						Thread.sleep(2000);
						ETBCase.ETBAssignTo(sheetName);
						
						//Save details & create ETB Case in SC=In Progress
						Thread.sleep(3000);
						NTBCase.CaseSaveProceed(sheetName);
						NTBCase.CInProgressSCAssert(sheetName);
						
						//Edit lead & change SC=Closed
//						Thread.sleep(5000);
						NTBCase.CaseEditbutton(sheetName);
//						Thread.sleep(5000);
						NTBCase.CaseClosedSC(sheetName);
//						Thread.sleep(5000);
						NTBCase.CaseSaveProceed(sheetName);
						NTBCase.CClosedSCAssert(sheetName);
						
						//Toggle to Case Details Page
						NTBCase.CaseDetailsPage(sheetName);
						NTBCase.CaseFinalStageAssert(sheetName);
						
						
						
	  
  }
}
