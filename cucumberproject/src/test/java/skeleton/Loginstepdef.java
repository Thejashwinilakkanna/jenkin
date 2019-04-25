package skeleton;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tests.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdef {
	WebDriver driver;
	@Before
	public  void before()
	{
		 driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public  void after() {
		//driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.close();
	}
	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_App() {
		
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters {word} as username")
	public void user_enters_as_username(String  string) {
		driver.findElement(By.id("userName")).sendKeys(string);
		
		
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("user enters {word} as password")
	public void user_enters_as_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("user is in (Home|Admin Home)")
	public void user_is_in_home_page() {
		driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>>  list= dataTable.asLists();
	/*System.out.println(list.get(0).get(1));
	System.out.println(list.get(0).get(2));
	System.out.println(list.get(1).get(2));
	*/	
	for(List<String> list2 :list) {
			for (String s: list2)
			{
				System.out.println(s+"\t"); 
			}
			System.out.println();
		}
	
	
		
	 
	}

	@Then("user is in  loginpage")
	public void user_is_in_loginpage(List<String> s) {
		
		for (String as: s) {
			System.out.println(as);
		}
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
