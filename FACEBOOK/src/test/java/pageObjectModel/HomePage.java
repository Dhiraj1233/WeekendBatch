package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(id="twotabsearchtextbox")
	private WebElement search_textField;

	@FindBy(id="nav-search-submit-button")
	private WebElement search_icon;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement enterProductName()
	{
		return search_textField;
	}
	public WebElement searchbutton()
	{
		return search_icon;

	}

}
