package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class MainPageCBS extends BasePage {

  public MainPageCBS(WebDriver driver) {
    super(driver);
  }

//  public By topToolBar = By.id("topToolbar");

  public PageObject topToolBar = getById("topToolbar");


  public void thenCbsPageIsDisplayed() {
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    waitElement(topToolBar, 60);

  }
}
