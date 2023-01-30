package com.demo.tests.web.base.homepage;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

import com.demo.pages.web.validator.HomePageValidator;

public class HomePageAssert extends AbstractAssert<HomePageAssert, HomePageValidator> {

  private final SoftAssertions softAssertions;

  private HomePageAssert(HomePageValidator homePageValidator) {
    super(homePageValidator, HomePageAssert.class);
    softAssertions = new SoftAssertions();
  }

  public static HomePageAssert assertThat(HomePageValidator homePageValidator) {
    return new HomePageAssert(homePageValidator);
  }

  public HomePageAssert templateEquals(String expectedHeaderName) {
    String actualHeaderName = actual.getHeaderName();
    softAssertions.assertThat(actualHeaderName)
      .isEqualTo(expectedHeaderName);
    return this;
  }

  public void assertAll() {
    softAssertions.assertAll();
  }

}
