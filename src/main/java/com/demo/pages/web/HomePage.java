package com.demo.pages.web;

import com.demo.pages.web.validator.HomePageValidator;
import com.demo.utils.PageActionsHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

  private static final By TEXTTEMPLATE = By.xpath("(//h1)[1]");

  public HomePageValidator getHomePageValidator() {
    return HomePageValidator.builder()
      .headerName(PageActionsHelper.getAttribute(TEXTTEMPLATE, WebElement::getText))
      .build();
  }
}
