package tests;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OpenWindowTest extends TestBase {

  @ExtendWith(SeleniumJupiter.class)
  @Test
  public void test1() {
    int i = 1 + 1;
    assertThat(2);
  }

  @ExtendWith(SeleniumJupiter.class)
  @Test
  public void test2() {
    int i = 1 + 1;
    assertThat(4);
  }
}
