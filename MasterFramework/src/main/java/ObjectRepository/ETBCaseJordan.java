package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;

public class ETBCaseJordan extends SetUp

{

	public ETBCaseJordan(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//ETB Case Jordan
	
	@FindBy(xpath = "//i[@class='icon icon-link']")
	private WebElement QuickLink;
	
	@FindBy(xpath = "//span[text()='Customer Search']")
	private WebElement CustomerSearch;
	
	@FindBy(xpath = "//input[@data-autoid='100000000_ctrl']")
	private WebElement CID;
	
	@FindBy(xpath = "//span[text()='Fetch']")
	private WebElement Fetch;
	
	@FindBy(xpath = "//span[@class='acd-link-text']")
	private WebElement Widget;
	
	@FindBy(xpath = "(//i[@class='icon icon-journey'])[1]")
	private WebElement NewCase;
	
	@FindBy(xpath = "//input[contains(@data-autoid,'CASE_CATEGORY_ctrl')]")
	private WebElement Category;
	
	@FindBy(css =  "tbody tr td:nth-child(1)")
	private WebElement SelectedCategory;
	
	@FindBy(xpath = "//input[@data-autoid='CASE_SUBCATEGORY_ctrl']")
	private WebElement SubCategory;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement SelectedSubCategory;
	
	@FindBy(xpath = "//input[@data-autoid='CASE_SUBCATEGORY1_ctrl']")
	private WebElement SubSubCategory;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement SelectedSubSubCategory;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement Next;
	
	//@FindBy(xpath = "//input[@name='CASE_SUBCATEGORY']")
	//private WebElement SubCategory;
	
	@FindBy(xpath="//select[@data-autoid='cust_489_ctrl']")
	private WebElement Channel;
	
	@FindBy(xpath = "//textarea[@data-autoid='cust_14_ctrl']")
	private WebElement Comments;
	
	
	@FindBy(xpath = "//select[@data-autoid='cust_488_ctrl']")
	private WebElement AssignTo;
	
	@FindBy(xpath = "//span[text()='Save and proceed']")
	private WebElement SaveProceed;
	
	
	
	@FindBy(xpath = "//i[@class='icon icon-edit']")
	private WebElement Edit;
	
	@FindBy(xpath = "//span[text()='Closed']")
	private WebElement ClosedSC;
	
	
	public void Case(String sheetName) throws Exception
	
	{
		CommonMethods.highLight(QuickLink);
		CommonMethods.Click(QuickLink);
		Thread.sleep(1000);
		CommonMethods.highLight(CustomerSearch);
		CommonMethods.Click(CustomerSearch);
		CommonMethods.highLight(CID);
		CommonMethods.input(CID, sheetName, "Customer ID", 1);
		Thread.sleep(1000);
		CommonMethods.Click(Fetch);
		CommonMethods.Click(Widget);
		Thread.sleep(1000);
		CommonMethods.highLight(NewCase);
		CommonMethods.Click(NewCase);
		CommonMethods.switchToWindow();
		
		Thread.sleep(6000);
		CommonMethods.input(Category, sheetName, "Case Category", 1);
		CommonMethods.Click(SelectedCategory);
		//CommonMethods.input(SubCategory, sheetName, "Case Sub Category", 1);
		CommonMethods.highLight(SubCategory);
		CommonMethods.input(SubCategory, sheetName, "Case Sub Category", 1);
		CommonMethods.Click(SelectedSubCategory);
		CommonMethods.highLight(SubSubCategory);
		CommonMethods.input(SubSubCategory, sheetName, "Case Sub-Sub Category", 1);
		CommonMethods.Click(SelectedSubSubCategory);
		CommonMethods.highLight(Next);
		CommonMethods.Click(Next);
		driver.manage().window().maximize();
		CommonMethods.highLight(Channel);
		CommonMethods.selectByText(Channel, sheetName, "Channel", 1);
		CommonMethods.highLight(Comments);
		CommonMethods.input(Comments, sheetName, "Comments", 1);
		CommonMethods.selectByText(AssignTo, sheetName, "Assigned To Channel", 1);
		Thread.sleep(2000);
		CommonMethods.highLight(SaveProceed);
		CommonMethods.Click(SaveProceed);
		
		
		CommonMethods.highLight(Edit);
		CommonMethods.Click(Edit);
		CommonMethods.highLight(ClosedSC);
		CommonMethods.Click(ClosedSC);
		Thread.sleep(1000);
		CommonMethods.Click(SaveProceed);
		
		
		
	}
}
