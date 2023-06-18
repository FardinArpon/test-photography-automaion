import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.UUID;

import static java.lang.Thread.sleep;

public class Register extends SetUp{
    @Test
    public void Register() throws IOException, InterruptedException {
        driver.get("http://13.228.37.255:4040/");
        wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//div[@class='flex-none gap-2']//a[normalize-space()='Register']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Fardin']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@placeholder='https://xyz.com']")).sendKeys("test.com");
        String randomEmail = "test" + UUID.randomUUID().toString().substring(0, 8) + "@gmail.com";
        driver.findElement(By.xpath("//input[@placeholder='fardin@gmail.com']")).sendKeys(randomEmail);
        driver.findElement(By.xpath("//input[@placeholder='*********']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='SING UP']")).click();
        sleep(5000);
    }
}



