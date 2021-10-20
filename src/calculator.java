import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws MalformedURLException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1 (1-9) : ");
        int number1 = sc.nextInt();
        System.out.print("Number 2 (1-9) : ");
        int number2 = sc.nextInt();
        System.out.print("Operator (+, -, /, *) : ");
        String op = sc.next();

        add(number1, number2, op);
    }

    public static void add(int number1, int number2, String operator) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);

        String digit1 = "com.android.calculator2:id/digit_" + number1;
        String digit2 = "com.android.calculator2:id/digit_" + number2;

        switch (operator){
            case "+":
                operator = "plus";
                break;
            case "-":
                operator = "minus";
                break;
            case "*":
                operator = "multiply";
                break;
            case "/":
                operator = "divide";
                break;
        }

        MobileElement el6 = ad.findElementById(digit1);
        el6.click();
        MobileElement el7 = ad.findElementByAccessibilityId(operator);
        el7.click();
        MobileElement el8 = ad.findElementById(digit2);
        el8.click();
        MobileElement el9 = ad.findElementByAccessibilityId("equals");
        el9.click();
        MobileElement res = ad.findElementById("com.android.calculator2:id/result");
        System.out.println(res.getText());
    }
}
