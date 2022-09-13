package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JNTBCase;
import com.crm.pages.CRMLogin.LoginPage;

public class TC13VerifyJNTBCase extends SetUp
{

	public LoginPage login;
	public JNTBCase NTBCase;
	
  @Test
  public void VerifyJNTBCase() throws Exception
  
  {
	//sheetName from Excel to pass the testdata
		String sheetName = "JNTBCase";
		  
		 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
		  if (!(CommonMethods.isTestRunnable("JNTBCase",sheetName))) 
		  {

				throw new SkipException(
						"Skipping the test JNTBCase as the Run mode is NO");
			}
		   		//login to CRM
					login = new LoginPage(driver);
					login.CRMLogin(sheetName);
					
					// Open Case
					NTBCase = new JNTBCase();
					NTBCase.CaseClick(sheetName);
					
					//Selecting Case Category, Case SubCategory & Case Sub-Sub Category
					NTBCase.CaseCategories(sheetName);
					
					//Enter Name & Mobile No
					NTBCase.CaseNameMobile(sheetName);
					
					//Select Channel
					NTBCase.CaseChannel(sheetName);
					
					//Select Priority & Source
					NTBCase.CasePrioritySource(sheetName);
					
					//Enter Comments
					NTBCase.CaseComments(sheetName);
					
					//Save details & create NTB Case in Sc=New
					NTBCase.CaseSaveProceed(sheetName);
					NTBCase.CNewSCAssert(sheetName);
					
					//Edit lead & change SC=Processing
					
					NTBCase.CaseEditbutton(sheetName);
//					Thread.sleep(5000);
					NTBCase.CaseProcessingSC(sheetName);
//					Thread.sleep(5000);
					NTBCase.CaseSaveProceed(sheetName);
					NTBCase.CInProgressSCAssert(sheetName);
					
					//Edit lead & change SC=Closed
//					Thread.sleep(5000);
					NTBCase.CaseEditbutton(sheetName);
//					Thread.sleep(5000);
					NTBCase.CaseClosedSC(sheetName);
//					Thread.sleep(5000);
					NTBCase.CaseSaveProceed(sheetName);
					NTBCase.CClosedSCAssert(sheetName);
					
					//Toggle to Case Details Page
					NTBCase.CaseDetailsPage(sheetName);
					NTBCase.CaseFinalStageAssert(sheetName);
  }
}
