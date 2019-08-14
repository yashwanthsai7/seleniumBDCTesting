package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.driver.DriverUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 {
	WebDriver driver;
	
	@Given("the url of test me app application")
	public void the_url_of_test_me_app_application() {
	    // Write code here that turns the phrase above into concrete actions
		 driver=DriverUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	
	}

	@Then("the registration page opens.")
	public void the_registration_page_opens() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("the user enters {word} as username")
	public void the_user_enters_yashwanthsai_as_username(String yash) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(yash);
	
	}

	@When("the user enters {word} as firstname")
	public void the_user_enters_yashwanth_as_firstname(String yashu) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstName")).sendKeys(yashu);
	}

	@When("the user enters {word} as lastname")
	public void the_user_enters_sai_as_lastname(String yashu) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("lastName")).sendKeys(yashu);
	}

	@When("the user enters {word} as password")
	public void the_user_enters_yash_as_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("the user enters {word} as confirm password")
	public void the_user_enters_yash_as_confirm_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("confirmPassword")).sendKeys(pass);
	}

	@When("the user clicks on male as gender")
	public void the_user_clicks_on_male_as_gender() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[value='Male']")).click();
	}

	@When("the  user enters {word} as email")
	public void the_user_enters_yashwanth_gmail_com_as_email(String yashmail) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("emailAddress")).sendKeys(yashmail);
		
	
	}

	@When("the user enters {word} as mobile number")
	public void the_user_enters_as_mobile_number(String mobile) {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("mobileNumber")).sendKeys(mobile);
	}

	@When("the user enters {word} as dob")
	public void the_user_enters_as_dob(String dob) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("the user enters {word} as address")
	public void the_user_enters_hyderabad_as_address(String address) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("address")).sendKeys(address);
	}

	@When("the user selects {word} as security question")
	public void the_user_selects_what_is_your_birth_place_as_security_question(String answer) {
	    // Write code here that turns the phrase above into concrete actions
	Select sel=new Select(driver.findElement(By.name("securityQuestion")));
	sel.selectByIndex(0);
	}

	@When("the user enters {word} as answer")
	public void the_user_enters_hyderabad_as_answer(String ans) {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@When("the user clicks on register button")
	public void the_user_clicks_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("the user gets registered succesfully")
	public void the_user_gets_registered_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	
	}
}
