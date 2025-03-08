package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    protected AndroidDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        // Задаём capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        //options.setPlatformVersion("13.0");
        options.setAppPackage("com.android.settings");
        options.setAppActivity(".Settings");
        options.setAutomationName("UiAutomator2");
        //options.setApp("D:\\project\\app\\JavaAppiumAutomation\\org.wikipedia_50492_apps.evozi.com.apk");

        // Подключаемся к Appium Server
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void assertElementHasText(By locator, String expectedText, String errorMessage) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();

        Assert.assertTrue(errorMessage, actualText.equals(expectedText));
    }
}
