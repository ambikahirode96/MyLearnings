import org.example.ContactUsPage;
import org.example.UserPage;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest{


    @Test(priority = 1)
    public void ContactUsform(){
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.ContactUsForm();


    }



}
