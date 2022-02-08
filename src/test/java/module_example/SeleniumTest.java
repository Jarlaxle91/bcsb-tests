package module_example;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@Execution(ExecutionMode.CONCURRENT)
class SeleniumTest {

  @ExtendWith(SeleniumJupiter.class)
  @Test
  void projectIsConfigured(ChromeDriver driver) {
    driver.get("https://test.bocbs.cardpay-test.com/");
    assertThat(driver.getTitle()).contains("Log in to CBS");
  }

  @ExtendWith(SeleniumJupiter.class)
  @Test
  void secondTest(ChromeDriver driver) {
    driver.get("https://test.bocbs.cardpay-test.com/");
    assertThat(driver.getTitle()).contains("Log in to CBS");
  }


}
