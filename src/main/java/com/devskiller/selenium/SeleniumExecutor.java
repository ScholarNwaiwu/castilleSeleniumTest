package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumExecutor {

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  public String extractHeader() {
    return driver.findElement(By.tagName("h1")).getText();
  }

  public String clickTheButtonAndExtractLink() {
    driver.findElement(By.tagName("button")).click();
    return driver.findElement(By.tagName("a")).getAttribute("href");
  }

}
