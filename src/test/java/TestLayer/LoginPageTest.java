package TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	
	@BeforeClass
	public void setup()
	{
		BaseClass.initialization();
	}

	@Test
	public void loginFunctionality()
	{
		LoginPage login=new LoginPage();
		login.loginFunctionality("Admin", "admin123");
	}
	
	
}
