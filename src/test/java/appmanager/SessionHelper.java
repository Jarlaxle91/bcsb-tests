package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) { super((ChromeDriver) wd); }

  public void login(String username, String password) {
    type(By.id("name"), username);
    type(By.id("password"), password);
    click(By.id("kc-login"));
  }
}
