package com.crm.pages.CRMLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JNTBLeadCASA extends TestListeners

{
	public JNTBLeadCASA(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void CASA(String sheetName) throws Exception
	{
//		CommonMethods.highLight("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("New_XPATH");
//		CommonMethods.Click("New_XPATH");
//		Thread.sleep(2000);
		CommonMethods.highLight("CASA_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("CASA_XPATH");
//		CommonMethods.Click("Deposits_XPATH");
//		CommonMethods.highLight("Product_XPATH");
//		CommonMethods.selectByText("Product_XPATH", sheetName , "Product", 1);
//		CommonMethods.highLight("Mobile_XPATH");
//		CommonMethods.input("Mobile_XPATH", sheetName, "Mobile", 1);
//		CommonMethods.highLight("LeadAmount_XPATH");
//		CommonMethods.input("LeadAmount_XPATH", sheetName, "Lead Amount", 1);
//		CommonMethods.highLight("Salutation_XPATH");
//		CommonMethods.selectByText("Salutation_XPATH", sheetName, "Salutation", 1);
//		CommonMethods.highLight("Name_XPATH");
//		CommonMethods.input("Name_XPATH", sheetName, "Name", 1);
//		CommonMethods.highLight("LeadRating_XPATH");
//		CommonMethods.selectByText("LeadRating_XPATH", sheetName, "Lead Rating", 1);
//		CommonMethods.highLight("LeadSource_XPATH");
//		CommonMethods.selectByText("LeadSource_XPATH", sheetName, "Lead Source", 1);
//		CommonMethods.scrollByVisibilityofElement("Income_XPATH");
//		CommonMethods.highLight("Income_XPATH");
//		CommonMethods.input("Income_XPATH", sheetName, "Income", 1);
//		CommonMethods.highLight("GrossSalary_XPATH");
//		CommonMethods.input("GrossSalary_XPATH", sheetName, "Gross Salary", 1);
//		CommonMethods.highLight("Comments_XPATH");
//		CommonMethods.input("Comments_XPATH", sheetName, "Comments", 1);
//		CommonMethods.highLight("City_XPATH");
//		CommonMethods.input("City_XPATH", sheetName, "City", 1);
//		CommonMethods.Click("SelectedCity_XPATH");
//		CommonMethods.highLight("Area_XPATH");
//		CommonMethods.input("Area_XPATH", sheetName, "Area", 1);
//		CommonMethods.Click("SelectedArea_XPATH");
//		CommonMethods.highLight("PreferredBranch_XPATH");
//		CommonMethods.input("PreferredBranch_XPATH", sheetName, "Preferred Branch", 1);
//		CommonMethods.Click("SelectedPreferredBranch_XPATH");
//		CommonMethods.highLight("SaveAndProceedButton_XPATH");
//		CommonMethods.Click("SaveAndProceedButton_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("LeadOwnerAssigned_XPATH");
//		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
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
//		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//		CommonMethods.highLight("EditButton_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("EditButton_XPATH");
//		Thread.sleep(3000);
//		CommonMethods.highLight("QualificationMilestone_XPATH");
//		CommonMethods.Click("QualificationMilestone_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("AppointmentFixedStatusCode_XPATH");
//		CommonMethods.Click("AppointmentFixedStatusCode_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("AppointmentDate_XPATH");
//		CommonMethods.input("AppointmentDate_XPATH", sheetName, "Date", 1);
//		CommonMethods.highLight("AppointmentTime_XPATH");
//		CommonMethods.input("AppointmentTime_XPATH", sheetName, "Time", 1);
//		CommonMethods.highLight("SaveAndProceedButton_XPATH");
//		CommonMethods.Click("SaveAndProceedButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.Click("LeadOwnerAssigned_XPATH");
//		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
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
//		
//		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//		CommonMethods.highLight("EditButton_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("EditButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("QualifiedStatusCode_XPATH");
//		CommonMethods.Click("QualifiedStatusCode_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("NationalID_XPATH");
//		CommonMethods.input("NationalID_XPATH", sheetName, "National ID", 1);
//		Thread.sleep(1000);
//		CommonMethods.highLight("SaveAndProceedButton_XPATH");
//		CommonMethods.Click("SaveAndProceedButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.Click("LeadOwnerAssigned_XPATH");
//		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
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
//		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//		CommonMethods.highLight("EditButton_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("EditButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("FulfilmentMilestone_XPATH");
//		CommonMethods.Click("FulfilmentMilestone_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("ApplicationStartedStatusCode_XPATH");
//		CommonMethods.Click("ApplicationStartedStatusCode_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.input("BackendReferenceNo_XPATH", sheetName, "Backend Reference Number", 1);
//		
//		Thread.sleep(1000);
//		CommonMethods.highLight("SaveAndProceedButton_XPATH");
//		CommonMethods.Click("SaveAndProceedButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.Click("LeadOwnerAssigned_XPATH");
//		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
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
//		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//		CommonMethods.highLight("EditButton_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("EditButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("ClosureMilestone_XPATH");
//		CommonMethods.Click("ClosureMilestone_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.highLight("TerminatedStatus_XPATH");
//		CommonMethods.Click("TerminatedStatus_XPATH");
//		CommonMethods.highLight("SaveAndProceedButton_XPATH");
//		CommonMethods.Click("SaveAndProceedButton_XPATH");
//		Thread.sleep(1000);
//		CommonMethods.Click("LeadOwnerAssigned_XPATH");
//		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
//		Thread.sleep(1000);
//		CommonMethods.highLight("LeadDetailsPageToggleButton_XPATH");
//		CommonMethods.Click("LeadDetailsPageToggleButton_XPATH");
		
//		
	}
		
		
		public void LeadTerminated(String sheetName) throws Exception
		{
		CommonMethods.highLight("TerminatedStatus_XPATH");
		CommonMethods.Click("TerminatedStatus_XPATH");
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(1000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
		
		
	}
		
		public boolean LeadTerminatedAssert(String sheetName) throws Exception
		{
			System.out.println(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"));
			Assert.assertEquals(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"), "Terminated");
			return true;
		}
	
}

