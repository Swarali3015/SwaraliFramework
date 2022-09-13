package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtility.CommonMethods;
import CommonUtility.SetUp;

public class CustomerCardView extends SetUp

{
	public CustomerCardView(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//i[@class='icon icon-obj7']")
	private WebElement Customers;
	
	@FindBy(xpath = "//select[@data-autoid='QueryViewId_ctrl']")
	private WebElement CustomerType;
	
	@FindBy(xpath = "//a[@data-autoid='gridHF_View0']")
	private WebElement Search;
	
	
	private void Customer(String sheetName) throws Exception
	
	{
	CommonMethods.highLight(Customers);
	CommonMethods.Click(Customers);
	CommonMethods.highLight(CustomerType);
	CommonMethods.selectByText(CustomerType, sheetName, "Customer Type", 1);
	CommonMethods.highLight(Search);
	CommonMethods.Click(Search);
	
	}
	
	}
