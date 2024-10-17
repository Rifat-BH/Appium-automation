package org.example;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    static AppiumDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "Redmi 9A");
        capabilities.setCapability("appPackage", "com.google.android.googlequicksearchbox");
        capabilities.setCapability("appActivity", "com.google.android.apps.gsa.assistant.handoff.BrowserReturnActivity");
        capabilities.setCapability("automationName", "uiautomator2");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url,capabilities);
        System.out.println("app started");

    }
}
