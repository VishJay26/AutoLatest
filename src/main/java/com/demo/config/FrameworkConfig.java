package com.demo.config;

import com.demo.config.converters.StringToBrowserTypeConverter;
import com.demo.config.converters.StringToRemoteModeBrowserTypeConverter;
import com.demo.config.converters.StringToRunModeBrowserTypeConverter;
import com.demo.config.converters.StringToURLConverter;
import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;
import com.demo.enums.RunModeType;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "file:${user.dir}/src/test/resources/config.properties",
  "file:${user.dir}/src/test/resources/staging-config.properties",
  "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

  @DefaultValue("staging")
  String environment();

  @Key("${environment}.webUrl")
  String webUrl();

  @DefaultValue("CHROME")
  @ConverterClass(StringToBrowserTypeConverter.class)
  BrowserType browser();

  @Key("runModeBrowser")
  @ConverterClass(StringToRunModeBrowserTypeConverter.class)
  RunModeType browserRunMode();

  @Key("browserRemoteMode")
  @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
  BrowserRemoteModeType browserRemoteMode();

  @ConverterClass(StringToURLConverter.class)
  URL seleniumGridURL();

}
