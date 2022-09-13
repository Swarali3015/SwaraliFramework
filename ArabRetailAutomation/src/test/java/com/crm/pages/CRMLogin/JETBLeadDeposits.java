package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JETBLeadDeposits extends TestListeners
{
public static Logger log =LogManager.getLogger(JETBLeadDeposits.class.getName());
	
	public JETBLeadDeposits(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ETBBancaPC(String sheetName) throws Exception
	{
		CommonMethods.mouseClick("Deposits_XPATH");
	}
	 
	public void ApplicationStarted(String sheetName) throws Exception
	{
		CommonMethods.highLight("FulfilmentMilestone_XPATH");
		CommonMethods.Click("FulfilmentMilestone_XPATH");
		Thread.sleep(1000);	
	CommonMethods.highLight("ApplicationStartedStatusCode_XPATH");
	CommonMethods.Click("ApplicationStartedStatusCode_XPATH");
	Thread.sleep(1000);
//	CommonMethods.highLight("ExpectedFulfilmentDate_XPATH");
//	CommonMethods.input("ExpectedFulfilmentDate_XPATH", sheetName, "Expected FulfilmentDate XPATH", 1);
	CommonMethods.input("BackendReferenceNo_XPATH", sheetName, "Backend Reference Number", 1);
	Thread.sleep(1000);
//	Thread.sleep(1000);
	CommonMethods.highLight("SaveAndProceedButton_XPATH");
	CommonMethods.Click("SaveAndProceedButton_XPATH");
	Thread.sleep(1000);
	CommonMethods.Click("LeadOwnerAssigned_XPATH");
	System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
	}
	
	public void LeadRejected(String sheetName) throws Exception
	{
		CommonMethods.highLight("LeadRejected_XPATH");
		CommonMethods.Click("LeadRejected_XPATH");
		CommonMethods.highLight("SaveAndProceedButton_XPATH");
		CommonMethods.Click("SaveAndProceedButton_XPATH");
		Thread.sleep(2000);
		CommonMethods.Click("LeadOwnerAssigned_XPATH");
		System.out.println(CommonMethods.getElementText("AssignedTo_XPATH"));
	}
	
	public boolean LeadRejectedAssert(String sheetName) throws Exception
	{
		System.out.println(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"));
		Assert.assertEquals(CommonMethods.getElementText("LeadDroppedAssertion_XPATH"), "Rejected");
		return true;
		
	}
	
	

}
