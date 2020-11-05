package ProblemSolving;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.lang.RandomStringUtils;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    AndroidDriver<AndroidElement> driver;
    public final String Firstname = "Saad";
    public final String Lastname = "Haq";
    public final String Password = RandomStringUtils.randomAlphanumeric(5)+"$3";
    public String email = RandomStringUtils.randomAlphanumeric(6)+"@mailinator.com";


    @BeforeTest
    public void setUp() {

        try {
            DesiredCapabilities work = DesiredCapabilities.android();
            work.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            work.setCapability("platformName", "ANDROID");
            work.setCapability("newCommandTimeout", 100000);
            work.setCapability("noReset", true);
            work.setCapability("automationName", "UiAutomator1");
            work.setCapability(MobileCapabilityType.BROWSER_NAME, "");
            work.setCapability("appPackage", "com.fetchrewards.fetchrewards.hop");
            work.setCapability("appActivity", "com.fetchrewards.fetchrewards.activities.SplashActivity");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<AndroidElement>(url, work);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (SessionNotCreatedException e) {
            System.out.println(e.getMessage());
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }


    }

    @AfterTest
    public void tearDown() {
        //driver.close();
        driver.quit();
    }
}
