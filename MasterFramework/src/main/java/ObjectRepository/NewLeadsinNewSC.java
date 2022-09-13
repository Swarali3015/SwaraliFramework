package ObjectRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonUtility.CommonMethods;
import CommonUtility.ScreenShot;
import CommonUtility.SetUp;
import CommonUtility.TestListeners;

public class NewLeadsinNewSC extends SetUp
{
//public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
	public NewLeadsinNewSC(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
		// NTB Leads PC=Bankassurance
	
	//@FindBy(xpath="//body/div[@id='main']/div[1]/div[1]/ul[1]/li[6]/div[1]/div[1]/a[1]/i[1]") 		//Click on leads from side menu
	@FindBy(xpath="//i[@class='icon icon-obj6']")
	private WebElement leads;
	
	//@FindBy(xpath="//body/div[@id='main']/div[@id='content-side']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]") 		//Click on New
	@FindBy(xpath = "//div[@class='page-title__link']")
	private WebElement New;
	
	@FindBy(xpath="//span[contains(text(),'Bancassurance')]") 		//Click on PC=Bankassurance
	private WebElement Bancassurance;
	
	
	@FindBy(xpath="//select[@data-autoid='LE_PRODUCT_ctrl']") 		//Click on Product dropdown
	private WebElement Product;
	
	
	@FindBy(xpath="//input[@data-autoid='LE_MOBILE_ctrl']") 		//Mobile 
	private WebElement Mobile;
	
	
	@FindBy(xpath = "//input[@data-autoid='LE_AMOUNT_ctrl']")		//Amount
	private WebElement LeadAmount;
	
	
	
	@FindBy(xpath = "//select[@data-autoid='SALUTATION_ctrl']")		//Salutation
	private WebElement Salutation;
	
	
	@FindBy(xpath = "//input[@data-autoid='FULLNAME_ctrl']")		//Customer Name
	private WebElement Name;
	
	@FindBy(xpath = "//select[@data-autoid='LE_LEADRATING_ctrl']")	//Lead Rating
	private WebElement LRating;
	
	@FindBy(xpath = "//select[@data-autoid='LE_LEADSOURCE_ctrl']")	//Lead Source
	private WebElement LSource;
	
	@FindBy(xpath = "//input[@data-autoid='cust_25_ctrl']")			//Income
	private WebElement Income;
	
	@FindBy(xpath = "//input[@data-autoid='cust_372_ctrl']")		//Gross Salary
	private WebElement GrossSalary;
	
	@FindBy(xpath = "//textarea[@data-autoid='cust_76_ctrl']")		//Comments
	private WebElement Comments;
	
	//@FindBy(xpath = "//body/div[@id='main']/div[@id='content-side']/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")	//City Picker Field
	//private WebElement City;
	
	@FindBy(xpath = "//input[@data-autoid='LE_DISTRICT_ctrl']")			//City 
	private WebElement City;
	
	@FindBy(xpath = "//tbody/tr/td[1]")									//City Selected from dropdown
	private WebElement SelectedCity;
	
	@FindBy(xpath = "//input[@data-autoid='LE_CITY_ctrl']")				//Area
	private WebElement Area;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")								//Selected Area
	private WebElement SelectedArea;
	
	@FindBy(xpath = "//input[@data-autoid='LE_ZIP_CODE_ctrl']")			//Preferred Branch
	private WebElement PreferredBranch;
	
	
	@FindBy(xpath = "//tbody/tr/td[1]")								//Selected Preferred Branch
	private WebElement SelectedPreferredBranch;
	
	@FindBy(xpath = "//span[contains(text(),'Save and proceed')]")								//Selected Preferred Branch
	private WebElement SaveProceedbutton;
	
	@FindBy(xpath = "//img[@alt='Lead Owner']")  
	private WebElement LeadOwner;
	
	@FindBy(xpath = "//i[@class='icon icon-edit']")					//First Time Editing Lead
	private WebElement Edit1;
	
	@FindBy(xpath = "//span[contains(text(),'Qualification')]")		//Qualification Milestone
	private WebElement Qualification;
	
	@FindBy(xpath = "//span[contains(text(),'Appointment Fixed')]")	//Appt Fixed
	private WebElement AF;
	
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")			//Date
	private WebElement Date;
	
	@FindBy(xpath = "//input[@placeholder='__:__ __']")				//Time
	private WebElement Time;
	
	@FindBy(xpath = "//span[contains(text(),'Save and proceed')]")	//Save & Proceed2
	private WebElement SaveProceed2;
	
	@FindBy(xpath = "//span[contains(text(),'Qualified')]")			//Qualified Milestonne
	private WebElement Qualified;
	
	@FindBy(xpath = "//input[@data-autoid='cust_44_ctrl']")			//National ID
	private WebElement NationalID;
	
	@FindBy(xpath="//span[contains(text(),'Fulfillment')]")			//Fulfilment Milestone
	private WebElement fulfilment;
	
	@FindBy(xpath = "//span[contains(text(),'Application Started')]")	//Application Started
	private WebElement AS;
	
	@FindBy(xpath = "//input[@data-autoid='cust_35_ctrl']")			//Proposal Number
	private WebElement ProposalNumber;
	
	@FindBy(xpath = "//span[contains(text(),'Closure')]")			//Closure Milestone
	private WebElement Closure;
	
	@FindBy(xpath = "//span[contains(text(),'Lead Dropped')]")			//Rejected
	private WebElement LeadDropped;
	
	
	@FindBy(xpath = "//select[@data-autoid='cust_696_ctrl']")
	private WebElement Reason;
	
	@FindBy(xpath = "//input[@data-autoid='cust_81_ctrl']")
	private WebElement SelectedReason;
	
	@FindBy(xpath = "//td[normalize-space()='Age']")
	private WebElement Final;
	
	
	
	
	
	
	@FindBy(xpath = "//a[@data-autoid='btn_toggle']")
	private WebElement Toggle;
	
	@FindBy(xpath = "//span[@title='Activities']")
	private WebElement Activitiestab;
	
	@FindBy(xpath = "//span[@title='Attachments']")
	private WebElement Attachments;
	
	@FindBy(xpath = "//span[@title='History']")
	private WebElement History;
	
	@FindBy(xpath = "//select[@data-autoid='QueryViewId_ctrl']")
	private WebElement Views;
	
	@FindBy(xpath = "//a[@data-autoid='gridHF_View0']")
	private WebElement LeadSearch;
	
	public void Leads(String sheetName) throws Exception
	{
			CommonMethods.highLight(leads);
			CommonMethods.Click(leads);
			CommonMethods.highLight(New);
			Thread.sleep(1000);
			CommonMethods.Click(New);
			Thread.sleep(2000);
			CommonMethods.highLight(Bancassurance);
			Thread.sleep(2000);
			CommonMethods.Click(Bancassurance);
			CommonMethods.selectByText(Product, sheetName , "Product", 1);
			CommonMethods.input(Mobile, sheetName, "Mobile", 1);
			CommonMethods.input(LeadAmount, sheetName, "Lead Amount", 1);
			CommonMethods.selectByText(Salutation, sheetName, "Salutation", 1);
			CommonMethods.highLight(Name);
			CommonMethods.input(Name, sheetName, "Name", 1);
			CommonMethods.highLight(LRating);
			CommonMethods.selectByText(LRating, sheetName, "Lead Rating", 1);
			CommonMethods.highLight(LSource);
			CommonMethods.selectByText(LSource, sheetName, "Lead Source", 1);
			CommonMethods.scrollByVisibilityofElement(Income);
			CommonMethods.highLight(Income);
			CommonMethods.input(Income, sheetName, "Income", 1);
			CommonMethods.highLight(GrossSalary);
			CommonMethods.input(GrossSalary, sheetName, "Gross Salary", 1);
			CommonMethods.highLight(Comments);
			CommonMethods.input(Comments, sheetName, "Comments", 1);
			CommonMethods.input(City, sheetName, "City", 1);
			CommonMethods.Click(SelectedCity);
			CommonMethods.input(Area, sheetName, "Area", 1);
			CommonMethods.Click(SelectedArea);
			CommonMethods.input(PreferredBranch, sheetName, "Preferred Branch", 1);
			CommonMethods.Click(SelectedPreferredBranch);
			CommonMethods.Click(SaveProceedbutton);
			Thread.sleep(3000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.highLight(Edit1);
			Thread.sleep(3000);
			CommonMethods.Click(Edit1);
			Thread.sleep(2000);
			CommonMethods.highLight(Qualification);
			CommonMethods.Click(Qualification);
			Thread.sleep(2000);
			CommonMethods.highLight(AF);
			CommonMethods.Click(AF);
			Thread.sleep(1000);
			CommonMethods.highLight(Date);
			Thread.sleep(2000);
			CommonMethods.input(Date, sheetName, "Date", 1);
			Thread.sleep(2000);
			CommonMethods.input(Time, sheetName, "Time", 1);
			Thread.sleep(1000);
			CommonMethods.highLight(SaveProceed2);
			CommonMethods.Click(SaveProceed2);
			Thread.sleep(3000);
			CommonMethods.highLight(LeadOwner);
			Thread.sleep(2000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.Click(Edit1);
			Thread.sleep(1000);
			CommonMethods.highLight(Qualified);
			CommonMethods.Click(Qualified);
			Thread.sleep(1000);
			CommonMethods.highLight(NationalID);
			CommonMethods.input(NationalID, sheetName, "National ID", 1);
			Thread.sleep(3000);
			CommonMethods.Click(SaveProceed2);
			Thread.sleep(3000);
			CommonMethods.highLight(LeadOwner);
			Thread.sleep(2000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.highLight(Edit1);
			Thread.sleep(3000);
			CommonMethods.Click(Edit1);
			Thread.sleep(1000);
			CommonMethods.highLight(fulfilment);
			CommonMethods.Click(fulfilment);
			Thread.sleep(2000);
			CommonMethods.highLight(AS);
			CommonMethods.Click(AS);
			Thread.sleep(3000);
			CommonMethods.highLight(ProposalNumber);
			CommonMethods.input(ProposalNumber, sheetName, "Proposal Number", 1);
			Thread.sleep(2000);
			CommonMethods.Click(SaveProceed2);
			Thread.sleep(1000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.highLight(Edit1);
			CommonMethods.Click(Edit1);
			Thread.sleep(1000);
			
			CommonMethods.Click(Closure);
			Thread.sleep(2000);
			CommonMethods.highLight(LeadDropped);
			CommonMethods.Click(LeadDropped);
			Thread.sleep(1000);
			CommonMethods.highLight(Reason);
			CommonMethods.selectByText(Reason, sheetName, "Lead Dropped Reason", 1);
			Thread.sleep(2000);
			CommonMethods.highLight(SelectedReason);
			CommonMethods.input(SelectedReason, sheetName, "Not Interested Reason", 1);
			CommonMethods.Click(Final);
			
			Thread.sleep(2000);
			CommonMethods.Click(SaveProceed2);
			Thread.sleep(1000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			
			
			
			
			
			
			
			CommonMethods.highLight(Toggle);
			CommonMethods.Click(Toggle);
			//Thread.sleep(6000);
			//CommonMethods.scrollAtBottom();
			Thread.sleep(1000);
			CommonMethods.Click(Activitiestab);
			Thread.sleep(1000);
			CommonMethods.Click(Attachments);
			Thread.sleep(2000);
			CommonMethods.Click(History);
			Thread.sleep(1000);
			
			
			
			
	}
	


	}


