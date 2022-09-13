package com.crm.pages.CRMLogin;

import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JNTBCase extends TestListeners
{
	public void CaseClick(String sheetName) throws Exception
	{

		CommonMethods.scrollByVisibilityofElement("ServiceIcon_XPATH");
		CommonMethods.highLight("ServiceIcon_XPATH");
		CommonMethods.Click("ServiceIcon_XPATH");
		Thread.sleep(3000);
		CommonMethods.highLight("Case_XPATH");
		CommonMethods.Click("Case_XPATH");
		//CommonMethods.scrollByVisibilityofElement(New);
		CommonMethods.mouseHover("NewCase_XPATH");
		//CommonMethods.highLight(New);
		//CommonMethods.Click(New);
		Thread.sleep(4000);
		//CommonMethods.scrollByVisibilityofElement("StandaloneCase_XPATH");
		CommonMethods.highLight("StandaloneCase_XPATH");
		CommonMethods.Click("StandaloneCase_XPATH");

}
	public void CaseCategories(String sheetName) throws Exception
	{
		CommonMethods.highLight("CaseCategory_XPATH");
		CommonMethods.input("CaseCategory_XPATH", sheetName, "Case Category", 1);
		CommonMethods.Click("SelectedCaseCategory_XPATH");
		CommonMethods.highLight("CaseSubCategory_XPATH");
		CommonMethods.input("CaseSubCategory_XPATH", sheetName, "Case Sub Category", 1);
		CommonMethods.Click("SelectedCaseSubCategory_XPATH");
		CommonMethods.highLight("CaseSubSubCategory_XPATH");
		CommonMethods.input("CaseSubSubCategory_XPATH", sheetName, "Case Sub-Sub Category", 1);
		CommonMethods.Click("SelectedCaseSubSubCategory_XPATH");
		
	}
	
	public void CaseNameMobile(String sheetName) throws Exception
	{
	CommonMethods.scrollByVisibilityofElement("CaseName_XPATH");
	CommonMethods.highLight("CaseName_XPATH");
	CommonMethods.input("CaseName_XPATH", sheetName, "Name", 1);
	CommonMethods.highLight("CaseMobile_XPATH");
	CommonMethods.input("CaseMobile_XPATH", sheetName, "Customer Mobile Number", 1);
	}
	
	public void CaseChannel(String sheetName) throws Exception
	{
	CommonMethods.highLight("CaseChannel_XPATH");
	CommonMethods.selectByText("CaseChannel_XPATH", sheetName, "Channel", 1);
	}
	
	public void CasePrioritySource(String sheetName) throws Exception
	{
	CommonMethods.highLight("CasePriority_XPATH");
	CommonMethods.selectByText("CasePriority_XPATH", sheetName, "Priority", 1);
	Thread.sleep(6000);
	CommonMethods.highLight("CaseDelete_XPATH");
	CommonMethods.Click("CaseDelete_XPATH");
	CommonMethods.highLight("CaseSource_XPATH");
	CommonMethods.input("CaseSource_XPATH", sheetName, "Source", 1);
	CommonMethods.Click("CaseSelectedSource_XPATH");
	}
	
	public void CaseComments(String sheetName) throws Exception
	{
		CommonMethods.highLight("CaseComments_XPATH");
		CommonMethods.input("CaseComments_XPATH", sheetName, "Comments", 1);
	}
	
	public void CaseSaveProceed(String sheetName) throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.highLight("CaseSaveandProceed_XPATH");
		CommonMethods.Click("CaseSaveandProceed_XPATH");
	}
	
	
	public boolean CNewSCAssert(String sheetName) throws Exception
	{
		Assert.assertEquals(CommonMethods.getElementText("CaseNewSC_XPATH"), "New");
		return true;
		
	}
	
	public void CaseEditbutton(String sheetName) throws Exception
	{
		Thread.sleep(1000);
		CommonMethods.highLight("CaseEditbutton_XPATH");
		CommonMethods.Click("CaseEditbutton_XPATH");
	}
	
	
	
	public void CaseProcessingSC(String sheetName) throws Exception
	{
		Thread.sleep(1000);
		CommonMethods.highLight("CaseProcessingSC_XPATH");
		CommonMethods.Click("CaseProcessingSC_XPATH");
		CommonMethods.highLight("CaseInProgressSC_XPATH");
		CommonMethods.Click("CaseInProgressSC_XPATH");
		
	}
	
	public boolean CInProgressSCAssert(String sheetName) throws Exception
	{
		Assert.assertEquals(CommonMethods.getElementText("CaseNewSC_XPATH"), "In Progress");
		return true;
		
	}
	
	public void CaseClosedSC(String sheetName) throws Exception
	{
//		Thread.sleep(27000);
		CommonMethods.highLight("CaseClosedMilestone_XPATH");
//		Thread.sleep(27000);
		CommonMethods.Click("CaseClosedMilestone_XPATH");
		Thread.sleep(3000);
//		CommonMethods.scrollByVisibilityofElement("CaseClosedSC");
		CommonMethods.highLight("CaseClosedSC_XPATH");
		CommonMethods.Click("CaseClosedSC_XPATH");
	}
	
	public boolean CClosedSCAssert(String sheetName) throws Exception
	{
		Assert.assertEquals(CommonMethods.getElementText("CaseNewSC_XPATH"), "Closed");
		return true;
		
	}
	
	public void CaseDetailsPage(String sheetName) throws Exception
	{
		CommonMethods.highLight("CaseTogglebutton_XPATH");
		CommonMethods.Click("CaseTogglebutton_XPATH");
	}
	
	
	public boolean CaseFinalStageAssert(String sheetName) throws Exception
	{
		System.out.println(CommonMethods.getElementText("CaseClosedSCAssert_XPATH"));
		Assert.assertEquals(CommonMethods.getElementText("CaseClosedSCAssert_XPATH"), "Closed");
		return true;
		
	}
	
}
	

