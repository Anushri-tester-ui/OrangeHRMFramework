package PageLayer;

import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle()
	{
		String title= driver.getTitle();
		return title;
	}

}
