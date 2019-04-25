package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.RegisterPage;

public class Registrationpagedef {
	WebDriver driver;
	@Before
	public void init() {
		 driver=DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver, RegisterPage.class);
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@Given("URL of the demoShop")
	public void url_of_the_demoShop() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("User enters the data for Registration")
	public void user_enters_the_data_for_Registration() {
	    // Write code here that turns the phrase above into concrete actions
	    RegisterPage.gender.click();
	    RegisterPage.firstname.sendKeys("Shali");
	    RegisterPage.lastname.sendKeys("L");
	    RegisterPage.email.sendKeys("Shal1234@gmail.com");
	    RegisterPage.password.sendKeys("Available");
	    RegisterPage.confirmpassword.sendKeys("Available");
	    RegisterPage.registerButton.click();
	//   WebElement s=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]"));
	  
	    
	    
	    
	    
	    
	    
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}



}
