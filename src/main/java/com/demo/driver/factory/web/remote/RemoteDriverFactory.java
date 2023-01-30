package com.demo.driver.factory.web.remote;

import org.openqa.selenium.WebDriver;

import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {

  private RemoteDriverFactory() {
  }

  private static final Map<BrowserRemoteModeType, Function<BrowserType, WebDriver>> MAP =
    new EnumMap<>(BrowserRemoteModeType.class);

  static {
    MAP.put(BrowserRemoteModeType.SELENIUM, SeleniumGridFactory::getDriver);
  }

  public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType,
                                    BrowserType browserType) {
    return MAP.get(browserRemoteModeType).apply(browserType);
  }
}
