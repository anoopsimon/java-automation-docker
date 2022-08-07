package io.automation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCase1 {

    static String grid="http://localhost:4444/wd/hub";
    static String appUrl="https://www.google.com";

    private WebDriver driver;
    @Before
    public void setup() throws MalformedURLException {
      this.driver = new RemoteWebDriver(new URL(grid),new ChromeOptions());


    }
    @Test
    public void TestCase01()
    {
        driver.get(appUrl);
        Assert.assertTrue("Test should navigate to Google",driver.getCurrentUrl().contains("google"));
    }

    @After
    public void tearDown() {
        if(this.driver!=null)
            this.driver.quit();


    }
}
