package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.Casestudylogin;

public class Casestudypagedef {
	WebDriver driver;
	@Before
	public void init() {
		 driver=DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver, Casestudylogin.class);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
@Given("URL of the TestMeApp")
	public void url_of_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters the data for Login")
	public void user_enters_the_data_for_Login() {
	   Casestudylogin.username.sendKeys("admin");
	   Casestudylogin.password.sendKeys("Password456");
	   Casestudylogin.loginButton.click();
	   Casestudylogin.addproduct.click();
	   Casestudylogin.categorydropid.click();
        Casestudylogin.electronics.click();
        Casestudylogin.subcategory.click();
        Casestudylogin.headphone.click();
        Casestudylogin.productname.sendKeys("Headphone");
        Casestudylogin.price.sendKeys("3000");
        Casestudylogin.quantity.sendKeys("10");
        Casestudylogin.brand.sendKeys("JBL");
        Casestudylogin.description.sendKeys("JBL headphone");
        Casestudylogin.Addproduct.click();

	}

	@Then("user is Login successfully")
	public void user_is_Login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
