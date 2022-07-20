package StepDefintion;

import org.testng.Assert;

import Browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber {
	@Given("open the browser.")
	public void open_the_browser() {
		try {
		  Browser.OpenBrowser();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	  
	}

	@When("Enter the {string}")
	public void enter_the(String string) 
	{
	  try {
		Browser.openurl(string);
	  }
	  catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("Page is displayed.")
	public void page_is_displayed() throws Throwable {
		try {
			String actualTitle=Browser.GetTitle();
			Assert.assertEquals("Your Store", actualTitle);
		}
		catch(AssertionError e) {
			e.printStackTrace();
		}
	   Browser.CloseBrowser();
	}
}
