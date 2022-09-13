package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.JLeadDedupe;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCASA;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadDeposits;
import com.crm.pages.CRMLogin.LoginPage;

public class TC12VerifyJLeadDedupe extends SetUp
{
	public LoginPage login;
	public JNTBLeadCASA casaaccount;
	public JNTBLeadCC CC;
	public JNTBLeadBanca Banca;
	public JLeadDedupe Dedupe;
	
	
  @Test
  public void VerifyJLeadDedupe() throws Exception
  {
	//sheetName from Excel to pass the testdata
		String sheetName = "JLeadDedupe";
		  
		 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
		  if (!(CommonMethods.isTestRunnable("JLeadDedupe",sheetName))) {

				throw new SkipException(
						"Skipping the test JLeadDedupe as the Run mode is NO");  
  }

  
//login to CRM
	login = new LoginPage(driver);
	login.CRMLogin(sheetName);
	
	//Create NTB CC Lead 
	CC = new JNTBLeadCC(driver);
	CC.LeadClick(sheetName);
	CC.CCLeadCategory(sheetName);
	CC.NTBLeadCreationUpperPart(sheetName);
	CC.CCLeadCreation(sheetName);
	//CC.NTBLeadCreationLowerPart(sheetName);
	Dedupe = new JLeadDedupe();
	Dedupe.DedupeLeadCreationLowerPart(sheetName);
	
//	//Logout
//	login.Logout();
//	
//	//login to CRM
//		login = new LoginPage(driver);
//		login.CRMLogin(sheetName);
	
//	Banca = new JNTBLeadBanca(driver);
//		Banca.BancaLeadCategory(sheetName);
//		CC.NTBLeadCreationUpperPart(sheetName);
//		Banca.GrossSalary(sheetName);
//	CC.NTBLeadCreationLowerPart(sheetName);
//	CC.CCAssert(sheetName);
	
//	//Create NTB CC Lead with same credentials   (To be activated entirely(68-72 lines) only these lines in case of new lead creation)
//	Thread.sleep(5000);
//	CC.LeadClick(sheetName);
//	CC.CCLeadCategory(sheetName);
//	CC.NTBLeadCreationUpperPart(sheetName);
//	CC.CCLeadCreation(sheetName);
	
		
		
		
		
//		Banca = new JNTBLeadBanca(driver);
//		Banca.BancaLeadCategory(sheetName);
//		CC.NTBLeadCreationUpperPart(sheetName);
//		Banca.GrossSalary(sheetName);
//	CC.NTBLeadCreationLowerPart(sheetName);
//		casaaccount = new JNTBLeadCASA(driver);
//		casaaccount.CASA(sheetName);
//		CC.NTBLeadCreationUpperPart(sheetName);
//		NTBBanca = new JNTBLeadBanca(driver);
//		NTBBanca.GrossSalary(sheetName);
//		Dedupe = new JLeadDedupe();
	Dedupe.DedupeLeadCreationLowerPart(sheetName);
		
		//Capture Dedupe Message
		
		Dedupe.Dedupemesg(sheetName);
		
		//Click on  Button & check if lead is getting created in dedupe rejected SC
		Dedupe.CreateDedupeLead(sheetName);
		Dedupe.DedupeAssert(sheetName);
		
//		//Check in Views & Click on Lead
//		Dedupe.LeadSearch(sheetName);
}
}
