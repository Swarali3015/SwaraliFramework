package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;

public class JNTBLeadCC extends TestListeners
{
public static Logger log =LogManager.getLogger(JNTBLeadCC.class.getName());

public static String assignedtousername;

	
	public JNTBLeadCC(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LeadClick(String sheetName) throws Exception
	{
		CommonMethods.highLight("LeadsClick_XPATH");
		CommonMethods.Click("LeadsClick_XPATH");
		CommonMethods.highLight("New_XPATH");
		CommonMethods.Click("New_XPATH");
	}
	
	public void CCLeadCategory(String sheetName) throws Exception
	{
		Thread.sleep(2000);
		CommonMethods.highLight("CreditCard_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("CreditCard_XPATH");
	}
	
	public void Profilebutton() throws Exception
	{
		
			CommonMethods.highLight("ProfileBtn_XPATH");
			Thread.sleep(9000);
			CommonMethods.Click("ProfileBtn_XPATH");
		
			
	}
	
	public void NTBLeadCreationUpperPart(String sheetName) throws Exception
	{
		CommonMethods.highLight("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", sheetName , "Product", 1);
		CommonMethods.highLight("Mobile_XPATH");
		CommonMethods.input("Mobile_XPATH", sheetName, "Mobile", 1);
		CommonMethods.highLight("LeadAmount_XPATH");
		CommonMethods.input("LeadAmount_XPATH", sheetName, "Lead Amount", 1);
		CommonMethods.highLight("Salutation_XPATH");
		CommonMethods.selectByText("Salutation_XPATH", sheetName, "Salutation", 1);
		CommonMethods.highLight("Name_XPATH");
		CommonMethods.input("Name_XPATH", sheetName, "Name", 1);
		CommonMethods.highLight("LeadRating_XPATH");
		CommonMethods.selectByText("LeadRating_XPATH", sheetName, "Lead Rating", 1);
		CommonMethods.highLight("LeadSource_XPATH");
		CommonMethods.selectByText("LeadSource_XPATH", sheetName, "Lead Source", 1);
		CommonMethods.scrollByVisibilityofElement("Income_XPATH");
		CommonMethods.highLight("Income_XPATH");
		CommonMethods.input("Income_XPATH", sheetName, "Income", 1);
	}
	
	public void CCLeadCreation(String sheetName) throws Exception
	{
//		CommonMethods.highLight("Comments_XPATH");
//		CommonMethods.input("Comments_XPATH", sheetName, "Comments", 1);
		CommonMethods.highLight("PrimarySupplementarySelection_XPATH");
		CommonMethods.selectByText("PrimarySupplementarySelection_XPATH", 	sheetName, "Primary/Supplementary", 1);
		CommonMethods.highLight("NoofSypplementaryCards_XPATH");
		CommonMethods.input("NoofSypplementaryCards_XPATH", sheetName, "Supplementary Cards", 1);
	}
	
	public void NTBLeadCreationLowerPart(String sheetName) throws Exception
	{
		CommonMethods.highLight("Comments_XPATH");
		CommonMethods.input("Comments_XPATH", sheetName, "Comments", 1);
		CommonMethods.highLight("City_XPATH");
		CommonMethods.input("City_XPATH", sheetName, "City", 1);
		CommonMethods.Click("SelectedCity_XPATH");
		CommonMethods.highLight("Area_XPATH");
		CommonMethods.input("Area_XPATH", sheetName, "Area", 1);
		CommonMethods.Click("SelectedArea_XPATH");
		CommonMethods.highLight("PreferredBranch_XPATH");
		CommonMethods.input("PreferredBranch_XPATH", sheetName, "Preferred Branch", 1);
		CommonMethods.Click("SelectedPreferredBranch_XPATH");
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
		assignedtousername = CommonMethods.getElementText("AssignedTo_XPATH");
		ExcelOperation.setCellData(sheetName, "Assigned To Username", 1, assignedtousername);
	}
	
	
	public void GetloginDetails(String sheetName) throws Exception
	{
		String username,password;
		String user=ExcelOperation.getCellData(sheetName, "Assigned To Username", 1);
		if(user.equalsIgnoreCase("DR. BM BM"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password", 1);
			LoginPage.CRMLogin1(sheetName, "Username", "Password");
			
		}
		else if(user.equalsIgnoreCase("UAM_User"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username2", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password2", 1);
			LoginPage.CRMLogin1(sheetName, "Username3", "Password3");
			
		}
		else if(user.equalsIgnoreCase("arabadmin"))
		{
//			username = ExcelOperation.getCellData(sheetName, "Username3", 1);
//			password = ExcelOperation.getCellData(sheetName, "Password3", 1);
			LoginPage.CRMLogin1(sheetName, "Username2", "Password2");
			
		}
		
	}
	
	
	public boolean CCAssert(String sheetName) throws Exception
	{
		Assert.assertEquals(CommonMethods.getElementText("AssignedTo_XPATH"), "DR. BM BM");
		return true;
		
	}
	
	
	public void LeadSearch(String sheetName) throws Exception
	{
		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
		CommonMethods.Click("LeadsClick_XPATH");
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
	
	
	
	public void LeadAppointmentFixed(String sheetName) throws Exception
		
	{
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
		Thread.sleep(3000);
		CommonMethods.highLight("QualificationMilestone_XPATH");
		CommonMethods.Click("QualificationMilestone_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("AppointmentFixedStatusCode_XPATH");
		CommonMethods.Click("AppointmentFixedStatusCode_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("AppointmentDate_XPATH");
		CommonMethods.input("AppointmentDate_XPATH", sheetName, "Date", 1);
		CommonMethods.highLight("AppointmentTime_XPATH");
		CommonMethods.input("AppointmentTime_XPATH", sheetName, "Time", 1);
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(1000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
	}
	
	public void LeadQualifiedUpperPart(String sheetName) throws Exception
	{
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
		Thread.sleep(1000);
		
		CommonMethods.highLight("QualifiedStatusCode_XPATH");
		CommonMethods.Click("QualifiedStatusCode_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("NationalID_XPATH");
		CommonMethods.input("NationalID_XPATH", sheetName, "National ID", 1);
		Thread.sleep(1000);
//		CommonMethods.scrollByVisibilityofElement("AccountSearch_XPATH");
//		CommonMethods.highLight("AccountSearch_XPATH");
//		Thread.sleep(5000);
//		CommonMethods.Click("AccountSearch_XPATH");
//		Thread.sleep(6000);
//		CommonMethods.highLight("EnterHoldingNumber_XPATH");
//		CommonMethods.input("EnterHoldingNumber_XPATH", sheetName, "Account No", 1);
//		Thread.sleep(2000);
//		CommonMethods.highLight("ClickHoldingNumber_XPATH");
//		CommonMethods.Click("ClickHoldingNumber_XPATH");
//		Thread.sleep(5000);
//		CommonMethods.scrollByVisibilityofElement("AccountNumber_XPATH");
//		CommonMethods.highLight("AccountNumber_XPATH");
//		CommonMethods.Click("AccountNumber_XPATH");
	}
	
	public void CCLeadQualified(String sheetName) throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.scrollByVisibilityofElement("AccountNumberCC_XPATH");
		CommonMethods.input("AccountNumberCC_XPATH", sheetName, "Account No", 1);
//			CommonMethods.Click("SelectAccountNumber_XPATH");
//		CommonMethods.input("SelectAccountNumber_XPATH", sheetName, "Account No", 1);
		CommonMethods.Click("SelectAccountNumber_XPATH");
		
		Thread.sleep(2000);
	}
	
	public void LeadQualifiedLowerPart(String sheetName) throws Exception
	{
		Thread.sleep(5000);
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(1000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
	}
	
	
	public void LeadClosure(String sheetName) throws Exception
	{
//	CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.ExWait("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("LeadSearchIcon_XPATH");
//		CommonMethods.Click("LeadSearchIcon_XPATH");
//		CommonMethods.highLight("SearchBy_XPATH");
//		CommonMethods.selectByText("SearchBy_XPATH", sheetName, "Search By", 1);
//		CommonMethods.input("SearchNameInput_XPATH", sheetName, "Search Name", 1);
//		Thread.sleep(6000);
//		//CommonMethods.ExWait("SearchedLead_XPATH");
//		CommonMethods.highLight("SearchedLead_XPATH");
//		CommonMethods.Click("SearchedLead_XPATH");
//		
//		CommonMethods.scrollByVisibilityofElement("EditButton_XPATH");
//		CommonMethods.highLight("EditButton_XPATH");
//		Thread.sleep(2000);
//		CommonMethods.Click("EditButton_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("ClosureMilestone_XPATH");
		CommonMethods.Click("ClosureMilestone_XPATH");
		Thread.sleep(1000);
	}
	
	public void LeadDropped(String sheetName) throws Exception
	{
		CommonMethods.highLight("LeadDropped_XPATH");
		CommonMethods.Click("LeadDropped_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("LeadDroppedReason_XPATH");
		CommonMethods.selectByText("LeadDroppedReason_XPATH", sheetName, "Lead Dropped Reason", 1);
		Thread.sleep(2000);
		CommonMethods.highLight("LeadDroppedSelectedReason_XPATH");
		CommonMethods.input("LeadDroppedSelectedReason_XPATH", sheetName, "Not Interested Reason", 1);
		CommonMethods.Click("LeadDroppedReasonInput_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(1000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
		Thread.sleep(1000);
	}
	
	public void LeadDetails(String sheetName) throws Exception
	{
		CommonMethods.highLight("LeadDetailsPageToggleButton_XPATH");
		CommonMethods.Click("LeadDetailsPageToggleButton_XPATH");
	}
	
	
	}
	
