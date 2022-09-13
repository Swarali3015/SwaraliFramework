package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.JETBLeadDeposits;
import com.crm.pages.CRMLogin.JNTBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadDeposits;

public class TC03VerifyJNTBLeadDeposits extends SetUp
{
	public LoginPage login;
	public JNTBLeadDeposits deposits;
	public JNTBLeadCC CC;
	public JETBLeadDeposits depo;
	
	@Test
	
	public void VerifyDeposits() throws Exception
	{
	
	//sheetName from Excel to pass the testdata
	String sheetName = "JNTBLeadDeposits";
	  
	 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
	  if (!(CommonMethods.isTestRunnable("JNTBLeadDeposits",sheetName))) {

			throw new SkipException(
					"Skipping the test JNTBLeadDeposits as the Run mode is NO");
		}
	   		//login to CRM
				login = new LoginPage(driver);
				login.CRMLogin(sheetName);
				
				//Create NTB Deposits Lead 
				CC = new JNTBLeadCC(driver);
				CC.LeadClick(sheetName);
				deposits = new JNTBLeadDeposits(driver);
	  			deposits.JNTBDepositsPC(sheetName);
	  			CC.NTBLeadCreationUpperPart(sheetName);
				CC.NTBLeadCreationLowerPart(sheetName);
				CC.CCAssert(sheetName);
				
				////Moving lead in Appointment Fixed  & Qualified SC
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
				
				//Moving Lead to SC=Rejected
				CC.LeadSearch(sheetName);
				CC.LeadClosure(sheetName);
				depo.LeadRejected(sheetName);
				CC.CCAssert(sheetName);
				
				//Lead Details Page
				CC.LeadDetails(sheetName);
				depo.LeadRejectedAssert(sheetName);
				
				
	
//	  		//Create NTB Bancassurance Lead in Jordan
//	  
//	  			deposits = new JNTBLeadDeposits(driver);
//	  			deposits.Deposits(sheetName);

}
}
