package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidateCheckBoxPage;
import util.BrowserFactory;

public class ValidateCheckBoxTest {

	WebDriver driver;
	
	@Test
	public void clickAllCheckBoxes()
	{
		driver=BrowserFactory.init();
		ValidateCheckBoxPage validatecheckboxpage=PageFactory.initElements(driver,ValidateCheckBoxPage.class);
		validatecheckboxpage.clickToggleAll();
		BrowserFactory.tearDown();
	}
	
	@Test
	public void clickSingleCheckBox()
	{
		driver=BrowserFactory.init();
		ValidateCheckBoxPage validatecheckboxpage=PageFactory.initElements(driver,ValidateCheckBoxPage.class);
		validatecheckboxpage.clickOnSinglecheckbox();
		BrowserFactory.tearDown();
	}
	
	@Test
	public void removeAllCheckBox()
	{
		driver=BrowserFactory.init();
		ValidateCheckBoxPage validatecheckbox=PageFactory.initElements(driver,ValidateCheckBoxPage.class);
		validatecheckbox.removeAllChechBoxes();
		BrowserFactory.tearDown();
	}
	
	
	
}
