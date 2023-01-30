package com.demo.config.converters;

import org.aeonbits.owner.Converter;

import com.demo.enums.BrowserRemoteModeType;

import java.lang.reflect.Method;

public class StringToRemoteModeBrowserTypeConverter implements Converter<BrowserRemoteModeType> {
  @Override
  public BrowserRemoteModeType convert(Method method, String remoteMode) {
    return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
  }
}
