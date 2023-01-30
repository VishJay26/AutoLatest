package com.demo.driver.impl.web;

import com.demo.driver.IWebDriver;
import com.demo.driver.entity.WebDriverData;
import com.demo.driver.factory.web.local.LocalDriverFactory;

import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

  @Override
  public WebDriver getDriver(WebDriverData driverData) {
    return LocalDriverFactory.getDriver(driverData.getBrowserType());
  }
}
