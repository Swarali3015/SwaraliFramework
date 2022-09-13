package com.crm.pages.CRMLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;

public class JETBLeadBanca extends TestListeners
{
public static Logger log =LogManager.getLogger(JETBLeadBanca.class.getName());

public static String username1;
	
	public JETBLeadBanca(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LeadSearch(String sheetName) throws Exception
	{
		CommonMethods.highLight("QuickLink_XPATH");
		CommonMethods.Click("QuickLink_XPATH");
		Thread.sleep(1000);
		CommonMethods.highLight("LeadSearch_XPATH");
		CommonMethods.Click("LeadSearch_XPATH");
		CommonMethods.highLight("CustomerID_XPATH");
		CommonMethods.input("CustomerID_XPATH", sheetName, "Customer ID", 1);
		Thread.sleep(1000);
		CommonMethods.highLight("FetchButton_XPATH");
		CommonMethods.Click("FetchButton_XPATH");
		CommonMethods.highLight("Widget_XPATH");
		CommonMethods.Click("Widget_XPATH");
		
	}
	
	public void ETBLeadClick(String sheetName) throws Exception
	{
//		CommonMethods.scrollByVisibilityofElement("Threedoticon_XPATH");
		CommonMethods.highLight("Leads_XPATH");
		CommonMethods.Click("Leads_XPATH");
		Thread.sleep(3000);
		//CommonMethods.scrollByVisibilityofElement("Threedoticon_XPATH");
		CommonMethods.Click("Threedoticon_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseHover("AddNew_XPATH");
		Thread.sleep(1000);
		//CommonMethods.mouseClick("Bancassurance_XPATH");
	}
	
	public static void BETBLeadClick(String sheetName) throws Exception
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
	
	public static void BETBLeadClick1(String sheetName) throws Exception
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
	
	
//	public void ETBLeadClickBanca(String sheetName) throws Exception
//	{
//		Thread.sleep(5000);
//		CommonMethods.Click("Usericon_XPATH");
//		System.out.println(CommonMethods.getElementText("username_XPATH"));
//		username1 = CommonMethods.getElementText("username_XPATH");
//		ExcelOperation.setCellData(sheetName, "Username1", 1, username1);
//		String user1=ExcelOperation.getCellData(sheetName, "Username1", 1);
//		if(user1.equalsIgnoreCase("DR. BM BM"))
//		{
////			username = ExcelOperation.getCellData(sheetName, "Username", 1);
////			password = ExcelOperation.getCellData(sheetName, "Password", 1);
////			LoginPage.CRMLogin1(sheetName, "Username", "Password");
////			Thread.sleep(5000);
////		CommonMethods.highLight("LeadsClick_XPATH");
////		CommonMethods.Click("LeadsClick_XPATH");
////		CommonMethods.highLight("New_XPATH");
////		CommonMethods.Click("New_XPATH");
////			JNTBLeadBanca.BLeadClick(sheetName);
//			JETBLeadBanca.BETBLeadClick(sheetName);
//			
//		}
//		else if(user1.equalsIgnoreCase("UAM_User"))
//		{
////			Thread.sleep(5000);
////			CommonMethods.highLight("LeadsClick_XPATH");
////			CommonMethods.Click("LeadsClick_XPATH");
////			CommonMethods.highLight("New_XPATH");
////			CommonMethods.Click("New_XPATH");
////			JNTBLeadBanca.BLeadClick(sheetName);
//			JETBLeadBanca.BETBLeadClick(sheetName);
//			
//		}
//		else if(user1.equalsIgnoreCase("arabadmin"))
//		{
////			username = ExcelOperation.getCellData(sheetName, "Username3", 1);
////			password = ExcelOperation.getCellData(sheetName, "Password3", 1);
////			LoginPage.CRMLogin1(sheetName, "Username2", "Password2");
////			Thread.sleep(5000);
////			CommonMethods.highLight("Sales_XPATH");
////			CommonMethods.Click("Sales_XPATH");
////			CommonMethods.highLight("AdminLeadsClick_XPATH");
////			CommonMethods.Click("AdminLeadsClick_XPATH");
//////			CommonMethods.Click("LeadsClick_XPATH")
////
////			CommonMethods.highLight("New_XPATH");
////			CommonMethods.Click("New_XPATH");
////			JNTBLeadBanca.BLeadClick1(sheetName);
//			JETBLeadBanca.BETBLeadClick1(sheetName);
//			
//		}
//	}
	
	
	public void ETBBancaPC(String sheetName) throws Exception
	{
		CommonMethods.mouseClick("Bancassurance_XPATH");
	}
	
	public void ETBLeadCreationUpperPart(String sheetName) throws Exception
	{
		CommonMethods.highLight("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", sheetName, "Product", 1);
		//CommonMethods.selectByText("Product_XPATH", sheetName , "Product", 1);
		CommonMethods.highLight("LeadAmount_XPATH");
		CommonMethods.input("LeadAmount_XPATH", sheetName, "Lead Amount", 1);
		CommonMethods.highLight("LeadRating_XPATH");
		CommonMethods.selectByText("LeadRating_XPATH", sheetName, "Lead Rating", 1);
		CommonMethods.highLight("LeadSource_XPATH");
		CommonMethods.selectByText("LeadSource_XPATH", sheetName, "Lead Source", 1);
		CommonMethods.scrollByVisibilityofElement("Income_XPATH");
		CommonMethods.highLight("Income_XPATH");
		CommonMethods.input("Income_XPATH", sheetName, "Income", 1);
	}
	
	

}
