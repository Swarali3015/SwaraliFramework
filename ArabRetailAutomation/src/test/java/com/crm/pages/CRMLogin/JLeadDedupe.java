package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JLeadDedupe extends TestListeners
{
	public static Logger log =LogManager.getLogger(JLeadDedupe.class.getName());
	
//	public JLeadDedupe(WebDriver driver)
//	{
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	
	public void DedupeLeadCreationLowerPart(String sheetName) throws Exception
	{
		Thread.sleep(3000);
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
	}
	
	public void Dedupemesg(String sheetName) throws Exception
	{
	System.out.println(CommonMethods.getElementText("Dedupemsg_XPATH"));

}
	public void CreateDedupeLead(String sheetName) throws Exception
	{
		CommonMethods.highLight("IgnoreCreatebutton_XPATH");
		CommonMethods.Click("IgnoreCreatebutton_XPATH");
		System.out.println(CommonMethods.getElementText("DedupeRejected_XPATH"));
	
	}
	
	public boolean DedupeAssert(String sheetName) throws Exception
	{
		Assert.assertEquals(CommonMethods.getElementText("DedupeRejected_XPATH"), "Dedupe Rejected");
		return true;
		
	}
	
//	public void LeadSearch(String sheetName) throws Exception
//	{
//		CommonMethods.scrollByVisibilityofElement("LeadsClick_XPATH");
//		CommonMethods.Click("LeadsClick_XPATH");
//		CommonMethods.highLight("LeadView_XPATH");
//		CommonMethods.selectByText("LeadView_XPATH", sheetName, "View", 1);
//		CommonMethods.highLight("SelectedView_XPATH");
//		CommonMethods.selectByText("SelectedView_XPATH", sheetName, "Selected View", 1);
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
//}
}
