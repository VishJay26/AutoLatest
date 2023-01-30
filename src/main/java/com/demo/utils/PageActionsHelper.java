package com.demo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.demo.driver.DriverManager;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PageActionsHelper {

  private PageActionsHelper() {
  }

  public static void waitAndClick(By by) {
	  try {
    DriverManager.getDriver().findElement(by).click();
    Thread.sleep(5);
	  }catch(Exception e) {
		e.printStackTrace();  
	  }
  }

  public static void waitAndSendKeys(By by, String value) {
    DriverManager.getDriver().findElement(by).sendKeys(value);
  }

  public static void select(By by, Consumer<Select> consumer) {
    consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
  }

  public static String getAttribute(By by, Function<WebElement, String> attributeFunction) {
    return attributeFunction.apply(DriverManager.getDriver().findElement(by));
  }

  public static boolean isPresent(By by, Predicate<WebElement> elementPredicate) {
    return elementPredicate.test(DriverManager.getDriver().findElement(by));
  }

  
}
