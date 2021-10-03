import BaseModel.BaseTest;
import PageObjectModel.loginActivity;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    public static final Logger LOG = Logger.getLogger(LoginTest.class);

   public  loginActivity LoginActivity;

    @BeforeMethod()
    public void init() {
        LoginActivity = new loginActivity();
    }

    @Test
    public void login(){
    }


}
