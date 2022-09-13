package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.JETBLeadCASA;
import com.crm.pages.CRMLogin.JETBLeadDeposits;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCASA;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadDeposits;


public class TC04VerifyJNTBLeadCASA extends SetUp

{
	public LoginPage login;
	public JNTBLeadCASA casaaccount;
	public JNTBLeadCC CC;
	public JNTBLeadDeposits deposits;
	public JNTBLeadBanca NTBBanca;
	public JETBLeadDeposits depo;
	public JETBLeadCASA ETBCASA;
	
	
	@Test
	
	
	public void VerifyCASA() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "JNTBLeadCASA";
	  
	 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
	  if (!(CommonMethods.isTestRunnable("JNTBLeadCASA",sheetName))) {

			throw new SkipException(
					"Skipping the test JNTBLeadCASA as the Run mode is NO");
		}
	   		//login to CRM
				login = new LoginPage(driver);
				login.CRMLogin(sheetName);
				
				//Create NTB CASA Lead 
				CC = new JNTBLeadCC(driver);
				CC.LeadClick(sheetName);
				casaaccount = new JNTBLeadCASA(driver);
				casaaccount.CASA(sheetName);
	  			CC.NTBLeadCreationUpperPart(sheetName);
	  			NTBBanca = new JNTBLeadBanca(driver);
				NTBBanca.GrossSalary(sheetName);
				CC.NTBLeadCreationLowerPart(sheetName);
				CC.CCAssert(sheetName);
			
				
				//Moving lead in Appointment Fixed  & Qualified SC
				CC.LeadSearch(sheetName);
				CC.LeadAppointmentFixed(sheetName);
				CC.CCAssert(sheetName);
				CC.LeadSearch(sheetName);
				CC.LeadQualifiedUpperPart(sheetName);
				CC.LeadQualifiedLowerPart(sheetName);
				
				//Moving lead to SC=Application Started
				CC.CCAssert(sheetName);
				CC.LeadSearch(sheetName);
				depo= new JETBLeadDeposits(driver);
				depo.ApplicationStarted(sheetName);
				CC.CCAssert(sheetName);
				
				//Moving Lead to SC=Completed
				CC.LeadSearch(sheetName);
				CC.LeadClosure(sheetName);
				casaaccount.LeadTerminated(sheetName);
				CC.CCAssert(sheetName);
				
				//Lead Details Page
				CC.LeadDetails(sheetName);
				casaaccount.LeadTerminatedAssert(sheetName);
	  
	  			
	
	}

}
