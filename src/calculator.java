import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class calculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Number 1 (1-9) : ");
//        String number1 = sc.next();
//        System.out.print("Number 2 (1-9) : ");
//        String number2 = sc.next();
//        System.out.print("Operator (+, -, /, *) : ");
//        String op = sc.next();

        add("number1", "number2", "op");
    }

    public static void add(String number1, String number2, String operator) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "37PRK18427007661");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.uob.id.digitalbank.uat");
        dc.setCapability("appActivity", "uob.com.digitalbank.features.base.LauncherActivity");
        dc.setCapability("noReset", true);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),
                dc);
        TouchAction touch = new TouchAction(driver);

//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me"));

        try {
            // Wait for Element to Load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Change Language
            MobileElement el1 = driver.findElementById("com.uob.id.digitalbank.uat:id/btnLang");
            el1.click();
                // Click English
            MobileElement el2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout");
            el2.click();

            // Click Sign Up
            MobileElement el3 = driver.findElementById("com.uob.id.digitalbank.uat:id/btnSignUpIntro");
            el3.click();
            MobileElement el4 = driver.findElementByAccessibilityId("signUp");
            el4.click();

            // Apply Bundle
            MobileElement el5 = driver.findElementByAccessibilityId("bundleApply");
            el5.click();

            // Scroll to bottom
            touch.press(PointOption.point(512, 1636)).moveTo(PointOption.point(524,777)).release().perform();
            touch.press(PointOption.point(512, 1636)).moveTo(PointOption.point(524,777)).release().perform();
            touch.press(PointOption.point(512, 1636)).moveTo(PointOption.point(524,777)).release().perform();
            touch.press(PointOption.point(512, 1636)).moveTo(PointOption.point(524,777)).release().perform();

            // Click Continue
            MobileElement el6 = driver.findElementById("com.uob.id.digitalbank.uat:id/dynamicUIContinueBtn");
            el6.click();
                // Button Continue in Pop Up
            MobileElement el7 = driver.findElementById("com.uob.id.digitalbank.uat:id/pgDialogPositiveButton");
            el7.click();

            // Input Phone Number and Email
            MobileElement el8 = driver.findElementByAccessibilityId("mobileNumber");
            el8.sendKeys("0910292101");
            MobileElement el9 = driver.findElementByAccessibilityId("emailAddress");
            el9.sendKeys("test@mail.com");

            // Click Continue
            MobileElement el10 = (MobileElement) driver.findElementById("com.uob.id.digitalbank" +
                    ".uat:id/dynamicUIContinueBtn");
            el10.click();

            // Input OTP (1-6)
            touch.tap(PointOption.point(172, 1444)).perform();
            touch.tap(PointOption.point(172, 1444)).perform();
            touch.tap(PointOption.point(533, 1464)).perform();
            touch.tap(PointOption.point(879, 1450)).perform();
            touch.tap(PointOption.point(178, 1607)).perform();
            touch.tap(PointOption.point(544, 1604)).perform();
            touch.tap(PointOption.point(900, 1607)).perform();

        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

        //==========
//        MobileElement el9 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el9.click();
//        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("gotIt");
//        el10.click();
//        (new TouchAction(driver)).tap(533, 1875).perform()
//        MobileElement el11 = (MobileElement) driver.findElementById("com.uob.id.digitalbank.uat:id/dynamicUIContinueBtn");
//        el11.click();
//        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("gotIt");
//        el12.click();
//        (new TouchAction(driver)).tap(533, 1878).perform()
//        MobileElement el13 = (MobileElement) driver.findElementById("com.uob.id.digitalbank.uat:id/dynamicUIContinueBtn");
//        el13.click();
//        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("idNumber");
//        el14.sendKeys("1234567890123456");
//        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("fullName");
//        el15.sendKeys("test test");
//        MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("dateOfBirth");
//        el16.click();
//        MobileElement el17 = (MobileElement) driver.findElementById("android:id/date_picker_header_date");
//        el17.click();
//        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Previous month");
//        el18.click();
//        MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("29 September 2021");
//        el19.click();
//        MobileElement el20 = (MobileElement) driver.findElementById("android:id/date_picker_header_year");
//        el20.click();
//        (new TouchAction(driver))
//                .press({x: 544, y: 658})
//  .moveTo({x: 539: y: 1467})
//  .release()
//                .perform()
//
//        (new TouchAction(driver))
//                .press({x: 544, y: 667})
//  .moveTo({x: 544: y: 1517})
//  .release()
//                .perform()
//
//        (new TouchAction(driver))
//                .press({x: 550, y: 658})
//  .moveTo({x: 536: y: 1496})
//  .release()
//                .perform()
//
//        (new TouchAction(driver))
//                .press({x: 547, y: 646})
//  .moveTo({x: 547: y: 1464})
//  .release()
//                .perform()
//
//        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[2]");
//        el21.click();
//        MobileElement el22 = (MobileElement) driver.findElementById("android:id/button1");
//        el22.click();
//        MobileElement el23 = (MobileElement) driver.findElementById("com.uob.id.digitalbank.uat:id/dynamicUIContinueBtn");
//        el23.click();
//        MobileElement el23 = (MobileElement) driver.findElementById("com.uob.id.digitalbank.uat:id/dynamicUIContinueBtn");
//        el23.click();

    }
}
