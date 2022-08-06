package io.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCase1 {

    WebDriver driver;
    @Before
    public void setup() throws MalformedURLException {
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());


    }
    @Test
    public void TestCase01() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(10000);
    }

    @After
    public void tearDown() {
        if(driver!=null)
            driver.quit();


    }
}
