package com.demo.pages.web;

import static com.demo.utils.PageActionsHelper.waitAndClick;
import static com.demo.utils.PageActionsHelper.waitAndSendKeys;

import org.openqa.selenium.By;

import com.demo.driver.DriverManager;

public class LoginPage {

  private static final By USER_NAME_TEXT_BOX = By.id("user");
  private static final By PASSWORD_TEXT_BOX = By.id("password");
  private static final By LOGIN_BUTTON = By.id("login-submit");
  private static final By CONTINUE_BUTTON = By.id("login");

  private LoginPage setUserNameTextBox(String userName) {
    waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
    return this;
  }

  private LoginPage setPasswordTextBox(String password) {
	DriverManager.getDriver().navigate().to(DriverManager.getDriver().getCurrentUrl());
    waitAndSendKeys(PASSWORD_TEXT_BOX, password);
    return this;
  }

  private LoginPage setContinueButton() {
	  waitAndClick(CONTINUE_BUTTON);
	    return this;
	  }
  
  private HomePage setLoginButton() {
    waitAndClick(LOGIN_BUTTON);
    return new HomePage();
  }

  public HomePage loginToApplication(String userName, String password) {
    return setUserNameTextBox(userName).setContinueButton()
      .setPasswordTextBox(password)
      .setLoginButton();
  }
}
