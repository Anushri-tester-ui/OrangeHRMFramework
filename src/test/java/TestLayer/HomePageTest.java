package TestLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass{
	
	@Test
	public void validateHomeFunctionality()
	{
		HomePage home=new HomePage();
		String actiualTitle=home.homePageTitle();
		Assert.assertEquals(actiualTitle, "OrangeHRM");
	}
	
	
}
