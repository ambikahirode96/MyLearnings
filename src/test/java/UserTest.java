import org.example.UserPage;
import org.testng.annotations.Test;

public class UserTest extends BaseTest{

    @Test(priority = 1)
    public void UserResistration(){
        UserPage userPage = new UserPage(driver);
        userPage.NavigateToSigninPage();
        userPage.UserSignIn();
    }
    @Test(priority = 2)
    public void UserLogin() {
        UserPage userPage = new UserPage(driver);
        userPage.NavigateToSigninPage();
        userPage.Login();

    }

}
