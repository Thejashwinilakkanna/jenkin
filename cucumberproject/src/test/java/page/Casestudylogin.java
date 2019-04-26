package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Casestudylogin {
	
	
	@FindBy(how = How.ID,using = "userName")
	public static WebElement username;
	@FindBy(how = How.ID,using = "password")
	public static WebElement password;
	@FindBy(how = How.CSS,using = "input[value='Login']")
	public static WebElement loginButton;
	@FindBy(how = How.CSS,using = "div[class='btn-group']")
	public static WebElement addproduct;
	@FindBy(how = How.ID,using = "categorydropid")
	public static WebElement categorydropid;
	@FindBy(how = How.CSS,using = "option[value='11290']")
	public static WebElement electronics;
	@FindBy(how = How.ID,using = "subcategorydropid")
	public static WebElement subcategory;
	@FindBy(how = How.CSS,using = "option[value='112101']")
	public static WebElement headphone;
	@FindBy(how = How.ID,using = "prodid")
	public static WebElement productname;
	@FindBy(how = How.ID,using = "priceid")
	public static WebElement price;
	@FindBy(how = How.ID,using = "quantityid")
	public static WebElement quantity;
	@FindBy(how = How.ID,using = "brandid")
	public static WebElement brand;
	@FindBy(how = How.ID,using = "description")
	public static WebElement description;
	@FindBy(how = How.CSS,using = "input[name='Add Product']")
	public static WebElement Addproduct;
	
	
	
	
	
	
			
	
	

}
