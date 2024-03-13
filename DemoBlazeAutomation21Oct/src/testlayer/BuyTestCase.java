package testlayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.CartPage;
import pageLayer.HomePage;

public class BuyTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage homepage_obj = new HomePage(driver);
		homepage_obj.clickOnSamsungGalaxyS6();
		
		CartPage cartpage_obj = new CartPage(driver);
		cartpage_obj.clickOnAddToCartButton();
		cartpage_obj.clickOnCartLink();
		cartpage_obj.clickOnPlaceOrderButton();
		cartpage_obj.enterName("test");
		cartpage_obj.enterCountry("India");
		cartpage_obj.enterCity("Pune");
		cartpage_obj.enterMonth("12");
		cartpage_obj.enterYear("2024");
		cartpage_obj.enterCreditCardNumber("12345600");
		cartpage_obj.clickOnPurchaseButton();
	}
}
