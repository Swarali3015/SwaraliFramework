package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;

public class NTBCaseNewJordan extends SetUp

{

	public NTBCaseNewJordan(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//i[@class='icon icon-service']")
	private WebElement ServiceIcon;
	
	@FindBy(xpath = "//span[@data-autoid='childtablabel_5_1']")
	private WebElement Cases;
	
	//@FindBy(xpath = "//div[@class='menupopover']")
	
	@FindBy(xpath = "//label[@class='f12 primary ff-medium ph-6 acd-link-text pointer']")
	private WebElement New;
	
	@FindBy(xpath = "//span[text()='Standalone Case']")
	private WebElement StandaloneCase;
	
	
	@FindBy(xpath = "//input[@data-autoid='CASE_CATEGORY_ctrl']")
	private WebElement Category;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement SelectedCategory;
	
	@FindBy(xpath = "//input[@data-autoid='CASE_SUBCATEGORY_ctrl']")
	private WebElement SubCategory;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement SelectedSubCategory;
	
	@FindBy(xpath = "//input[@data-autoid='CASE_SUBCATEGORY1_ctrl']")
	private WebElement SubSubCategory;
	
	@FindBy(css = "tbody tr td:nth-child(1)")
	private WebElement SelectedSubSubCategory;
	
	@FindBy(xpath = "//input[@data-autoid='cust_6_ctrl']")
	private WebElement Name;
	
	@FindBy(xpath = "//input[@data-autoid='cust_32_ctrl']")
	private WebElement Mobile;
	
	@FindBy(xpath="//select[@data-autoid='cust_489_ctrl']")
	private WebElement Channel;
	
	@FindBy(xpath = "//select[@data-autoid='CASE_PRIORITY_ctrl']")
	private WebElement Priority;
	
	@FindBy(xpath = "//textarea[@data-autoid='cust_14_ctrl']")
	private WebElement Comments;
	
	@FindBy(xpath = "//span[text()='Save and proceed']")
	private WebElement SaveProceed;
	
	@FindBy(xpath = "//i[@class='icon icon-edit']")
	private WebElement Edit;
	
	@FindBy(xpath = "//span[text()='Processing']")
	private WebElement ProcessingSC;
	
	@FindBy(xpath = "(//i[contains(@class,'icon icon-delete')])[4]")
	private WebElement Delete;
	
	@FindBy(xpath = "//input[@data-autoid='cust_12_ctrl']")
	private WebElement Source;
	
	@FindBy(css = "tbody tr td")
	private WebElement SelectedSource;
	
	@FindBy(xpath = "//span[text()='Closed']")
	private WebElement ClosedSC;
	
	
	//NTB Case SC=New
	
	
	public void NTBCaseNew(String sheetName) throws Exception
	{
		CommonMethods.scrollByVisibilityofElement(ServiceIcon);
		CommonMethods.highLight(ServiceIcon);
		CommonMethods.Click(ServiceIcon);
		Thread.sleep(5000);
		CommonMethods.highLight(Cases);
		CommonMethods.Click(Cases);
		//CommonMethods.scrollByVisibilityofElement(New);
		CommonMethods.mouseHover(New);
		//CommonMethods.highLight(New);
		//CommonMethods.Click(New);
		//Thread.sleep(3000);
		CommonMethods.scrollByVisibilityofElement(StandaloneCase);
		CommonMethods.highLight(StandaloneCase);
		CommonMethods.Click(StandaloneCase);
		CommonMethods.highLight(Category);
		CommonMethods.input(Category, sheetName, "Case Category", 1);
		CommonMethods.Click(SelectedCategory);
		CommonMethods.highLight(SubCategory);
		CommonMethods.input(SubCategory, sheetName, "Case Sub Category", 1);
		CommonMethods.Click(SelectedSubCategory);
		CommonMethods.highLight(SubSubCategory);
		CommonMethods.input(SubSubCategory, sheetName, "Case Sub-Sub Category", 1);
		CommonMethods.Click(SelectedSubSubCategory);
		CommonMethods.scrollByVisibilityofElement(Name);
		CommonMethods.highLight(Name);
		CommonMethods.input(Name, sheetName, "Name", 1);
		CommonMethods.highLight(Mobile);
		CommonMethods.input(Mobile, sheetName, "Customer Mobile Number", 1);
		CommonMethods.highLight(Channel);
		CommonMethods.selectByText(Channel, sheetName, "Channel", 1);
		CommonMethods.highLight(Priority);
		CommonMethods.selectByText(Priority, sheetName, "Priority", 1);
		Thread.sleep(2000);
		CommonMethods.highLight(Delete);
		CommonMethods.Click(Delete);
		CommonMethods.highLight(Source);
		CommonMethods.input(Source, sheetName, "Source", 1);
		CommonMethods.Click(SelectedSource);
		CommonMethods.highLight(Comments);
		CommonMethods.input(Comments, sheetName, "Comments", 1);
		CommonMethods.highLight(SaveProceed);
		CommonMethods.Click(SaveProceed);
		Thread.sleep(1000);
		CommonMethods.highLight(Edit);
		CommonMethods.Click(Edit);
		CommonMethods.highLight(ProcessingSC);
		CommonMethods.Click(ProcessingSC);
		CommonMethods.Click(SaveProceed);
		Thread.sleep(2000);
		CommonMethods.highLight(Edit);
		CommonMethods.Click(Edit);
		CommonMethods.highLight(ClosedSC);
		CommonMethods.Click(ClosedSC);
		Thread.sleep(1000);
		CommonMethods.highLight(ClosedSC);
		CommonMethods.Click(SaveProceed);
		
		
		
		
		
		
		
	}
	
	


}
