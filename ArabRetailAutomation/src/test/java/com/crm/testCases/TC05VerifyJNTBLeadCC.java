package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.LoginPage;

public class TC05VerifyJNTBLeadCC extends SetUp
{
	public LoginPage login;
	public JNTBLeadCC CC;
	public JNTBLeadBanca Banca;
	@Test
	
	public void JNTBLeadCC() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "JNTBLeadCC";
	  
	 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
	  if (!(CommonMethods.isTestRunnable("JNTBLeadCC",sheetName))) {

			throw new SkipException(
					"Skipping the test JNTBLeadCC as the Run mode is NO");
		}
	   		//login to CRM
				login = new LoginPage(driver);
				login.CRMLogin(sheetName);
				
				//Clicking on profile button to see the user
				CC = new JNTBLeadCC(driver);
				CC.Profilebutton();
				
	
				
				//Create NTB CC Lead in Jordan
				
				//CC = new JNTBLeadCC(driver);
				CC.LeadClick(sheetName);
				CC.CCLeadCategory(sheetName);
				CC.NTBLeadCreationUpperPart(sheetName);
				CC.CCLeadCreation(sheetName);
				CC.NTBLeadCreationLowerPart(sheetName);
//				login.Logout();
				
				//Checking userassigned
				
//				CC.CCAssert(sheetName);
				
				//Moving lead in Appointment Fixed  & Qualified SC
				CC.LeadSearch(sheetName);
				CC.LeadAppointmentFixed(sheetName);
				CC.CCAssert(sheetName);
				CC.LeadSearch(sheetName);
				CC.LeadQualifiedUpperPart(sheetName);
				CC.CCLeadQualified(sheetName);
				CC.LeadQualifiedLowerPart(sheetName);
				
				//Moving lead to SC=Lead Dropped
				CC.CCAssert(sheetName);
				CC.LeadSearch(sheetName);
				CC.LeadClosure(sheetName);
				CC.LeadDropped(sheetName);
				
				//Opening Lead Details Page
				CC.LeadDetails(sheetName);
				Banca= new JNTBLeadBanca(driver);
				Banca.LeadDroppedAssert(sheetName);
	}
	

}
