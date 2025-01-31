package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pages.BookHotelPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass

{
	LoginPage login;

	@Given("User is in Ebay Home Page")
	public void user_is_in_Ebay_Home_Page() {
		launchChromeBrowser();
		loadUrl("https://www.ebay.com/");

	}

	@When("User has to enter the {string} and {string}")
	public void user_has_to_enter_the_and(String user, String pass) {
		login = new LoginPage();

		WebElement userName = login.getlstTxtUserName().get(0);
		fill(userName, user);
		WebElement userPass = login.getlstTxtPassword().get(0);
		fill(userPass, pass);

	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		login = new LoginPage();
		WebElement loginBtn = login.getlstBtnLogin().get(0);
		btnClick(loginBtn);
	
	}
}
