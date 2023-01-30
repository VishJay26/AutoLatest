package com.demo.driver;

import org.openqa.selenium.WebDriver;

import com.demo.driver.entity.WebDriverData;

public interface IWebDriver {
  WebDriver getDriver(WebDriverData driverData);
}
