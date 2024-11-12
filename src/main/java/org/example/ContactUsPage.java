package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    WebDriver driver;

    //Constructor
    public ContactUsPage(WebDriver driver){this.driver = driver;}

    //contact form locators
    By contactUs = By.xpath("//i[@class='fa fa-envelope']");
    By getInTouchHeader = By.xpath("//h2[text()='Get In Touch']");
    By Name = By.xpath("//input[@name='name']");
    By email = By.xpath("//input[@name='email']");
    By subject = By.xpath("//input[@name='subject']");
    By Message = By.xpath("//textarea[@name='message']");
    By fileUpload = By.xpath("//input[@name='upload_file']");
    By subButton = By.xpath("//input[@name='submit']");
    By SuccessMessage = By.xpath("//div[@class='status alert alert-success']");
    By homebutton = By.xpath("//a[@class='btn btn-success']");



    public void ContactUsForm()
    {
        driver.findElement(contactUs).click();
        if (driver.findElement(getInTouchHeader).isDisplayed())
        {
            System.out.println("GET IN TOUCH is visible");}

        else {
            System.out.println("GET IN TOUCH is not visible");
        }
        driver.findElement(Name).sendKeys("john");
        driver.findElement(email).sendKeys("john23@gmail.com");
        driver.findElement(subject).sendKeys("abcd");
        driver.findElement(Message).sendKeys("hello");

        //To upload a file
        driver.findElement(fileUpload).sendKeys("/Users/ambikahirode/Downloads/image.png");
        driver.findElement(subButton).click();
        Alert myalert = driver.switchTo().alert();     //to handle alert with Ok/accepting
        myalert.accept();
        if (driver.findElement(SuccessMessage).isDisplayed()){
            System.out.println("success mesage is displayed");
        }
        else{
            System.out.println("no success");
        }

        driver.findElement(homebutton).click();


    }
}

