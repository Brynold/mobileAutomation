package device;

import Utilitle.PropertiesUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import Utilitle.PropertiesUtil;

import javax.swing.*;

import static com.sun.glass.ui.Application.getDeviceDetails;

public class AndroidDriverBuilder {
    public static final Logger LOG = Logger.getLogger(AndroidDriverBuilder.class);
    AndroidDriver<AndroidElement> driver;
           PropertiesUtil propertiesUtil=  new PropertiesUtil();

    public AndroidDriver setUpDevice(String deviceName, String apk) throws MalformedURLException {

        File folderName = new File("src/main/resources/apk");
        File apkPath = new File(folderName, propertiesUtil.getDeviceDetail(apk));
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        /** for real device*/
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,propertiesUtil.getDeviceDetail(deviceName));
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkPath.getAbsolutePath());
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability("autoGrantPermissions", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LOG.info("Android device has been created successfully ..! ");
        return driver;
    }
}
