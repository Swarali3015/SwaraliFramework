package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadLoan;
import com.crm.pages.CRMLogin.LoginPage;


public class TC06VerifyJNTBLeadLoan extends SetUp

{
	public LoginPage login;
	public JNTBLeadCC CC;
	public JNTBLeadLoan loan;
	
  @Test
  public void JNTBLeadLoan() throws Exception 
  {
	//sheetName from Excel to pass the testdata
		String sheetName = "JNTBLeadLoan";
		  
		 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
		  if (!(CommonMethods.isTestRunnable("JNTBLeadLoan",sheetName))) {

				throw new SkipException(
						"Skipping the test JNTBLeadLoan as the Run mode is NO");
			}
		   		//login to CRM
					login = new LoginPage(driver);
					login.CRMLogin(sheetName);
		
					
					//Create NTB HL Lead in Jordan
					
					CC = new JNTBLeadCC(driver);
					CC.LeadClick(sheetName);
					loan = new JNTBLeadLoan(driver);
					loan.LoanLeadCategory(sheetName);
					loan.LeadProductCategory(sheetName);
					CC.NTBLeadCreationUpperPart(sheetName);
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
					
					
					
					
					
					
					
					
					
				
					
//					loan.LoanLeadCreation(sheetName);
//					loan.LoanAssert(sheetName);
//					loan.LoanLeadSearch(sheetName);
//					loan.LoanLeadAppointmentFixed(sheetName);
//					loan.LoanAssert(sheetName);
//					loan.LoanLeadSearch(sheetName);
//					loan.LoanLeadQualified(sheetName);
//					loan.LoanAssert(sheetName);
//					loan.LoanLeadSearch(sheetName);
//					loan.LoanLeadFulfilment(sheetName);
//					CC.CCLeadDetails(sheetName);
					
					
					
					
					
					
//					CC.NTBLeadCreationUpperHalf(sheetName);
//					CC.NTBETBLeadCreation(sheetName);
//					loan.LeadTenure(sheetName);
//					CC.NTBLeadCreationSecondHalf(sheetName);
//					CC.Assert(sheetName);
//					CC.LeadSearch(sheetName);
//					CC.LeadAppointmentFixed(sheetName);
//					CC.Assert(sheetName);
//					CC.LeadSearch(sheetName);
//					CC.LeadQualified(sheetName);
//					CC.Assert(sheetName);
//					CC.LeadSearch(sheetName);
//					loan.LeadFulfilment(sheetName);
//					CC.Assert(sheetName);
//					CC.CCLeadDetails(sheetName);
  }
}
