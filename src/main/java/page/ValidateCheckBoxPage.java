package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class ValidateCheckBoxPage {

	
	WebDriver driver;
	
	public ValidateCheckBoxPage(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	@FindBy(how =How.CSS ,using="input[name=\"allbox\"]")WebElement toggleAllElement;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	List<WebElement> allCheckboxes;
	@FindBy(how=How.CSS,using="input[name=\"todo[1]\"]")WebElement singleCheckBoxElement;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/input[1]")WebElement removeAllElement;


	public void clickToggleAll()
	{
		toggleAllElement.click();
		for(int i=0;i<allCheckboxes.size();i++)
		{
			Assert.assertTrue(allCheckboxes.get(i).isSelected());
		}
	}
	
	public void clickOnSinglecheckbox()
 	{
 		singleCheckBoxElement.click();
 	}
	
	public void removeAllChechBoxes()
	{
        clickToggleAll();
        removeAllElement.click();
        Assert.assertTrue("size of checkboxes is 1",allCheckboxes.size()==1);
	}
}
