package com.demo.driver;

import com.demo.driver.entity.WebDriverData;
import com.demo.driver.factory.DriverFactory;

import org.openqa.selenium.WebDriver;

import static com.demo.config.factory.ConfigFactory.getConfig;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class Driver {

  private Driver() {
  }

  public static void initDriverForWeb() {
    if (Objects.isNull(DriverManager.getDriver())) {
      WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
      WebDriver driver = DriverFactory
        .getDriverForWeb(getConfig().browserRunMode())
        .getDriver(driverData);
      DriverManager.setDriver(driver);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      loadURL();
    }
  }

  public static void loadURL() {
    DriverManager.getDriver().get(getConfig().webUrl());
  }


  public static void quitDriver() {
    if (Objects.nonNull(DriverManager.getDriver())) {
      DriverManager.getDriver()
        .quit();
      DriverManager.unload();
    }
  }
}
