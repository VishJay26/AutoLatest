package com.demo.driver;

import org.openqa.selenium.WebDriver;

import com.demo.enums.PlatformType;

import java.util.EnumMap;
import java.util.Map;

import static com.demo.enums.PlatformType.WEB;
import static java.lang.ThreadLocal.withInitial;

public final class DriverManager {

  private DriverManager() {
  }

  private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
  private static final ThreadLocal<PlatformType> CONTEXT = withInitial(() -> WEB);
  private static final Map<PlatformType, ThreadLocal<WebDriver>> DRIVER_MAP = new EnumMap<>(PlatformType.class);

  public static WebDriver getDriver() {
    return WEB_DRIVER_THREAD_LOCAL.get() ;
  }

  public static void setDriver(WebDriver driver) {
      WEB_DRIVER_THREAD_LOCAL.set(driver);
      DRIVER_MAP.put(WEB, WEB_DRIVER_THREAD_LOCAL);
      CONTEXT.set(WEB);
  }

  public static void unload() {
    WEB_DRIVER_THREAD_LOCAL.remove();
    CONTEXT.remove();
  }
}
