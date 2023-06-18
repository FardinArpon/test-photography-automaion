import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class login extends SetUp{
    @Test
    public void Login() throws IOException, InterruptedException {
        driver.get("http://13.228.37.255:4040/");
        wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//div[@class='flex-none gap-2']//a[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("fardinaminarpon@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
        sleep(5000);
    }
}
