package appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;
  private final Properties properties;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;

  public ApplicationManager() {
    properties = new Properties();
  }

}
