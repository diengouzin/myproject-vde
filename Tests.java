// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tests() {
    // Test name: Tests
    // Step # | name | target | value | comment
    // 1 | executeScript | return [ "http://127.0.0.1:5500/table.html ","https://chat.openai.com/c/fa4f5e0b-a07b-40ec-a1de-5d38930016ee ","https://www.google.fr/ ", " http://127.0.0.1:5500/exemple.html"] | urls | 
    vars.put("urls", js.executeScript("return [ \"http://127.0.0.1:5500/table.html \",\"https://chat.openai.com/c/fa4f5e0b-a07b-40ec-a1de-5d38930016ee \",\"https://www.google.fr/ \", \" http://127.0.0.1:5500/exemple.html\"]"));
    // 2 | executeScript | return ${urls}.length | count | 
    vars.put("count", js.executeScript("return arguments[0].length", vars.get("urls")));
    // 3 | store | ${count} | count | 
    vars.put("count", "vars.get("count").toString()");
    // 4 | store | 0 | r | 
    vars.put("r", "0");
    // 5 | while | ${r} <${count} |  | 
    while ((Boolean) js.executeScript("return (arguments[0] <arguments[1])", vars.get("r"),vars.get("count"))) {
      // 6 | executeScript | return ${urls}[${r}] | affiche | 
      vars.put("affiche", js.executeScript("return arguments[0][arguments[1]]", vars.get("urls"),vars.get("r")));
      // 7 | open | ${affiche} |  | 
      driver.get("http://127.0.0.1:5500/exemple.htmlvars.get("affiche").toString()");
      // 8 | executeScript | return parseInt(${r})+1 | r | 
      vars.put("r", js.executeScript("return parseInt(arguments[0])+1", vars.get("r")));
      // 10 | storeXpathCount | xpath=//html/body/table/tbody/tr | rows | 
      vars.put("rows", driver.findElements(By.xpath("//html/body/table/tbody/tr")).size());
      // 11 | store | 0 | i | 
      vars.put("i", "0");
      // 12 | while | ${i} <${rows} |  | 
      while ((Boolean) js.executeScript("return (arguments[0] <arguments[1])", vars.get("i"),vars.get("rows"))) {
        // 14 | executeScript | return parseInt(${i})+1 | i | 
        vars.put("i", js.executeScript("return parseInt(arguments[0])+1", vars.get("i")));
        // 15 | echo | ${i} |  | 
        System.out.println(vars.get("i").toString());
        // 16 | storeText | xpath= //tr[${i}]/td[3] | description | 
        vars.put("description", driver.findElement(By.xpath(" //tr[vars.get("i").toString()]/td[3]")).getText());
        // 17 | storeXpathCount | xpath= //tr[${i}]/td[5] | d | 
        vars.put("d", driver.findElements(By.xpath(" //tr[vars.get("i").toString()]/td[5]")).size());
        // 18 | if | ${d} > 0 |  | 
        if ((Boolean) js.executeScript("return (arguments[0] > 0)", vars.get("d"))) {
          // 19 | storeText | xpath= //tr[${i}]/td[5] | result | 
          vars.put("result", driver.findElement(By.xpath(" //tr[vars.get("i").toString()]/td[5]")).getText());
          // 20 | verifyText | xpath= //tr[${i}]/td[5] | OK | 
          assertThat(driver.findElement(By.xpath(" //tr[vars.get("i").toString()]/td[5]")).getText(), is("OK"));
          // 21 | else |  |  | 
        } else {
          // 22 | end |  |  | 
        }
        // 23 | echo | ${description} |  | 
        System.out.println(vars.get("description").toString());
        // 24 | echo | ${result} |  | 
        System.out.println(vars.get("result").toString());
        // 25 | end |  |  | 
      }
      // 26 | end |  |  | 
    }
  }
}
