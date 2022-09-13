package ObjectRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CommonUtility.CommonMethods;
import CommonUtility.ScreenShot;
import CommonUtility.SetUp;
import CommonUtility.TestListeners;

public class DepositsLeadCreation extends SetUp
{

	//public static Logger log =LogManager.getLogger(LoginPage.class.getName());
	
		public DepositsLeadCreation(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

	//NTB Leads PC=Deposits
		
		@FindBy(xpath = "//i[@class='icon icon-obj6']")
		private WebElement Leads;
		
		@FindBy(xpath = "//div[@class='page-title__link']")
		private WebElement newlead;
		
		@FindBy(xpath = "//span[contains(text(),'Deposits')]")
		private WebElement Deposit;
		
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
		
		@FindBy(xpath = "//input[@data-autoid='cust_38_ctrl']")
		private WebElement Tenor;
		
		@FindBy(xpath = "//textarea[@data-autoid='cust_76_ctrl']")		//Comments
		private WebElement Comments;
		
		@FindBy(xpath = "//textarea[@data-autoid='cust_418_ctrl']")		//Aggregated Comments
		private WebElement AggregatedComments;
		
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
		
		@FindBy(xpath = "//span[contains(text(),'Save and proceed')]")	//Save & Proceed button							//Selected Preferred Branch
		private WebElement SaveProceedbutton;
		
		@FindBy(xpath = "//img[@alt='Lead Owner']")  					//Lead Owner
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
		
		@FindBy(xpath="//span[contains(text(),'Fulfilment')]")			//Fulfilment Milestone
		private WebElement fulfilment;
		
		@FindBy(xpath = "//span[contains(text(),'Application Started')]")	//Application Started
		private WebElement AS;
		
		@FindBy(xpath = "//input[@data-autoid='cust_35_ctrl']")			//Backend Reference Number
		private WebElement Backend;
		
		@FindBy(xpath = "//span[contains(text(),'Closure')]")			//Closure Milestone
		private WebElement Closure;
		
		@FindBy(xpath = "//span[contains(text(),'Rejected')]")			//Rejected
		private WebElement Rejected;
		
		@FindBy(xpath = "//a[@data-autoid='btn_toggle']")
		private WebElement Toggle;
		
		@FindBy(xpath = "//span[@title='Activities']")
		private WebElement Activitiestab;
		
		@FindBy(xpath = "//span[@title='Attachments']")
		private WebElement Attachments;
		
		@FindBy(xpath = "//span[@title='History']")
		private WebElement History;
		
		
		public void Deposits(String sheetName) throws Exception
		{
			CommonMethods.highLight(Leads);
			CommonMethods.Click(Leads);
			CommonMethods.highLight(newlead);
			Thread.sleep(1000);
			CommonMethods.Click(newlead);
			Thread.sleep(2000);
			CommonMethods.highLight(Deposit);
			Thread.sleep(2000);
			CommonMethods.Click(Deposit);
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
			CommonMethods.highLight(Tenor);
			CommonMethods.input(Tenor, sheetName, "Tenor", 1);
			CommonMethods.highLight(Comments);
			CommonMethods.input(Comments, sheetName, "Comments", 1);
			CommonMethods.highLight(AggregatedComments);
			CommonMethods.input(AggregatedComments, sheetName, "Aggregated Comments", 1);
			CommonMethods.input(City, sheetName, "City", 1);
			CommonMethods.Click(SelectedCity);
			CommonMethods.input(Area, sheetName, "Area", 1);
			CommonMethods.Click(SelectedArea);
			CommonMethods.input(PreferredBranch, sheetName, "Preferred Branch", 1);
			CommonMethods.Click(SelectedPreferredBranch);
			CommonMethods.Click(SaveProceedbutton);
			Thread.sleep(3000);
			CommonMethods.highLight(LeadOwner);
			Thread.sleep(2000);
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
			Thread.sleep(3000);
			CommonMethods.input(Date, sheetName, "Date", 1);
			Thread.sleep(3000);
			CommonMethods.input(Time, sheetName, "Time", 1);
			Thread.sleep(1000);
			CommonMethods.highLight(SaveProceed2);
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
			CommonMethods.highLight(Qualified);
			CommonMethods.Click(Qualified);
			Thread.sleep(1000);
			CommonMethods.highLight(NationalID);
			CommonMethods.input(NationalID, sheetName, "National ID", 1);
			Thread.sleep(1000);
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
			CommonMethods.input(Backend, sheetName, "Backend Reference Number", 1);
			Thread.sleep(1000);
			CommonMethods.Click(SaveProceed2);
			Thread.sleep(2000);
			CommonMethods.highLight(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.highLight(Edit1);
			Thread.sleep(1000);
			CommonMethods.Click(Edit1);
			Thread.sleep(1000);
			CommonMethods.Click(Closure);
			Thread.sleep(1000);
			CommonMethods.Click(Rejected);
			Thread.sleep(1000);
			CommonMethods.Click(SaveProceed2);
			Thread.sleep(1000);
			CommonMethods.Click(LeadOwner);
			Thread.sleep(1000);
			CommonMethods.highLight(Toggle);
			Thread.sleep(1000);
			CommonMethods.Click(Toggle);
			Thread.sleep(1000);
			CommonMethods.Click(Activitiestab);
			Thread.sleep(1000);
			CommonMethods.Click(Attachments);
			Thread.sleep(2000);
			CommonMethods.Click(History);
			
			
		}
		
		
	
	}
