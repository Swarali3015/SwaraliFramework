package com.crm.pages.CRMLogin;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JETBCase extends TestListeners
{
	public void ETBCaseClick(String sheetName) throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.highLight("ETBNewCaseButton_XPATH");
		CommonMethods.Click("ETBNewCaseButton_XPATH");	
		CommonMethods.switchToWindow();
	}
	
	public void ETBNextPageCaseCreation(String sheetName) throws Exception
	{
	CommonMethods.highLight("Nextbutton_XPATH");
	CommonMethods.Click("Nextbutton_XPATH");
	driver.manage().window().maximize();
	}
	

	public void ETBAssignTo(String sheetName) throws Exception
	{
	CommonMethods.highLight("AssignTo_XPATH");
	CommonMethods.selectByText("AssignTo_XPATH", sheetName, "Assigned To Channel", 1);
	}
	
	
}
