package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class JNTBLeadBanca extends TestListeners

{
	
public static Logger log =LogManager.getLogger(JNTBLeadBanca.class.getName());

public static String username1;
	
	public JNTBLeadBanca(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void BLeadClick(String sheetName) throws Exception
	{
		CommonMethods.highLight("LeadsClick_XPATH");
		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("New_XPATH");
//		CommonMethods.Click("New_XPATH");
		
//		Thread.sleep(2000);
//		CommonMethods.highLight("Bancassurance_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("Bancassurance_XPATH");
	}
	
	public void BancaNEwPath(String sheetName) throws Exception
	
	{
		CommonMethods.highLight("New_XPATH");
		CommonMethods.Click("New_XPATH");
		
	}
	
	public static void BLeadClick1(String sheetName) throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.highLight("Sales_XPATH");
		CommonMethods.Click("Sales_XPATH");
		Thread.sleep(10000);
		CommonMethods.highLight("AdminLeadsClick_XPATH");
		CommonMethods.Click("AdminLeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH")

//		CommonMethods.highLight("New_XPATH");
//		CommonMethods.Click("New_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.highLight("Bancassuranceadmin_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("Bancassuranceadmin_XPATH");
	}
	
	
	public void LeadClickBanca(String sheetName) throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.Click("Usericon_XPATH");
		System.out.println(CommonMethods.getElementText("username_XPATH"));
		username1 = CommonMethods.getElementText("username_XPATH");
		ExcelOperation.setCellData(sheetName, "Username1", 1, username1);
		String user1=ExcelOperation.getCellData(sheetName, "Username1", 1);
		if(user1.equalsIgnoreCase("DR. BM BM"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password", 1);
//			LoginPage.CRMLogin1(sheetName, "Username", "Password");
//			Thread.sleep(5000);
//		CommonMethods.highLight("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("New_XPATH");
//		CommonMethods.Click("New_XPATH");
			JNTBLeadBanca.BLeadClick(sheetName);
			
		}
		else if(user1.equalsIgnoreCase("UAM_User"))
		{
//			Thread.sleep(5000);
//			CommonMethods.highLight("LeadsClick_XPATH");
//			CommonMethods.Click("LeadsClick_XPATH");
//			CommonMethods.highLight("New_XPATH");
//			CommonMethods.Click("New_XPATH");
			JNTBLeadBanca.BLeadClick(sheetName);
			
		}
		else if(user1.equalsIgnoreCase("arabadmin"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username3", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password3", 1);
//			LoginPage.CRMLogin1(sheetName, "Username2", "Password2");
//			Thread.sleep(5000);
//			CommonMethods.highLight("Sales_XPATH");
//			CommonMethods.Click("Sales_XPATH");
//			CommonMethods.highLight("AdminLeadsClick_XPATH");
//			CommonMethods.Click("AdminLeadsClick_XPATH");
////			CommonMethods.Click("LeadsClick_XPATH")
//
//			CommonMethods.highLight("New_XPATH");
//			CommonMethods.Click("New_XPATH");
			JNTBLeadBanca.BLeadClick1(sheetName);
			
		}
	}
	
	public void BancaLeadCategory(String sheetName) throws Exception
	{
			
		//CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//				CommonMethods.highLight("LeadsClick_XPATH");
//				CommonMethods.Click("LeadsClick_XPATH");
//				CommonMethods.highLight("New_XPATH");
//				CommonMethods.Click("New_XPATH");
				
				
				Thread.sleep(2000);
				CommonMethods.highLight("Bancassurance_XPATH");
				Thread.sleep(2000);
				CommonMethods.Click("Bancassurance_XPATH");
	}
	
	
//	public void BancaLeadCategoryadmin(String sheetName) throws Exception
//	{
//			
//		//CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
////				CommonMethods.highLight("LeadsClick_XPATH");
////				CommonMethods.Click("LeadsClick_XPATH");
////				CommonMethods.highLight("New_XPATH");
////				CommonMethods.Click("New_XPATH");
//				
//				
//				Thread.sleep(2000);
//				CommonMethods.highLight("Bancassuranceadmin_XPATH");
//				Thread.sleep(2000);
//				CommonMethods.Click("Bancassuranceadmin_XPATH");
//	}
	
	public void CategoryBanca(String sheetName) throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.Click("Usericon_XPATH");
		System.out.println(CommonMethods.getElementText("username_XPATH"));
		username1 = CommonMethods.getElementText("username_XPATH");
		ExcelOperation.setCellData(sheetName, "Username1", 1, username1);
		String user1=ExcelOperation.getCellData(sheetName, "Username1", 1);
		if(user1.equalsIgnoreCase("DR. BM BM"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password", 1);
//			LoginPage.CRMLogin1(sheetName, "Username", "Password");
//			Thread.sleep(5000);
//		CommonMethods.highLight("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("New_XPATH");
//		CommonMethods.Click("New_XPATH");
			JNTBLeadBanca.BLeadClick(sheetName);
			
		}
		else if(user1.equalsIgnoreCase("UAM_User"))
		{
//			Thread.sleep(5000);
//			CommonMethods.highLight("LeadsClick_XPATH");
//			CommonMethods.Click("LeadsClick_XPATH");
//			CommonMethods.highLight("New_XPATH");
//			CommonMethods.Click("New_XPATH");
			JNTBLeadBanca.BLeadClick(sheetName);
			
		}
		else if(user1.equalsIgnoreCase("arabadmin"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username3", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password3", 1);
//			LoginPage.CRMLogin1(sheetName, "Username2", "Password2");
//			Thread.sleep(5000);
//			CommonMethods.highLight("Sales_XPATH");
//			CommonMethods.Click("Sales_XPATH");
//			CommonMethods.highLight("AdminLeadsClick_XPATH");
//			CommonMethods.Click("AdminLeadsClick_XPATH");
////			CommonMethods.Click("LeadsClick_XPATH")
//
//			CommonMethods.highLight("New_XPATH");
//			CommonMethods.Click("New_XPATH");
			JNTBLeadBanca.BLeadClick1(sheetName);
			
		}
	}
	
	
	
	
	
	
//				CommonMethods.highLight("Product_XPATH");
//				CommonMethods.selectByText("Product_XPATH", sheetName , "Product", 1);
//				CommonMethods.highLight("Mobile_XPATH");
//				CommonMethods.input("Mobile_XPATH", sheetName, "Mobile", 1);
//				CommonMethods.highLight("LeadAmount_XPATH");
//				CommonMethods.input("LeadAmount_XPATH", sheetName, "Lead Amount", 1);
//				CommonMethods.highLight("Salutation_XPATH");
//				CommonMethods.selectByText("Salutation_XPATH", sheetName, "Salutation", 1);
//				CommonMethods.highLight("Name_XPATH");
//				CommonMethods.input("Name_XPATH", sheetName, "Name", 1);
//				CommonMethods.highLight("LeadRating_XPATH");
//				CommonMethods.selectByText("LeadRating_XPATH", sheetName, "Lead Rating", 1);
//				CommonMethods.highLight("LeadSource_XPATH");
//				CommonMethods.selectByText("LeadSource_XPATH", sheetName, "Lead Source", 1);
//				CommonMethods.scrollByVisibilityofElement("Income_XPATH");
//				CommonMethods.highLight("Income_XPATH");
//				CommonMethods.input("Income_XPATH", sheetName, "Income", 1);
	
	
	public void GrossSalary(String sheetName) throws Exception
	{
				CommonMethods.highLight("GrossSalary_XPATH");
				CommonMethods.input("GrossSalary_XPATH", sheetName, "Gross Salary", 1);
	}
//				CommonMethods.highLight("Comments_XPATH");
//				CommonMethods.input("Comments_XPATH", sheetName, "Comments", 1);
//				CommonMethods.highLight("City_XPATH");
//				CommonMethods.input("City_XPATH", sheetName, "City", 1);
//				CommonMethods.Click("SelectedCity_XPATH");
//				CommonMethods.highLight("Area_XPATH");
//				CommonMethods.input("Area_XPATH", sheetName, "Area", 1);
//				CommonMethods.Click("SelectedArea_XPATH");
//				CommonMethods.highLight("PreferredBranch_XPATH");
//				CommonMethods.input("PreferredBranch_XPATH", sheetName, "Preferred Branch", 1);
//				CommonMethods.Click("SelectedPreferredBranch_XPATH");
//				CommonMethods.highLight("SaveAndProceedButton_XPATH");
//				CommonMethods.Click("SaveAndProceedButton_XPATH");
//				Thread.sleep(2000);
//				CommonMethods.Click("LeadOwnerAssigned_XPATH");
//				System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//				CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//				CommonMethods.Click("LeadsClick_XPATH");
//				CommonMethods.ExWait("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("LeadSearchIcon_XPATH");
//				CommonMethods.Click("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("SearchBy_XPATH");
//				CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//				CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//				Thread.sleep(6000);
//				//CommonMethods.ExWait("SearchedLead_XPATH");
//				//CommonMethods.highLight("SearchedLead_XPATH");
//				CommonMethods.Click("SearchedLead_XPATH");
//				CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//				CommonMethods.highLight("EditButton_XPATH");
//				Thread.sleep(2000);
//				CommonMethods.Click("EditButton_XPATH");
//				Thread.sleep(3000);
//				CommonMethods.highLight("QualificationMilestone_XPATH");
//				CommonMethods.Click("QualificationMilestone_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("AppointmentFixedStatusCode_XPATH");
//				CommonMethods.Click("AppointmentFixedStatusCode_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("AppointmentDate_XPATH");
//				CommonMethods.input("AppointmentDate_XPATH", sheetName, "Date", 1);
//				CommonMethods.highLight("AppointmentTime_XPATH");
//				CommonMethods.input("AppointmentTime_XPATH", sheetName, "Time", 1);
//				CommonMethods.highLight("SaveAndProceedButton_XPATH");
//				CommonMethods.Click("SaveAndProceedButton_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.Click("LeadOwnerAssigned_XPATH");
//				System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//				CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//				CommonMethods.Click("LeadsClick_XPATH");
//				CommonMethods.ExWait("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("LeadSearchIcon_XPATH");
//				CommonMethods.Click("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("SearchBy_XPATH");
//				CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//				CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//				Thread.sleep(6000);
//				//CommonMethods.ExWait("SearchedLead_XPATH");
//				//CommonMethods.highLight("SearchedLead_XPATH");
//				CommonMethods.Click("SearchedLead_XPATH");
//				
//				CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//				CommonMethods.highLight("EditButton_XPATH");
//				Thread.sleep(2000);
//				CommonMethods.Click("EditButton_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("QualifiedStatusCode_XPATH");
//				CommonMethods.Click("QualifiedStatusCode_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("NationalID_XPATH");
//				CommonMethods.input("NationalID_XPATH", sheetName, "National ID", 1);
//				Thread.sleep(1000);
//				CommonMethods.highLight("SaveAndProceedButton_XPATH");
//				CommonMethods.Click("SaveAndProceedButton_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.Click("LeadOwnerAssigned_XPATH");
//				System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//				CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//				CommonMethods.Click("LeadsClick_XPATH");
//				CommonMethods.ExWait("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("LeadSearchIcon_XPATH");
//				CommonMethods.Click("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("SearchBy_XPATH");
//				CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//				CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//				Thread.sleep(6000);
//				//CommonMethods.ExWait("SearchedLead_XPATH");
//				//CommonMethods.highLight("SearchedLead_XPATH");
//				CommonMethods.Click("SearchedLead_XPATH");
//				
//				CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//				CommonMethods.highLight("EditButton_XPATH");
//				Thread.sleep(2000);
//				CommonMethods.Click("EditButton_XPATH");
//				Thread.sleep(1000);
	
	
	
	public static void LeadSearchAdmin(String sheetName) throws Exception
	{
//		CommonMethods.scrollByVisibilityofElement("AdminLeadsClick_XPATH");
//		CommonMethods.Click("AdminLeadsClick_XPATH");
		
		Thread.sleep(10000);
		CommonMethods.highLight("LeadView_XPATH");
		CommonMethods.selectByText("LeadView_XPATH", sheetName, "View", 1);
		CommonMethods.highLight("SelectedView_XPATH");
		CommonMethods.selectByText("SelectedView_XPATH", sheetName, "Selected View", 1);
		CommonMethods.ExWait("LeadSearchIconAdmin_XPATH");
		CommonMethods.highLight("LeadSearchIconAdmin_XPATH");
		CommonMethods.Click("LeadSearchIconAdmin_XPATH");
		CommonMethods.highLight("SearchBy_XPATH");
		CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
		CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
		Thread.sleep(6000);
		//CommonMethods.ExWait("SearchedLead_XPATH");
		//CommonMethods.highLight("SearchedLead_XPATH");
		CommonMethods.Click("SearchedLeadAdmin_XPATH");
		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
		CommonMethods.highLight("EditButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("EditButton_XPATH");
	}
	
	public static void LeadSearch(String sheetName) throws Exception
	{
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
		CommonMethods.highLight("LeadView_XPATH");
		CommonMethods.selectByText("LeadView_XPATH", sheetName, "View", 1);
		CommonMethods.highLight("SelectedView_XPATH");
		CommonMethods.selectByText("SelectedView_XPATH", sheetName, "Selected View", 1);
		CommonMethods.ExWait("LeadSearchIcon_XPATH");
		CommonMethods.highLight("LeadSearchIcon_XPATH");
		CommonMethods.Click("LeadSearchIcon_XPATH");
		CommonMethods.highLight("SearchBy_XPATH");
		CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
		CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
		Thread.sleep(6000);
		//CommonMethods.ExWait("SearchedLead_XPATH");
		//CommonMethods.highLight("SearchedLead_XPATH");
		CommonMethods.Click("SearchedLead_XPATH");
		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
		CommonMethods.highLight("EditButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("EditButton_XPATH");
	}
	
	public void LSBanca(String sheetName) throws Exception
	{
		Thread.sleep(5000);
//		CommonMethods.Click("Usericon_XPATH");
//		System.out.println(CommonMethods.getElementText("username_XPATH"));
//		username1 = CommonMethods.getElementText("username_XPATH");
//		ExcelOperation.setCellData(sheetName, "Username1", 1, username1);
		String user2=ExcelOperation.getCellData(sheetName, "Username1", 1);
		if(user2.equalsIgnoreCase("DR. BM BM"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password", 1);
//			LoginPage.CRMLogin1(sheetName, "Username", "Password");
//			Thread.sleep(5000);
//		CommonMethods.highLight("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("New_XPATH");
//		CommonMethods.Click("New_XPATH");
//			JNTBLeadBanca.BLeadClick(sheetName);
			JNTBLeadBanca.LeadSearch(sheetName);
			
			
		}
		else if(user2.equalsIgnoreCase("UAM_User"))
		{
//			Thread.sleep(5000);
//			CommonMethods.highLight("LeadsClick_XPATH");
//			CommonMethods.Click("LeadsClick_XPATH");
//			CommonMethods.highLight("New_XPATH");
//			CommonMethods.Click("New_XPATH");
//			JNTBLeadBanca.BLeadClick(sheetName);
			JNTBLeadBanca.LeadSearch(sheetName);
			
		}
		else if(user2.equalsIgnoreCase("arabadmin"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username3", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password3", 1);
//			LoginPage.CRMLogin1(sheetName, "Username2", "Password2");
//			Thread.sleep(5000);
//			CommonMethods.highLight("Sales_XPATH");
//			CommonMethods.Click("Sales_XPATH");
//			CommonMethods.highLight("AdminLeadsClick_XPATH");
//			CommonMethods.Click("AdminLeadsClick_XPATH");
////			CommonMethods.Click("LeadsClick_XPATH")
//
//			CommonMethods.highLight("New_XPATH");
//			CommonMethods.Click("New_XPATH");
//			JNTBLeadBanca.BLeadClick1(sheetName);
			JNTBLeadBanca.LeadSearchAdmin(sheetName);
			
		}
	}
	
	public void LeadSearchApptFixed(String sheetName) throws Exception
	{
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("LeadView_XPATH");
//		CommonMethods.selectByText("LeadView_XPATH", sheetName, "View1", 1);
//		CommonMethods.highLight("SelectedView_XPATH");
//		CommonMethods.selectByText("SelectedView_XPATH", sheetName, "Selected View1", 1);
//		CommonMethods.ExWait("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("LeadSearchIcon_XPATH");
//		CommonMethods.Click("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("SearchBy_XPATH");
//		CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//		CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//		Thread.sleep(6000);
//		//CommonMethods.ExWait("SearchedLead_XPATH");
//		//CommonMethods.highLight("SearchedLead_XPATH");
//		CommonMethods.Click("SearchedLead_XPATH");
		Thread.sleep(3000);
		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
		CommonMethods.highLight("EditButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("EditButton_XPATH");
	}
	
	public void LeadSearchQualified(String sheetName) throws Exception
	{
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("LeadView_XPATH");
//		CommonMethods.selectByText("LeadView_XPATH", sheetName, "View2", 1);
//		CommonMethods.highLight("SelectedView_XPATH");
//		CommonMethods.selectByText("SelectedView_XPATH", sheetName, "Selected View2", 1);
//		CommonMethods.ExWait("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("LeadSearchIcon_XPATH");
//		CommonMethods.Click("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("SearchBy_XPATH");
//		CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//		CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//		Thread.sleep(6000);
//		//CommonMethods.ExWait("SearchedLead_XPATH");
//		//CommonMethods.highLight("SearchedLead_XPATH");
//		CommonMethods.Click("SearchedLead_XPATH");
		Thread.sleep(3000);
		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
		CommonMethods.highLight("EditButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("EditButton_XPATH");
	}
	
	
	public void BancaLeadFulfillment(String sheetName) throws Exception
	{
				CommonMethods.highLight("FullfillmentMilestone_XPATH");
				CommonMethods.Click("FullfillmentMilestone_XPATH");
				Thread.sleep(1000);
				CommonMethods.highLight("ApplicationStartedStatusCode_XPATH");
				CommonMethods.Click("ApplicationStartedStatusCode_XPATH");
				Thread.sleep(1000);
				CommonMethods.highLight("ProposalNumber_XPATH");
				CommonMethods.input("ProposalNumber_XPATH", sheetName, "Proposal Number", 1);
				CommonMethods.highLight("ProposalStatus_XPATH");
				CommonMethods.selectByText("ProposalStatus_XPATH", sheetName, "Proposal Status", 1);
				Thread.sleep(1000);
				CommonMethods.highLight("SaveAndProceedButton_XPATH");
				CommonMethods.Click("SaveAndProceedButton_XPATH");
				Thread.sleep(1000);
				CommonMethods.Click("LeadOwnerAssigned_XPATH");
				System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
	}
//				CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//				CommonMethods.Click("LeadsClick_XPATH");
//				CommonMethods.ExWait("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("LeadSearchIcon_XPATH");
//				CommonMethods.Click("LeadSearchIcon_XPATH");
//				CommonMethods.highLight("SearchBy_XPATH");
//				CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//				CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//				Thread.sleep(6000);
//				//CommonMethods.ExWait("SearchedLead_XPATH");
//				//CommonMethods.highLight("SearchedLead_XPATH");
//				CommonMethods.Click("SearchedLead_XPATH");
//				
//				CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//				CommonMethods.highLight("EditButton_XPATH");
//				Thread.sleep(2000);
//				CommonMethods.Click("EditButton_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("ClosureMilestone_XPATH");
//				CommonMethods.Click("ClosureMilestone_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("LeadDropped_XPATH");
//				CommonMethods.Click("LeadDropped_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("LeadDroppedReason_XPATH");
//				CommonMethods.selectByText("LeadDroppedReason_XPATH", sheetName, "Lead Dropped Reason", 1);
//				Thread.sleep(2000);
//				CommonMethods.highLight("LeadDroppedSelectedReason_XPATH");
//				CommonMethods.input("LeadDroppedSelectedReason_XPATH", sheetName, "Not Interested Reason", 1);
//				CommonMethods.Click("LeadDroppedReasonInput_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.highLight("SaveAndProceedButton_XPATH");
//				CommonMethods.Click("SaveAndProceedButton_XPATH");
//				Thread.sleep(1000);
//				CommonMethods.Click("LeadOwnerAssigned_XPATH");
//				System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//				Thread.sleep(1000);
//				CommonMethods.highLight("LeadDetailsPageToggleButton_XPATH");
//				CommonMethods.Click("LeadDetailsPageToggleButton_XPATH");
	
	public void LeadSearchAS(String sheetName) throws Exception
	{
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("LeadView_XPATH");
//		CommonMethods.selectByText("LeadView_XPATH", sheetName, "View3", 1);
//		CommonMethods.highLight("SelectedView_XPATH");
//		CommonMethods.selectByText("SelectedView_XPATH", sheetName, "Selected View3", 1);
//		CommonMethods.ExWait("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("LeadSearchIcon_XPATH");
//		CommonMethods.Click("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("SearchBy_XPATH");
//		CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//		CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//		Thread.sleep(6000);
//		//CommonMethods.ExWait("SearchedLead_XPATH");
//		//CommonMethods.highLight("SearchedLead_XPATH");
//		CommonMethods.Click("SearchedLead_XPATH");
		Thread.sleep(3000);
		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
		CommonMethods.highLight("EditButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("EditButton_XPATH");
	}
	
	public boolean LeadDroppedAssert(String sheetName) throws Exception
	{
		System.out.println(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"));
		Assert.assertEquals(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"), "Lead Dropped");
		return true;
		
	}
	
	}


