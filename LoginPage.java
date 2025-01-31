package com.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

		public LoginPage()
		{
			PageFactory.initElements(driver, this);
			
		}
		
		
		@FindBy(id="userid")
		private List<WebElement> lstTxtUserName;
		
		@FindBy(id="password")
		private List<WebElement> lstTxtPassword;
		
		@FindBy(id="signin-continue-btn")
		private List<WebElement> lstBtnLogin;

		public List<WebElement> getlstTxtUserName() {
			return lstTxtUserName;
		}

		public List<WebElement> getlstTxtPassword() {
			return lstTxtPassword;
		}

		public List<WebElement> getlstBtnLogin() {
			return lstBtnLogin;
		}
		
		
	}

