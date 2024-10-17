package objects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {
    static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "Redmi 9A");
        capabilities.setCapability("udid", "QK4T45RCX8NZVWS8");
        capabilities.setCapability("appPackage", "com.facebook.katana");
        capabilities.setCapability("appActivity", "com.facebook.adscomposer.AdsComposerActivity");
        capabilities.setCapability("automationName", "UiAutomator2"); // Note: Change to capital 'U'            capabilities.setCapability("skipServerInstallation", true); // Use straight double quotes



        // Initialize the Appium server URL
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, capabilities);
        System.out.println("App started");
    }
}
