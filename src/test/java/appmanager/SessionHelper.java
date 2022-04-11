package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(WebDriver wd) { super((FirefoxDriver) wd); }
  
}
