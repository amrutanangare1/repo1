package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- Obj repo ----------------
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Cart')]")
	private WebElement cart_link;
	
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	private WebElement place_order_btn;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement name_txtbox;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement country_txtbox;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement city_txtbox;
	
	@FindBy(xpath = "//input[@id='card']")
	private WebElement credit_cart_txtbox;
	
	@FindBy(xpath = "//input[@id='month']")
	private WebElement month_txtbox;
	
	@FindBy(xpath = "//input[@id='year']")
	private WebElement year_txtbox;
	
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	private WebElement purchase_btn;
	
	
	// ------------ Action methods -----------
	public void clickOnAddToCartButton()
	{
		add_to_cart_btn.click();
	}
	
	public void clickOnCartLink()
	{
		cart_link.click();
	}
	
	public void clickOnPlaceOrderButton()
	{
		place_order_btn.click();
	}
	
	public void enterName(String name)
	{
		name_txtbox.sendKeys(name);
	}
	
	public void enterCountry(String country)
	{
		country_txtbox.sendKeys(country);
	}
	
	public void enterCity(String city)
	{
		city_txtbox.sendKeys(city);
	}
	
	public void enterCreditCardNumber(String ccnumber)
	{
		credit_cart_txtbox.sendKeys(ccnumber);
	}
	
	public void enterMonth(String month)
	{
		month_txtbox.sendKeys(month);
	}
	
	public void enterYear(String year)
	{
		year_txtbox.sendKeys(year);
	}
	
	public void clickOnPurchaseButton()
	{
		purchase_btn.click();
	}
}
