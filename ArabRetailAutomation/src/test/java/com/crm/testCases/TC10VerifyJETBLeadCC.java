package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.JETBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;

public class TC10VerifyJETBLeadCC extends SetUp
{
	public LoginPage login;
	public JETBLeadBanca ETBBanca;
	public JETBLeadCC ETBCC;
	public JNTBLeadCC CC;
	public JNTBLeadBanca Banca;
	
  @Test
  public void VerifyJETBLeadCC() throws Exception
  {
	//sheetName from Excel to pass the testdata
		String sheetName = "JETBLeadCC";
		  
		 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
		  if (!(CommonMethods.isTestRunnable("JETBLeadCC",sheetName))) {

				throw new SkipException(
						"Skipping the test JETBLeadCC as the Run mode is NO");
			}
		   		//login to CRM
					login = new LoginPage(driver);
					login.CRMLogin(sheetName);
					
					//Searching Lead
					ETBBanca = new JETBLeadBanca(driver);
					ETBBanca.LeadSearch(sheetName);
					
					//Clicking on ETBNewLead
					ETBBanca.ETBLeadClick(sheetName);
					
					//Creating NTB Lead PC=CC
					ETBCC = new JETBLeadCC(driver);
					ETBCC.ETBCCPC(sheetName);
					ETBBanca.ETBLeadCreationUpperPart(sheetName);
					CC = new JNTBLeadCC(driver);
					CC.CCLeadCreation(sheetName);
					CC.NTBLeadCreationLowerPart(sheetName);
					CC.CCAssert(sheetName);
					
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
