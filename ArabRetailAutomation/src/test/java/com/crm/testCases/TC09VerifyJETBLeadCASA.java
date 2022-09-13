package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.JETBLeadDeposits;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadLoan;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.JETBLeadCASA;

public class TC09VerifyJETBLeadCASA  extends SetUp
{
	public LoginPage login;
	public JNTBLeadCC CC;
	public JETBLeadBanca ETBBanca;
	public JETBLeadCASA ETBCASA;
	public JNTBLeadBanca NTBBanca;
	public JETBLeadDeposits depo;
	
	@Test
	
  
  public void VerifyJETBCASA() throws Exception
  {
	//sheetName from Excel to pass the testdata
			String sheetName = "JETBLeadCASA";
			  
			 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
			  if (!(CommonMethods.isTestRunnable("JETBLeadCASA",sheetName))) {

					throw new SkipException(
							"Skipping the test JETBLeadCASA as the Run mode is NO");
				}
			   		//login to CRM
						login = new LoginPage(driver);
						login.CRMLogin(sheetName);
						
						//Searching Lead
						ETBBanca = new JETBLeadBanca(driver);
						ETBBanca.LeadSearch(sheetName);
						
						//Clicking on ETBNewLead
						ETBBanca.ETBLeadClick(sheetName);
						
						//Creating NTB Lead PC=CASA
						ETBCASA = new JETBLeadCASA(driver);
						ETBCASA.ETBCASAPC(sheetName);
						ETBBanca.ETBLeadCreationUpperPart(sheetName);
						NTBBanca = new JNTBLeadBanca(driver);
						NTBBanca.GrossSalary(sheetName);
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
						depo= new JETBLeadDeposits(driver);
						depo.ApplicationStarted(sheetName);
						CC.CCAssert(sheetName);
						
						//Moving Lead to SC=Completed
						CC.LeadSearch(sheetName);
						CC.LeadClosure(sheetName);
						ETBCASA.LeadCompleted(sheetName);
						CC.CCAssert(sheetName);
						
						//Lead Details Page
						CC.LeadDetails(sheetName);
						ETBCASA.LeadCompletedAssert(sheetName);
						
						
  }
}
