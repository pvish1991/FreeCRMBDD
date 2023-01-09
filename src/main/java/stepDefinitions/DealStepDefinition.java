/*package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {
	
WebDriver driver;
	
	@Given("^user is already on login Page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM with Free calling and auto dialing features");
		Thread.sleep(2000);
		
	}
	
	@Then("^user clicks on login link$")
	public void user_clicks_on_login_link() throws InterruptedException{
	    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	    Thread.sleep(2000);
	   
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable Credentials ){
		List<List<String>> data = Credentials.raw();
	    driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
	   driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	   Thread.sleep(3000);
	   
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
		
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+title);
		Assert.assertEquals("Cogmento CRM", title);
		Thread.sleep(3000);
	}
	
	@Then("^user moves to new deal page$")
	public void user_hits_on_contact_page () throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath( "//i[@class='money icon']"))).build().perform();
		driver.findElement(By.xpath( "//i[@class='money icon']")).click();
		//Thread.sleep(2000);
		
	}
	
	@Then("^user clicks on create button$")
	public void user_clicks_on_create_button() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(), 'Create')]")).click();  
	Thread.sleep(2000);
	}
	
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
		 
	 }
	 
		@Then ("^Close the browser$")
		public void Close_the_browser() {
			driver.quit();
		}
}*/
