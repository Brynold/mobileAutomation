package PageObjectModel;

import helper.AndroidHelper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class loginActivity extends AndroidHelper {

    public static final Logger LOG = Logger.getLogger(loginActivity.class);

    public loginActivity(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Pre-Login Screen
    @AndroidFindBy(id = "btn_login")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "btn_create_an_account")
    private AndroidElement createAnAccountButton;

    //Login Screen
    @AndroidFindBy(id = usernameId)
    private AndroidElement cellphoneTextField;

    private static final String usernameId = "editMsisdn";
    


    public void clickOnPreLogin() {
        if (isVisible(loginButton))
            clickOn(loginButton);
    }


}
