package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","UPB2023 Android8");
        capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("appPackage","com.simplemobiletools.calendar");
        capabilities.setCapability("appActivity","com.simplemobiletools.calendar.activities.MainActivity");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

        AndroidDriver device = null;
        try {
            device = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        device.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return device;
    }
}