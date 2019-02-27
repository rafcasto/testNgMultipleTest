package utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver(){
        return driver.get();
    }

    @BeforeMethod()
    public void setUp()throws MalformedURLException

    {
        DesiredCapabilities cap = DesiredCapabilities.chrome();

        driver.set(new RemoteWebDriver(new URL("http://172.17.0.1:4448/wd/hub"),cap));
        getDriver().get("https://www.google.com/");
        System.out.println("Creating set up scenarios for " );
    }
    @AfterMethod
    public void close(){
       // getDriver().quit();
       // driver.quit();
        getDriver().close();
        getDriver().quit();
        System.out.println("closing driver");
    }

}
