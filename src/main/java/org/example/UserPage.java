package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
    WebDriver driver;

    //constructor
    public UserPage(WebDriver driver){this.driver = driver;}

   By signIn = By.xpath("//i[@class='fa fa-lock']");
    //By name = By.name('name');
    By name = By.xpath("//input[@name='name']");
    By signEmail = By.xpath("//input[@data-qa='signup-email']");
    By signUpButton = By.xpath("//button[@data-qa='signup-button']");
    By password = By.xpath("//input[@data-qa='password']");
    By Fname = By.xpath("//input[@id='first_name']");
    By lastName = By.xpath("//input[@id='last_name']");
    By address = By.xpath("//input[@id='address1']");
    By state = By.xpath("//input[@id='state']");
    By city = By.xpath("//input[@id='city']");
    By zipCode = By.xpath("//input[@id='zipcode']");
    By mobileNo = By.xpath("//input[@id='mobile_number']");
    By submitButton = By.xpath("//button[@data-qa='create-account']");
    By continueButton = By.xpath("//a[@data-qa='continue-button']");
    By loginEmail = By.xpath("//input[@data-qa='login-email']");
    By LoginPass = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");





    public void NavigateToSigninPage(){
        driver.findElement(signIn).click();
    }


    public void UserSignIn() {
        driver.findElement(name).sendKeys("Ash");
        driver.findElement(signEmail).sendKeys("ashtest2@gamil.com");
        driver.findElement(signUpButton).click();
        driver.findElement(password).sendKeys("Ash@1234");
        driver.findElement(Fname).sendKeys("ash");
        driver.findElement(lastName).sendKeys("smith");
        driver.findElement(address).sendKeys("abcd");
        //Dropdown
        Select CountryDropdowm = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        CountryDropdowm.selectByVisibleText("India");

        driver.findElement(state).sendKeys("Goa");
        driver.findElement(city).sendKeys("Panjim");
        driver.findElement(zipCode).sendKeys("12345");
        driver.findElement(mobileNo).sendKeys("9876543211");
        driver.findElement(submitButton).click();
        driver.findElement(continueButton).click();
    }

        public void Login(){
            driver.findElement(loginEmail).sendKeys("ashtest@gamil.com");
            driver.findElement(LoginPass).sendKeys("Ash@1234");
            driver.findElement(loginButton).click();
        }




}
