import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OpenTheApp {
    @Test
    public void openAppOnAndroid() throws MalformedURLException {
        String url = "http://127.0.0.1:4723/wd/hub";
//        String url = "http://local:8200/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.APP, "D:\\Projects\\ReactNativeProject\\todoqacart\\android\\app\\build\\outputs\\apk\\debug\\app-debug.apk");

        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
    }

//    @Test
//    public void openAppOnIOS() throws MalformedURLException {
//        String url = "http://127.0.0.1:4723/wd/hub";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
//        caps.setCapability((MobileCapabilityType.ORIENTATION, "PORTRAIT");
//        caps.setCapability(MobileCapabilityType.UDID, "18DB0C66-FD8C-4595-97EB-614B7E74696F");
//        caps.setCapability(MobileCapabilityType.APP, "/Users/apple/Library/Developer/Xcode/DerivedData/todoqacart-dvohiuphsrurrjazikzeibcmwqci/Build/Products/Debug-iphonesimulator/todoqacart.app");
//
//        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
//    }

//    @Test
//    public void openWebAppOnIOS() throws MalformedURLException {
//        String url = "http://127.0.0.1:4723/wd/hub";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
//        caps.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
//        caps.setCapability(MobileCapabilityType.UDID, "18DB0C66-FD8C-4595-97EB-614B7E74696F");
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
//
//        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
//
//        driver.get("https://google.com");
//    }

//    @Test
//    public void openWebAppOnAndroid() throws MalformedURLException {
//
////        WebDriverManager.chromedriver().browserVersion("74").setup();
//
//        String url = "http://127.0.0.1:4723/wd/hub";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//        caps.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
////        caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, );
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//
//        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
//
//        driver.get("https://google.com");
//    }

//    @Test
//    public void openApreInstallAppOnAndroid() throws MalformedURLException {
//        String url = "http://127.0.0.1:4723/wd/hub";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//        caps.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
//        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");
//        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
//
//        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
//
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MICROSECONDS);
//    }
}
