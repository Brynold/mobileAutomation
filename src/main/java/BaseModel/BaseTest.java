package BaseModel;

import appium.AppiumServer;
import device.AndroidDriverBuilder;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;


public class BaseTest {
    AndroidDriver device;
    public static final Logger LOG = Logger.getLogger(BaseTest.class);

    @BeforeSuite
    public void setUpDataBase() {
        LOG.info(" DB IS CONNECTED...!");
    }

    public void startServer() {
        if (AppiumServer.appium == null && !AppiumServer.checkIfServerIsRunning(4723)) {
            AppiumServer.start();
            LOG.info("appium server is running: " + AppiumServer.appium.getUrl());
        } else {
            LOG.info("Appium server is already running ! ");
        }
    }

    public void stopServer() {
        if (AppiumServer.appium != null && AppiumServer.checkIfServerIsRunning(4723)) {
            AppiumServer.stop();
            LOG.info("appium server is stopped !");
        }
    }

    @Parameters({"deviceName","apk"})
    @BeforeClass
    public void setupMobileDevice(String deviceName,String apk) throws IOException {
        AppiumServer.startEmulator();
        startServer();
        device = new AndroidDriverBuilder().setUpDevice(deviceName,apk);
    }

    @AfterClass
    public void tearDown() {
        if (device != null) {
            device.quit();
            LOG.info("driver is quit ! ");
        }
    }

    @AfterSuite
    public void DBConnection() {
        stopServer();
    }

}
