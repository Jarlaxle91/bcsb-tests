package tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import pages.LoginPageCBS;
import pages.MainPageCBS;

@Execution(ExecutionMode.CONCURRENT)
public class LoginTest extends BaseTest {

  @Test
  public void login_page_object() {
    page.getPage(LoginPageCBS.class).
            givenIAmAtLoginPage().
            login_a("cbs-tester-1", "123_Qwerty");

    page.getPage(MainPageCBS.class)
            .thenCbsPageIsDisplayed();
  }

  @Test
  public void fieldsExist() {
    var loginPage = page.getPage(LoginPageCBS.class);
    loginPage.waitElement(loginPage.username, 30);
    Assertions.assertThat(loginPage.username.isElementPresent()).isTrue();
    Assertions.assertThat(loginPage.password.isElementPresent()).isTrue();
  }
}