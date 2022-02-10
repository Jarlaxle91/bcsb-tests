package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {
  private final By locator;
  private final WebDriver driver;


  private PageObject(By locator, WebDriver driver) {
    this.locator = locator;
    this.driver = driver;
  }

  public static PageObject byId(String elementId, WebDriver driver) {
    return new PageObject(By.id(elementId), driver);
  }

  public boolean isElementPresent() {
    return driver.findElement(locator).isDisplayed();
  }

  public By getLocator() {
    return locator;
  }
}
