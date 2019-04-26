package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.CasestudyAddtoCart;

public class Casestudy2 {
	WebDriver driver;
	@Before
	public void init() {
		 driver=DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver, CasestudyAddtoCart.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	@Given("URL of  TestMeApp")
	public void url_of_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User add the product to cart")
	public void user_add_the_product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		CasestudyAddtoCart.username.sendKeys("Lalitha");
	   CasestudyAddtoCart.password.sendKeys("Password123");
	   CasestudyAddtoCart.loginButton.click();
	  
	   CasestudyAddtoCart.Allcategories.sendKeys("Headphone");
	  CasestudyAddtoCart.finddetails.click();
	  CasestudyAddtoCart.addtocart.click();
	 CasestudyAddtoCart.cart.click();
	 CasestudyAddtoCart.checkout.click();
	 CasestudyAddtoCart.proceedtopay.click();
	//CasestudyAddtoCart.bank.click();
	//CasestudyAddtoCart.cont.click();
	  
	  
	  
	  
	  
	}

	@Then("user added product successfully")
	public void user_added_product_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	
	
	
	
}
