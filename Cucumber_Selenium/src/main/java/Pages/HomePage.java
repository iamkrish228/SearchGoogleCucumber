package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	// Page Elements
	@FindBy(name = "q")
	WebElement search;

	@FindBy(className = "yuRUbf")
	WebElement link;

	@FindBy(tagName="body")
	WebElement linkcontains;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage searchWord(String searchkey) {
		
		if (search.isDisplayed()) {
		search.clear();
		search.sendKeys(searchkey);
		}
		search.sendKeys(Keys.ENTER);
		return new HomePage();

	}

	public boolean linkIsPresent() {
		boolean result = link.isEnabled();
		return result;
	}
	
	public String linkWikiPresent() {
		String bodyText = linkcontains.getText();
		return bodyText;
	}
	
	public void clickLink() {

		if (link.isEnabled()) {
			link.click();
		}
	}
/*
	public HomePage searchOtherWord(String searchkey) {

		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys(searchkey);
		}
		search.sendKeys(Keys.ENTER);
		return new HomePage();
	}

	public HomePage searchSpecialChars(String searchkey) {

		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys(searchkey);
		}
		search.sendKeys(Keys.ENTER);
		return new HomePage();

	}*/
}
