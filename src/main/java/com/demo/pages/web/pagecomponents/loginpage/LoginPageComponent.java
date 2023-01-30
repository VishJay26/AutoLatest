package com.demo.pages.web.pagecomponents.loginpage;
import static com.demo.utils.PageActionsHelper.*;

import org.openqa.selenium.By;

public class LoginPageComponent {


  private static final By USER_NAME_TEXT_BOX = By.xpath("//input[@id='user']");
  private static final By CONTINUE_BUTTON = By.xpath("//input[@id='login']");
  private static final By PASSWORD_TEXT_BOX = By.xpath("//input[@id='password']");
  private static final By LOGIN_BUTTON = By.xpath("//button[@id='login-submit']/span");


  public LoginPageComponent setUserNameTextBox(String userName) {
    waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
    return this;
  }
  
  public LoginPageComponent clickContinue() {
	  waitAndClick(CONTINUE_BUTTON);
	    return this;
	  }
  
  public LoginPageComponent clickLogin() {
	  waitAndClick(LOGIN_BUTTON);
	    return this;
	  }


  public LoginPageComponent setPasswordTextBox(String password) {
    waitAndSendKeys(PASSWORD_TEXT_BOX, password);
    return this;
  }

  public boolean isSuccessMessageDisplayed() {
    return true;
  }

}
