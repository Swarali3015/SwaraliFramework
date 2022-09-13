package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;

public class TC02VerifyJNTBLeadBanca extends SetUp

{

	public LoginPage login;
	public JNTBLeadCC CC;
	public JNTBLeadBanca Banca;
	@Test
	
	
	public void VerifyCRMLogin() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "JNTBLeadBanca";
	  
	 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
	  if (!(CommonMethods.isTestRunnable("JNTBLeadBanca",sheetName))) {

			throw new SkipException(
					"Skipping the test JNTBLeadBanca as the Run mode is NO");
		}
	   		//login to CRM
				login = new LoginPage(driver);
				login.CRMLogin(sheetName);
				
				
	
	  		//Create NTB Bancassurance Lead in Jordan
				
				CC = new JNTBLeadCC(driver);
//				CC.LeadClick(sheetName);
	  
	  			Banca = new JNTBLeadBanca(driver);
	  			Banca.LeadClickBanca(sheetName);
	  			Banca.BancaNEwPath(sheetName);
	  			Banca.BancaLeadCategory(sheetName);
	  			CC.NTBLeadCreationUpperPart(sheetName);
	  			Banca.GrossSalary(sheetName);
	  			CC.NTBLeadCreationLowerPart(sheetName);
	  			login.Logout();
	  			
	  			
	  			CC.GetloginDetails(sheetName);
	  			
	  			
	  			//CC.CCAssert(sheetName);
	  			
	  			
	  	//Moving lead in Appointment Fixed  & Qualified SC
//	  			CC.LeadClick(sheetName);
	  			Banca.LeadClickBanca(sheetName);
				//CC.LeadSearch(sheetName);
	  			Banca.LSBanca(sheetName);
				CC.LeadAppointmentFixed(sheetName);
				//CC.CCAssert(sheetName);
//				CC.LeadSearch(sheetName);
				Banca.LeadSearchApptFixed(sheetName);
				CC.LeadQualifiedUpperPart(sheetName);
				CC.LeadQualifiedLowerPart(sheetName);
				
		//Moving lead to SC=Application Started
				//CC.CCAssert(sheetName);
//				CC.LeadSearch(sheetName);
//				CC.LeadClick(sheetName);
//				Banca.LeadClickBanca(sheetName);
				Banca.LeadSearchQualified(sheetName);
				Banca.BancaLeadFulfillment(sheetName);
				
		//Moving lead to SC=CLosure		
//				CC.LeadSearch(sheetName);
//				CC.LeadClick(sheetName);
//				Banca.LeadClickBanca(sheetName);
	//			Banca.LeadSearchQualified(sheetName);
//				Banca.LeadSearchApptFixed(sheetName);
				Banca.LeadSearchAS(sheetName);
				CC.LeadClosure(sheetName);
				CC.LeadDropped(sheetName);
				
		//Lead Details Page
				CC.LeadDetails(sheetName);
				Banca.LeadDroppedAssert(sheetName);
	  			
	}
	  
}
