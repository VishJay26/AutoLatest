package com.demo.driver.impl.web;

import com.demo.driver.IWebDriver;
import com.demo.driver.entity.WebDriverData;
import com.demo.driver.factory.web.remote.RemoteDriverFactory;

import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
  @Override
  public WebDriver getDriver(WebDriverData driverData) {
    return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
  }
}
