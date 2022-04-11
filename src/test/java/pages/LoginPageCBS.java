package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageCBS extends BasePage {

  //*********Constructor*********
  public LoginPageCBS(WebDriver driver) {
    super(driver);
  }

  String baseURL = "https://test.bocbs.cardpay-test.com/";

  //*********Web Elements by using Page Factory*********

//  public By username = By.id("name");
  public PageObject username = getById("name");
  public PageObject password = getById("password");

  By loginButton = By.id("kc-login");

  public LoginPageCBS givenIAmAtLoginPage() {
    driver.get(baseURL);
    return this;
  }

  public LoginPageCBS andIAmLogInToCBS(String username, String password) {
    type(By.id("name"), username);
    type(By.id("password"), password);
    click(By.id("kc-login"));
    return this;
  }

  public LoginPageCBS login_a(String username, String password) {
    writeText(this.username, username);
    writeText(this.password, password);
    jsClick(loginButton);
    return this;
  }



}