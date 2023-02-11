package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
public static WebDriver driver;

    @Before
    public static void setUp(){

        String key ="webdriver.chrome.driver";
        String value =System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe";
        System.setProperty(key,value);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
      //  driver.findElement(By.xpath("//button[@value='verify you are human']")).click();

    }

    @After
    public static void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
