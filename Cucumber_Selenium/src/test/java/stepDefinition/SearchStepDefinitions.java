package stepDefinition;

import org.junit.Assert;

import Pages.BaseClass;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions extends BaseClass {

	HomePage homepage = new HomePage();
	
	@Given("On the Google Search Page")
	public static void google_homepage() {
		initialization();
	}

	@When("Type {string} and click on the Search")
	public void search_word(String searchword) {
		homepage.searchWord(searchword);
	}

	@Then("Check for the Search Results")
	public void verifySearchResults(){
		Assert.assertTrue("Verified Successfully", homepage.linkIsPresent());
	}

	@Then("Click the search link")
	public void click_link() {
		homepage.clickLink();
	}

	@When("Type {string} special characters and click on the Search")
	public void searchSpecialCharacters(String specialchar) {
		homepage.searchWord(specialchar);
	}
	
	@Then("Verify the Other Search Results")
	public void verify_link() {
		Assert.assertTrue("Verified Successfully", homepage.linkIsPresent());
	}
	
	@Then("Verify the duck search link")
	public void verifylink() {
		Assert.assertTrue("Wiki Not Present", homepage.linkWikiPresent().contains("en.wikipedia.org"));
	}

	@After
	public static void teardown() {
		closeApplication();
	}

}
