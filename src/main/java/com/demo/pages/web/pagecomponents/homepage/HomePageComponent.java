package com.demo.pages.web.pagecomponents.homepage;

import static com.demo.utils.PageActionsHelper.getAttribute;

import org.openqa.selenium.By;


public class HomePageComponent {


  private static final By LOGO = By.xpath("//a[@aria-label='Back to home']");

  public String getHomeURL() {
    return getAttribute(LOGO, e -> e.getAttribute("href"));
  }
}
