package com.TIxpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.UtilityClass;

public class TILoginPage extends UtilityClass{
	
     public TILoginPage() {
	     PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="//input[@id='pre-username']")
     private WebElement user;

     @FindBy(xpath="//button[@id='proceed-username-button']")
     private WebElement loginUser;

     @FindBy(xpath ="//input[@id='password']")
     private WebElement pass;

     @FindBy(xpath="//button[@id='login-button']")
     private WebElement login;

     public WebElement getUser() {
	 return user;
     }
     public WebElement getLoginUser() {
	 return loginUser;
     }
     public WebElement getPass() {
	 return pass;
     }
     public WebElement getLogin() {
	 return login;
     }

	
	
	
}
