package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.JETBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadDeposits;
import com.crm.pages.CRMLogin.JNTBLeadLoan;
import com.crm.pages.CRMLogin.LoginPage;

public class TC11VerifyJETBLeadLoan extends SetUp
{
	public LoginPage login;
	public JETBLeadBanca ETBBanca;
	public JETBLeadCC ETBCC;
	public JNTBLeadCC CC;
	public JNTBLeadLoan loan;

	
  @Test
  public void VerifyJETBLeadLoan() throws Exception 
	  {
		//sheetName from Excel to pass the testdata
			String sheetName = "JETBLeadLoan";
			  
			 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
			  if (!(CommonMethods.isTestRunnable("JETBLeadLoan",sheetName))) {

					throw new SkipException(
							"Skipping the test JETBLeadLoan as the Run mode is NO");
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
						loan = new JNTBLeadLoan(driver);
						loan.LoanLeadCategory(sheetName);
						loan.LeadProductCategory(sheetName);
						ETBBanca.ETBLeadCreationUpperPart(sheetName);
						CC = new JNTBLeadCC(driver);
						loan.Tenor(sheetName);
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
						loan.LoanLeadFulfilment(sheetName);
						
						//Opening Lead Details Page
						CC.LeadDetails(sheetName);
						loan.LeadASAssert(sheetName);
						
  }
}
