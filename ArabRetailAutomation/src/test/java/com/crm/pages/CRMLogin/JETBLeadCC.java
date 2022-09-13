package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class JETBLeadCC extends TestListeners
{
	public static Logger log =LogManager.getLogger(JETBLeadCC.class.getName());
	
	public JETBLeadCC(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ETBCCPC(String sheetName) throws Exception
	{
		CommonMethods.mouseClick("CreditCard_XPATH");
	}

}
