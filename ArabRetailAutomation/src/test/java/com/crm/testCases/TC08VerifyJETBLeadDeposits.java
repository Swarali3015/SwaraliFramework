package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.JETBLeadDeposits;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadDeposits;
import com.crm.pages.CRMLogin.JNTBLeadLoan;
import com.crm.pages.CRMLogin.LoginPage;


public class TC08VerifyJETBLeadDeposits extends SetUp
{
	
	public LoginPage login;
	public JNTBLeadCC CC;
	public JETBLeadBanca ETBBanca;
	public JNTBLeadBanca Banca;
	public JETBLeadDeposits depo;
	public JNTBLeadLoan loan;
  @Test
  public void VerifyJETBLeadDeposits() throws Exception
  {
	//sheetName from Excel to pass the testdata
		String sheetName = "JETBLeadDeposits";
		  
		 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
		  if (!(CommonMethods.isTestRunnable("JETBLeadDeposits",sheetName))) {

				throw new SkipException(
						"Skipping the test JETBLeadDeposits as the Run mode is NO");
			}
		   		//login to CRM
					login = new LoginPage(driver);
					login.CRMLogin(sheetName);
					
					//Searching Lead
					ETBBanca = new JETBLeadBanca(driver);
					ETBBanca.LeadSearch(sheetName);
					
					//Clicking on ETBNewLead
					ETBBanca.ETBLeadClick(sheetName);
//					ETBBanca.ETBBancaPC(sheetName);
					
					//Creating NTB Lead PC=Deposits
					depo = new JETBLeadDeposits(driver);
					depo.ETBBancaPC(sheetName);
					ETBBanca.ETBLeadCreationUpperPart(sheetName);
//					loan = new JNTBLeadLoan(driver);
//					loan.Tenor(sheetName);
					CC = new JNTBLeadCC(driver);
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
					depo.ApplicationStarted(sheetName);
					CC.CCAssert(sheetName);
					
					//Moving Lead to SC=Rejected
					CC.LeadSearch(sheetName);
					CC.LeadClosure(sheetName);
					depo.LeadRejected(sheetName);
					CC.CCAssert(sheetName);
					
					//Lead Details Page
					CC.LeadDetails(sheetName);
					depo.LeadRejectedAssert(sheetName);
					
					
					
  }
}
