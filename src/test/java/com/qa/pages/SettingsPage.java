package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (accessibility="test-LOGOUT") 
	@iOSXCUITFindBy (id = "test-LOGOUT")
	private WebElement logoutBtn;
	
	public LoginPage pressLogoutBtn() {
		click(logoutBtn, "press Logout button");
		return new LoginPage();
	}

}
