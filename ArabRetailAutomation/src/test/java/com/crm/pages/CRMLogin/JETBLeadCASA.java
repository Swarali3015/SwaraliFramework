package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JETBLeadCASA extends TestListeners
{
public static Logger log =LogManager.getLogger(JETBLeadCASA.class.getName());
	
	public JETBLeadCASA(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ETBCASAPC(String sheetName) throws Exception
	{
		CommonMethods.mouseClick("CASA_XPATH");
	}
	
	public void LeadCompleted(String sheetName) throws Exception
	{
		CommonMethods.highLight("Completed_XPATH");
		CommonMethods.Click("Completed_XPATH");
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(1000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
	}
	
	public boolean LeadCompletedAssert(String sheetName) throws Exception
	{
		System.out.println(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"));
		Assert.assertEquals(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"), "Completed");
		return true;
	}

}
