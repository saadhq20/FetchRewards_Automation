package ProblemSolving;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test01 extends BaseClass {


    @Test
    public void accountTest()  {
        System.out.println("Test for Succesful account creation..");
        MobileElement el1 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/email_signup_button");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_name");
        el2.sendKeys(Firstname);
        MobileElement el3 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_last_name");
        el3.click();
        el3.sendKeys(Lastname);
        MobileElement el4 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_email");
        el4.click();
        el4.sendKeys(email);
        MobileElement el5 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_email_confirm");
        el5.click();
        el5.sendKeys(email);
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_password");
        el6.sendKeys(Password);

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        try{
            Thread.sleep(10000);
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("Screenshot_AccountCreated_Success.jpg"));

        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        MobileElement el11 = driver.findElementById("com.fetchrewards.fetchrewards.hop:id/automation_welcome_msg");
        Assert.assertEquals(el11.getText(),"Welcome, "+Firstname);

    }

    @Test
    public void accountFail(){
        System.out.println("Test for unsuccesful account creation..");
        MobileElement el1 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/email_signup_button");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_name");
        el2.sendKeys(Firstname);
        MobileElement el3 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_last_name");
        el3.click();
        el3.sendKeys(Lastname);
        MobileElement el4 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_email");
        el4.click();
        el4.sendKeys(email);
        MobileElement el5 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_email_confirm");
        el5.click();
        el5.sendKeys(email);
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.fetchrewards.fetchrewards.hop:id/tiet_signup_password");
        el6.sendKeys(Password);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.pressKey(new KeyEvent(AndroidKey.TAB));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        try{
            Thread.sleep(10000);
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("Screenshot_Account_Fail.jpg"));

        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        MobileElement el11 = driver.findElementById("com.fetchrewards.fetchrewards.hop:id/alertTitle");
        Assert.assertEquals(el11.getText(),"Oops!");
    }
}
