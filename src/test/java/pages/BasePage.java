package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageGenerator {
  WebDriverWait wait;
  JavascriptExecutor js;

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (!text.equals(existingText)) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }

  public BasePage(WebDriver driver) {
    super(driver);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    js = (JavascriptExecutor) driver;
  }

  //Click Method by using JAVA Generics (You can use both By or Webelement)
  public <T> void click(T elementAttr) {
    if (elementAttr.getClass().getName().contains("By")) {
      driver.findElement((By) elementAttr).click();
    } else {
      ((WebElement) elementAttr).click();
    }
  }

  public PageObject getById(String elementId) {
    return PageObject.byId(elementId, driver);
  }

  public void waitElement(PageObject element, int timeoutInSecond) {
    new WebDriverWait(driver, Duration.ofSeconds(timeoutInSecond))
            .until(ExpectedConditions.presenceOfElementLocated(element.getLocator()));
  }

  public void jsClick(By by) {
    js.executeScript("arguments[0].click();", wait.until(ExpectedConditions.visibilityOfElementLocated(by)));
  }

  //Write Text by using JAVA Generics (You can use both By or Webelement)
  public <T> void writeText(T elementAttr, String text) {
    if (elementAttr instanceof PageObject) {
      var pageObject = (PageObject) elementAttr;
      driver.findElement(pageObject.getLocator()).sendKeys(text);

    } else if (elementAttr.getClass().getName().contains("By")) {
      driver.findElement((By) elementAttr).sendKeys(text);
    } else {
      ((WebElement) elementAttr).sendKeys(text);
    }
  }

  //Read Text by using JAVA Generics (You can use both By or Webelement)
  public <T> String readText(T elementAttr) {
    if (elementAttr.getClass().getName().contains("By")) {
      return driver.findElement((By) elementAttr).getText();
    } else {
      return ((WebElement) elementAttr).getText();
    }
  }

  //Close popup if exists
  public void handlePopup(By by) throws InterruptedException {
    List<WebElement> popup = driver.findElements(by);
    if (!popup.isEmpty()) {
      popup.get(0).click();
      Thread.sleep(200);
    }
  }
}