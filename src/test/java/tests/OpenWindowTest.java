package tests;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OpenWindowTest extends TestBase {

  @Test
  public void test1() {
    int i = 1 + 1;
    System.out.println("First test start");
    assertThat(2);
    System.out.println("First test end");

  }

  @Test
  public void test2() {
    System.out.println("Second test start");
    int i = 1 + 1;
    assertThat(4);
    System.out.println("Second test end");

  }
}
