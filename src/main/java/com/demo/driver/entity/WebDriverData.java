package com.demo.driver.entity;

import com.demo.enums.BrowserRemoteModeType;
import com.demo.enums.BrowserType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
 
private BrowserType browserType;
private BrowserRemoteModeType browserRemoteModeType;

}
