package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver d)    // d = driver = new ChromeDriver();
	{
		driver = d;  
		PageFactory.initElements(driver, this);
	}
	
	//------------------ Obj repo --------------------------
	private By login_link = By.xpath("//a[@id='login2']");
	private By signup_link = By.xpath("//a[@id='signin2']");
	
	
	//--------------- Action methods -----------------------
	public void clickOnLoginLink()
	{
		driver.findElement(login_link).click();
	}
	
	public void clickOnSignupLink()
	{
		driver.findElement(signup_link).click();
	}
	
	//--------------------------------------------------------
	
	@FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement product_link;
	
	public void clickOnSamsungGalaxyS6()
	{
		product_link.click();
	}
}
