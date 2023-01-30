package com.demo.config.converters;

import org.aeonbits.owner.Converter;

import com.demo.enums.RunModeType;

import java.lang.reflect.Method;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType> {
  @Override
  public RunModeType convert(Method method, String runMode) {
    return RunModeType.valueOf(runMode.toUpperCase());
  }
}
