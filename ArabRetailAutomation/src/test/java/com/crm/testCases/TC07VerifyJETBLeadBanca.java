package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMLogin.JETBLeadBanca;
import com.crm.pages.CRMLogin.JNTBLeadCC;
import com.crm.pages.CRMLogin.JNTBLeadLoan;
import com.crm.pages.CRMLogin.LoginPage;
import com.crm.pages.CRMLogin.JNTBLeadBanca;

public class TC07VerifyJETBLeadBanca extends SetUp
{
	public LoginPage login;
	public JNTBLeadCC CC;
	public JETBLeadBanca ETBBanca;
	public JNTBLeadBanca Banca;
	
	
  @Test
  public void JETBLeadBanca() throws Exception 
  {
	  {
			//sheetName from Excel to pass the testdata
				String sheetName = "JETBLeadBanca";
				  
				 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
				  if (!(CommonMethods.isTestRunnable("JETBLeadBanca",sheetName))) {

						throw new SkipException(
								"Skipping the test JETBLeadBanca as the Run mode is NO");
					}
				   		//login to CRM
							login = new LoginPage(driver);
							login.CRMLogin(sheetName);
							
							//Searching Lead
							ETBBanca = new JETBLeadBanca(driver);
							ETBBanca.LeadSearch(sheetName);
							
							//Clicking on ETBNewLead
							ETBBanca.ETBLeadClick(sheetName);
							ETBBanca.ETBBancaPC(sheetName);
				
							//Create ETB Banca Lead 
							CC = new JNTBLeadCC(driver);
							Banca = new JNTBLeadBanca(driver);
							ETBBanca.ETBLeadCreationUpperPart(sheetName);
							Banca.GrossSalary(sheetName);
				  			CC.NTBLeadCreationLowerPart(sheetName);
				  		//CC.CCAssert(sheetName);
				  			
				  		//Moving lead in Appointment Fixed  & Qualified SC
//							CC.LeadSearch(sheetName);
//							CC.LeadAppointmentFixed(sheetName);
//							//CC.CCAssert(sheetName);
//							CC.LeadSearch(sheetName);
//							CC.LeadQualifiedUpperPart(sheetName);
//							CC.LeadQualifiedLowerPart(sheetName);
//							
//					//Moving lead to SC=Application Started
//							//CC.CCAssert(sheetName);
//							CC.LeadSearch(sheetName);
//							Banca.BancaLeadFulfillment(sheetName);
//							
//					//Moving lead to SC=CLosure		
//							CC.LeadSearch(sheetName);
//							CC.LeadClosure(sheetName);
//							CC.LeadDropped(sheetName);
//							
//					//Lead Details Page
//							CC.LeadDetails(sheetName);
				  			login.Logout();
				  			
				  			
				  			CC.GetloginDetails(sheetName);
				  			
				  			
				  			//CC.CCAssert(sheetName);
				  			
				  			
				  	//Moving lead in Appointment Fixed  & Qualified SC
//				  			CC.LeadClick(sheetName);
				  			Banca.LeadClickBanca(sheetName);
//				  			ETBBanca.ETBLeadClickBanca(sheetName);
							//CC.LeadSearch(sheetName);
				  			Banca.LSBanca(sheetName);
							CC.LeadAppointmentFixed(sheetName);
							//CC.CCAssert(sheetName);
//							CC.LeadSearch(sheetName);
							Banca.LeadSearchApptFixed(sheetName);
							CC.LeadQualifiedUpperPart(sheetName);
							CC.LeadQualifiedLowerPart(sheetName);
							
					//Moving lead to SC=Application Started
							//CC.CCAssert(sheetName);
//							CC.LeadSearch(sheetName);
//							CC.LeadClick(sheetName);
//							Banca.LeadClickBanca(sheetName);
							Banca.LeadSearchQualified(sheetName);
							Banca.BancaLeadFulfillment(sheetName);
							
					//Moving lead to SC=CLosure		
//							CC.LeadSearch(sheetName);
//							CC.LeadClick(sheetName);
//							Banca.LeadClickBanca(sheetName);
				//			Banca.LeadSearchQualified(sheetName);
//							Banca.LeadSearchApptFixed(sheetName);
							Banca.LeadSearchAS(sheetName);
							CC.LeadClosure(sheetName);
							CC.LeadDropped(sheetName);
							
					//Lead Details Page
							CC.LeadDetails(sheetName);
							Banca.LeadDroppedAssert(sheetName);
//				  			
  }
  }
}
