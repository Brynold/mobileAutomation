import BaseModel.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class praticeClassOne extends BaseTest {



//    @Test(priority = 2)
//    public void preferenceModule() throws MalformedURLException {
//        AndroidDriver<AndroidElement> driver = capability();
//        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//        driver.findElementById("android:id/checkbox").click();
//        driver.findElementsByClassName("android.widget.RelativeLayout").get(1).click();
//        driver.findElementById("android:id/edit").sendKeys("brynoldTest");
//        driver.findElementById("android:id/button1").click();
//
//
//    }
//
//    @Test(priority = 1)
//    public static void touchActionConcept() throws MalformedURLException {
//        AndroidDriver<AndroidElement> driver = capability();
//        String text = driver.findElementByAndroidUIAutomator("text(\"Text\")").getText();
//        LOG.info(text);
//        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//        /**Touch action ->*/
//        TouchAction touchAction = new TouchAction(driver);
//        AndroidElement expandableLists = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//        AndroidElement customerAdapter = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
//        AndroidElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
//        touchAction.tap(tapOptions().withElement(element(expandableLists))).perform();
//        customerAdapter.click();
//        /** LONG PRESS using touch action class */
//        touchAction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(Duration.ofSeconds(2))).release().perform();
//        /** swipe element  note */
//        touchAction.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(Duration.ofSeconds(2))).moveTo(element(peopleNames)).release().perform();
//
//
//    }
//
//    @Test(priority = 3)
//    public static void scrollByText(String[] args) throws MalformedURLException {
//        AndroidDriver<AndroidElement> driver = capability();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//        /** scroll by android ui automator in text*/
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
//
//    }
//
//    @Test(priority = 4)
//    public static void DragAndDrop(String[] args) throws MalformedURLException {
//        AndroidDriver<AndroidElement> driver = capability();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        AndroidElement one = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//        AndroidElement two = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
//        TouchAction touchAction = new TouchAction(driver);
//        /** Drag and drop */
//        touchAction.longPress(longPressOptions().withElement(element(one))).moveTo(element(two)).release().perform();
//    }

//    @Test
//    public static void k(){
//        // Show the Array
//        //
//        System.out.println("First\t Last\tAge");
//        System.out.println("----------------------");
//        for (Row printRow : rows)
//        {
//            System.out.println(
//                    printRow.getFirstName() + "\t " +
//                            printRow.getLastName() + "\t" +
//                            printRow.getAge());
//
//        }
//    }


}
