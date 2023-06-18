import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SetUp {
    WebDriver driver;
    WebDriverWait wait;
//
//    @Before
//        public void setup_ChromeDriver(){
//            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--headed");
//            driver=new ChromeDriver(ops);
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        }

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--headed");
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @After
    public void finishTest() {

        driver.close();
    }
}
