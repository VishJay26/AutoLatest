package com.demo.tests.web.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.demo.driver.Driver;

public class WebSetup {

  @BeforeTest
  public void setUp() {
    Driver.initDriverForWeb();
  }

  @AfterTest
  public void tearDown() {
    Driver.quitDriver();
  }
}
