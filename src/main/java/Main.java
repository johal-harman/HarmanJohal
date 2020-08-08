import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.reporters.jq.BasePanel.C;

public class Main {
WebDriver driver;

    @Test

    public void setUp()

    {

        System.setProperty("WebDriver.ChromeDriver","C:\\Automation\\chromedriver.exe");

driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
