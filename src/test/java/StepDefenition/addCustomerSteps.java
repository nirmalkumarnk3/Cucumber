package StepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class addCustomerSteps {
	static WebDriver driver;
	@Given("The user is in Add Customer Page")
	public void the_user_is_in_Add_Customer_Page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\JGND PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user types the Registration details in the form")
	public void the_user_types_the_Registration_details_in_the_form() {
	 WebElement Fname= driver.findElement(By.id("fname"));
	 WebElement Lname= driver.findElement(By.id("lname"));
	 WebElement Email= driver.findElement(By.id("email"));
	 WebElement Address= driver.findElement(By.name("addr"));
	 WebElement Mobile= driver.findElement(By.id("telephoneno"));
	 Fname.sendKeys("Google");
	 Lname.sendKeys("Youtube");
	 Email.sendKeys("kumar3@gmail.com");
	 Address.sendKeys("Madurai");
	 Mobile.sendKeys("9476254675");
	}

	@When("Clicks Submit Button")
	public void clicks_Submit_Button() {
		 driver.findElement(By.name("submit")).click();
	}

	@Then("Check the presence of CustomerID")
	public void check_the_presence_of_CustomerID() {
	   Assert.assertTrue(driver.findElement(By.xpath("//table//tr[1]//b")).isDisplayed());
	}

	@Then("Check the Success Message")
	public void check_the_Success_Message() {
	  Assert.assertEquals("Please Note Down Your CustomerID", driver.findElement(By.xpath("//table//tr[2]//b")).getText());
	}


}
