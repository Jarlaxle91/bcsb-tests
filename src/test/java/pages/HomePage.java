package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

  //*********Constructor*********
  public HomePage(WebDriver driver) {
    super(driver);
  }

  //*********Page Variables*********
  String baseURL = "https://test.bocbs.cardpay-test.com/";

  //*********Web Elements By Using Page Factory*********
  @FindBy(how = How.XPATH, using = "btnSignIn")
  public WebElement signInButton;

  //*********Page Methods*********
  //Go to Homepage
  public HomePage givenIAmAtHomePage() {
    driver.get(baseURL);
    return this;
  }

  //Go to LoginPage
  public LoginPageCBS whenIGoToLoginPage() {
    click(signInButton);
    return new PageFactory().initElements(driver, LoginPageCBS.class);
  }
}