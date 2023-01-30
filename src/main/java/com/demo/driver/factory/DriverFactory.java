package com.demo.driver.factory;

import com.demo.driver.IWebDriver;
import com.demo.driver.impl.web.LocalWebDriverImpl;
import com.demo.driver.impl.web.RemoteWebDriverImpl;
import com.demo.enums.RunModeType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

  private DriverFactory() {
  }

  private static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeType.class);
 

  static {
    WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
    WEB.put(RunModeType.REMOTE, RemoteWebDriverImpl::new);
  }

  public static IWebDriver getDriverForWeb(RunModeType runModeType) {
    return WEB.get(runModeType).get();
  }

}
