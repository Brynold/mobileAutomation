package helper;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class AndroidHelper extends AndroidElement {
    public static final Logger LOG = Logger.getLogger(AndroidHelper.class);
    public static final int DEFAULT_TIME = 30;
    public static final long POLLING_TIME = 2;

    AndroidDriver driver;
    WebDriverWait wait;

    public AndroidHelper(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, DEFAULT_TIME, POLLING_TIME);

    }

    public String getActivity() {
        String activity = driver.currentActivity();
        LOG.info("Current Activity : " + activity);
        return activity;
    }

    public void clickOn(AndroidElement element) {
        try {
            findElementWhenReady(element).click();
        } catch (Exception e) {
            Assert.fail("unable to click element");
            e.getStackTrace();
        }
    }

    public WebElement findElementWhenReady(AndroidElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isVisible(AndroidElement by) {
        try {
            if (findElementWhenReady(by) != null) {
                return findElementWhenReady(by).isDisplayed();
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public void selectByText(String text) {
        try {
            driver.findElement(new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()." +
                    "Scrollable(true).instance(0)).ScrollIntoView(new UiSelector().textContains('" + text + "').instance(0))"));
        } catch (Exception e) {
            Assert.fail("locator not found ..!");
            e.getStackTrace();
        }
    }

    public void selectById(String idName) {
        try {
            driver.findElement(new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()." +
                    "Scrollable(true).instance(0)).ScrollIntoView(new UiSelector().resourceId('" + idName + "').instance(0))"));
        } catch (Exception e) {
            Assert.fail("locator not found ..!");
            e.getStackTrace();
        }
    }

    public void ScrollAndSelectByText(String text) {
        try {
            driver.findElement(new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()." +
                    "Scrollable(true).instance(0)).ScrollIntoView(new UiSelector().textContains('" + text + "').instance(0))")).click();
        } catch (Exception e) {
            Assert.fail("locator not found ..!");
            e.getStackTrace();
        }
    }
}
