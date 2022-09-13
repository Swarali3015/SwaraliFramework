package ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import CommonUtility.CommonMethods;
	import CommonUtility.SetUp;

	public class LeadDedupe extends SetUp 
	{

		public LeadDedupe(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
		
	
		//NTB Bancassurance
		
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
		
		@FindBy(xpath = "//button[text()='Ignore And Create']")
		private WebElement Create;
		
		@FindBy(xpath = "//div[@title='Dedupe Rejected']")
		private WebElement Status;
				
		
		
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
				CommonMethods.highLight(Create);
				Thread.sleep(3000);
				CommonMethods.Click(Create);
				System.out.println(CommonMethods.getElementText(Status));
				
				
			
		
		}
	}

